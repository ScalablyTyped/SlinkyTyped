package typingsSlinky.officeUiFabricReact.popupTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.popupPopupMod.Popup
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopupProps extends HTMLAttributes[Popup] {
  /**
    * Defines the element id referencing the element containing the description for the popup.
    */
  var ariaDescribedBy: js.UndefOr[String] = js.native
  /**
    * Accessible label text for the popup.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    *  Defines the element id referencing the element containing label text for popup.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.native
  /**
    * A callback function for when the popup is dismissed from the close button or light dismiss. If provided, will
    * handle escape keypresses and call this. The event will be stopped/canceled.
    */
  var onDismiss: js.UndefOr[
    js.Function1[
      /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]], 
      _
    ]
  ] = js.native
  /**
    * If true, when this component is unmounted, focus will be restored to the element that had focus when the component
    * first mounted.
    * @defaultvalue true
    */
  var shouldRestoreFocus: js.UndefOr[Boolean] = js.native
}

object IPopupProps {
  @scala.inline
  def apply(): IPopupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPopupProps]
  }
  @scala.inline
  implicit class IPopupPropsOps[Self <: IPopupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaDescribedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescribedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaDescribedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescribedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabelledBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabelledBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledBy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDismiss(
      value: /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]] => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldRestoreFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRestoreFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldRestoreFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRestoreFocus")(js.undefined)
        ret
    }
  }
  
}

