package typingsSlinky.officeUiFabricReact.iaccessiblepopuppropsMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccessiblePopupProps extends js.Object {
  /**
    * Aria label on close button.
    */
  var closeButtonAriaLabel: js.UndefOr[String] = js.native
  /**
    * Sets the element to focus on when exiting the control's FocusTrapZone.
    * @defaultvalue The `element.target` that triggered the control opening.
    */
  var elementToFocusOnDismiss: js.UndefOr[HTMLElement] = js.native
  /**
    * Class name (not actual selector) for first focusable item. Do not append a dot.
    */
  var firstFocusableSelector: js.UndefOr[String | js.Function0[String]] = js.native
  /**
    * Whether control should force focus inside its focus trap zone.
    * @defaultvalue true
    */
  var forceFocusInsideTrap: js.UndefOr[Boolean] = js.native
  /**
    * If false (the default), the control's FocusTrapZone will restore focus to the element which
    * activated it once the trap zone is unmounted or disabled. Set to true to disable this behavior.
    * @defaultvalue false
    */
  var ignoreExternalFocusing: js.UndefOr[Boolean] = js.native
  /**
    * Whether this control will allow clicks outside its FocusTrapZone.
    * @defaultvalue false
    */
  var isClickableOutsideFocusTrap: js.UndefOr[Boolean] = js.native
}

object IAccessiblePopupProps {
  @scala.inline
  def apply(): IAccessiblePopupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccessiblePopupProps]
  }
  @scala.inline
  implicit class IAccessiblePopupPropsOps[Self <: IAccessiblePopupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseButtonAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseButtonAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withElementToFocusOnDismiss(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementToFocusOnDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementToFocusOnDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementToFocusOnDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstFocusableSelectorFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstFocusableSelector")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFirstFocusableSelector(value: String | js.Function0[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstFocusableSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstFocusableSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstFocusableSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withForceFocusInsideTrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFocusInsideTrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceFocusInsideTrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFocusInsideTrap")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreExternalFocusing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreExternalFocusing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreExternalFocusing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreExternalFocusing")(js.undefined)
        ret
    }
    @scala.inline
    def withIsClickableOutsideFocusTrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClickableOutsideFocusTrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsClickableOutsideFocusTrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClickableOutsideFocusTrap")(js.undefined)
        ret
    }
  }
  
}

