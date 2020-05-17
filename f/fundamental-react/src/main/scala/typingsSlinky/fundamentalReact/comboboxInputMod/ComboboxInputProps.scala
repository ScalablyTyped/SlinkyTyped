package typingsSlinky.fundamentalReact.comboboxInputMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.fundamentalReact.anon.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComboboxInputProps
  extends /* x */ StringDictionary[js.Any] {
  var buttonProps: js.UndefOr[js.Object] = js.native
  var className: js.UndefOr[String] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var disableStyles: js.UndefOr[Boolean] = js.native
  var inputProps: js.UndefOr[js.Object] = js.native
  var list: TagMod[Any] = js.native
  /* An object containing a `Menu` component. */
  var menu: ReactElement = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLDivElement], Unit]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var popoverProps: js.UndefOr[js.Object] = js.native
  var validationState: js.UndefOr[State] = js.native
}

object ComboboxInputProps {
  @scala.inline
  def apply(menu: ReactElement): ComboboxInputProps = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboboxInputProps]
  }
  @scala.inline
  implicit class ComboboxInputPropsOps[Self <: ComboboxInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMenu(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withInputProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(js.undefined)
        ret
    }
    @scala.inline
    def withList(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* event */ SyntheticMouseEvent[HTMLDivElement] => Unit): Self = {
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
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPopoverProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopoverProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverProps")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationState")(js.undefined)
        ret
    }
  }
  
}

