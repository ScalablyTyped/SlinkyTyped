package typingsSlinky.officeUiFabricReact.focusTrapZoneTypesMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFocusTrapZoneProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Sets the aria-labelledby attribute.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the IFocusTrapZone interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IFocusTrapZone]] = js.native
  /**
    * Do not put focus onto the first element inside the focus trap zone.
    * @defaultvalue false
    */
  var disableFirstFocus: js.UndefOr[Boolean] = js.native
  /**
    * Whether to disable the FocusTrapZone's focus trapping behavior.
    * @defaultvalue false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Sets the element to focus on when exiting the FocusTrapZone.
    * @defaultvalue The `element.target` that triggered the FTZ.
    */
  var elementToFocusOnDismiss: js.UndefOr[HTMLElement] = js.native
  /**
    * Class name (not actual selector) for first focusable item. Do not append a dot.
    * Only applies if `focusPreviouslyFocusedInnerElement` is false.
    */
  var firstFocusableSelector: js.UndefOr[String | js.Function0[String]] = js.native
  /**
    * Specifies which descendant element to focus when `focus()` is called.
    * If false, use the first focusable descendant, filtered by the `firstFocusableSelector` property if present.
    * If true, use the element that was focused when the trap zone last had a focused descendant
    * (or fall back to the first focusable descendant if the trap zone has never been focused).
    * @defaultvalue false
    */
  var focusPreviouslyFocusedInnerElement: js.UndefOr[Boolean] = js.native
  /**
    * Whether the focus trap zone should force focus to stay inside of it.
    * @defaultvalue true
    */
  var forceFocusInsideTrap: js.UndefOr[Boolean] = js.native
  /**
    * If false (the default), the trap zone will restore focus to the element which activated it
    * once the trap zone is unmounted or disabled. Set to true to disable this behavior.
    * @defaultvalue false
    */
  var ignoreExternalFocusing: js.UndefOr[Boolean] = js.native
  /**
    * Whether clicks are allowed outside this FocusTrapZone.
    * @defaultvalue false
    */
  var isClickableOutsideFocusTrap: js.UndefOr[Boolean] = js.native
}

object IFocusTrapZoneProps {
  @scala.inline
  def apply(): IFocusTrapZoneProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFocusTrapZoneProps]
  }
  @scala.inline
  implicit class IFocusTrapZonePropsOps[Self <: IFocusTrapZoneProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withComponentRefFunction1(value: /* ref */ IFocusTrapZone | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IFocusTrapZone]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IFocusTrapZone]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableFirstFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFirstFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFirstFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFirstFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
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
    def withFocusPreviouslyFocusedInnerElement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusPreviouslyFocusedInnerElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusPreviouslyFocusedInnerElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusPreviouslyFocusedInnerElement")(js.undefined)
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

