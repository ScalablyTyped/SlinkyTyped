package typingsSlinky.blueprintjsCore.cardMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.blueprintjsCore.elevationMod.Elevation
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
trait ICardProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Controls the intensity of the drop shadow beneath the card: the higher
    * the elevation, the higher the drop shadow. At elevation `0`, no drop
    * shadow is applied.
    *
    * @default 0
    */
  var elevation: js.UndefOr[Elevation] = js.native
  /**
    * Whether the card should respond to user interactions. If set to `true`,
    * hovering over the card will increase the card's elevation
    * and change the mouse cursor to a pointer.
    *
    * Recommended when `onClick` is also defined.
    *
    * @default false
    */
  var interactive: js.UndefOr[Boolean] = js.native
  /**
    * Callback invoked when the card is clicked.
    * Recommended when `interactive` is `true`.
    */
  @JSName("onClick")
  var onClick_ICardProps: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLDivElement], Unit]] = js.native
}

object ICardProps {
  @scala.inline
  def apply(): ICardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICardProps]
  }
  @scala.inline
  implicit class ICardPropsOps[Self <: ICardProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElevation(value: Elevation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElevation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* e */ SyntheticMouseEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
  }
  
}

