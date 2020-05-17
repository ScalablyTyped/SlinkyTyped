package typingsSlinky.officeUiFabricReact.checkboxTypesMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.end
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.start
import typingsSlinky.react.mod.ButtonHTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckboxProps extends ButtonHTMLAttributes[HTMLElement | HTMLInputElement] {
  /**
    * ID for element that provides extended information for the checkbox.
    */
  var ariaDescribedBy: js.UndefOr[String] = js.native
  /**
    * Accessible label for the checkbox.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * ID for element that contains label information for the checkbox.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.native
  /**
    * The position in the parent set (if in a set) for aria-posinset.
    */
  var ariaPositionInSet: js.UndefOr[Double] = js.native
  /**
    * The total size of the parent set (if in a set) for aria-setsize.
    */
  var ariaSetSize: js.UndefOr[Double] = js.native
  /**
    * Allows you to set the checkbox to be at the before (start) or after (end) the label.
    * @defaultvalue 'start'
    */
  var boxSide: js.UndefOr[start | end] = js.native
  /**
    * Checked state. Mutually exclusive to "defaultChecked". Use this if you control the checked state at a higher
    * level and plan to pass in the correct value based on handling onChange events and re-rendering.
    */
  var checked: js.UndefOr[Boolean] = js.native
  /**
    * Custom icon props for the check mark rendered by the checkbox
    */
  var checkmarkIconProps: js.UndefOr[IIconProps] = js.native
  /**
    * Optional callback to access the ICheckbox interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ICheckbox]] = js.native
  /**
    * Optional uncontrolled indeterminate visual state for checkbox. Setting indeterminate state takes visual precedence
    * over checked or defaultChecked props given but does not affect checked state.
    * This is not a toggleable state. On load the checkbox will receive indeterminate visual state
    * and after the user's first click it will be removed exposing the true state of the checkbox.
    */
  var defaultIndeterminate: js.UndefOr[Boolean] = js.native
  /**
    * Optional controlled indeterminate visual state for checkbox. Setting indeterminate state takes visual precedence
    * over checked or defaultChecked props given but does not affect checked state.
    * This should not be a toggleable state. On load the checkbox will receive indeterminate visual state
    * and after the first user click it should be removed by your supplied onChange callback
    * function exposing the true state of the checkbox.
    */
  var indeterminate: js.UndefOr[Boolean] = js.native
  /**
    * Optional input props that will be mixed into the input element, *before* other props are applied. This allows
    * you to extend the input element with additional attributes, such as data-automation-id needed for automation.
    * Note that if you provide, for example, "disabled" as well as "inputProps.disabled", the former will take
    * precedence over the later.
    */
  var inputProps: js.UndefOr[ButtonHTMLAttributes[HTMLElement | HTMLButtonElement]] = js.native
  /**
    * Optional keytip for this checkbox
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.native
  /**
    * Label to display next to the checkbox.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Callback that is called when the checked value has changed.
    */
  @JSName("onChange")
  var onChange_ICheckboxProps: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[SyntheticEvent[EventTarget with (HTMLElement | HTMLInputElement), Event]], 
      /* checked */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /**
    * Custom render function for the label.
    */
  var onRenderLabel: js.UndefOr[IRenderFunction[ICheckboxProps]] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ICheckboxStyleProps, ICheckboxStyles]] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object ICheckboxProps {
  @scala.inline
  def apply(): ICheckboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckboxProps]
  }
  @scala.inline
  implicit class ICheckboxPropsOps[Self <: ICheckboxProps] (val x: Self) extends AnyVal {
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
    def withAriaPositionInSet(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaPositionInSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaPositionInSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaPositionInSet")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaSetSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaSetSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaSetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaSetSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxSide(value: start | end): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxSide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxSide")(js.undefined)
        ret
    }
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckmarkIconProps(value: IIconProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkmarkIconProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckmarkIconProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkmarkIconProps")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ ICheckbox | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[ICheckbox]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[ICheckbox]): Self = {
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
    def withDefaultIndeterminate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIndeterminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultIndeterminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIndeterminate")(js.undefined)
        ret
    }
    @scala.inline
    def withIndeterminate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indeterminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndeterminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indeterminate")(js.undefined)
        ret
    }
    @scala.inline
    def withInputProps(value: ButtonHTMLAttributes[HTMLElement | HTMLButtonElement]): Self = {
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
    def withKeytipProps(value: IKeytipProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keytipProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeytipProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keytipProps")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: (/* ev */ js.UndefOr[SyntheticEvent[EventTarget with (HTMLElement | HTMLInputElement), Event]], /* checked */ js.UndefOr[Boolean]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderLabel(
      value: (/* props */ js.UndefOr[ICheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ICheckboxProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderLabel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: ICheckboxStyleProps => Partial[ICheckboxStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[ICheckboxStyleProps, ICheckboxStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

