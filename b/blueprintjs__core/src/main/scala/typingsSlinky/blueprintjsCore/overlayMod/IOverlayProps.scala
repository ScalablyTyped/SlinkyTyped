package typingsSlinky.blueprintjsCore.overlayMod

import typingsSlinky.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverlayProps
  extends IOverlayableProps
     with IBackdropProps
     with IProps {
  /**
    * Toggles the visibility of the overlay and its children.
    * This prop is required because the component is controlled.
    */
  var isOpen: Boolean = js.native
  /**
    * Name of the transition for internal `CSSTransition`.
    * Providing your own name here will require defining new CSS transition properties.
    * @default Classes.OVERLAY
    */
  var transitionName: js.UndefOr[String] = js.native
}

object IOverlayProps {
  @scala.inline
  def apply(isOpen: Boolean): IOverlayProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverlayProps]
  }
  @scala.inline
  implicit class IOverlayPropsOps[Self <: IOverlayProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(js.undefined)
        ret
    }
  }
  
}

