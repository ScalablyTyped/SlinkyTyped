package typingsSlinky.officeUiFabricReact.spinButtonTypesMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import typingsSlinky.officeUiFabricReact.PartialIButtonStyles
import typingsSlinky.officeUiFabricReact.PartialISpinButtonStyles
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsSlinky.officeUiFabricReact.positioningTypesMod.Position
import typingsSlinky.officeUiFabricReact.spinButtonClassNamesMod.ISpinButtonClassNames
import typingsSlinky.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.std.Event_
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpinButtonProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Optional prop to add a string id that can be referenced inside the aria-describedby attribute
    */
  var ariaDescribedBy: js.UndefOr[String] = js.native
  /**
    * A description of the SpinButton for the benefit of screen readers.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * The position in the parent set (if in a set) for aria-posinset.
    */
  var ariaPositionInSet: js.UndefOr[Double] = js.native
  /**
    * The total size of the parent set (if in a set) for aria-setsize.
    */
  var ariaSetSize: js.UndefOr[Double] = js.native
  /**
    * Sets the aria-valuenow of the spin button. The component must be
    * controlled by the creator who controls the value externally.
    * ariaValueNow would be the numeric form of value.
    */
  var ariaValueNow: js.UndefOr[Double] = js.native
  var ariaValueText: js.UndefOr[String] = js.native
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[ISpinButton]] = js.native
  /**
    * Accessibile label text for the decrement button for the benefit of the screen reader.
    */
  var decrementButtonAriaLabel: js.UndefOr[String] = js.native
  /**
    * Icon for the decrement button of the spinButton
    */
  var decrementButtonIcon: js.UndefOr[IIconProps] = js.native
  /**
    * The initial value of the SpinButton. Use this if you intend for the SpinButton to be an uncontrolled component.
    * This value is mutually exclusive to value. Use one or the other.
    * @defaultvalue 0
    */
  @JSName("defaultValue")
  var defaultValue_ISpinButtonProps: js.UndefOr[String] = js.native
  /**
    * Whether or not the SpinButton is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Custom styles for the downArrow button.
    *
    * Note: The buttons are in a checked state when arrow keys are used to
    * incremenent/decrement the spinButton. Use rootChecked instead of rootPressed
    * for styling when that is the case.
    */
  var downArrowButtonStyles: js.UndefOr[PartialIButtonStyles] = js.native
  /**
    * Custom function for providing the classNames for the spinbutton. Can be used to provide
    * all styles for the component instead of applying them on top of the default styles.
    */
  var getClassNames: js.UndefOr[
    js.Function6[
      /* theme */ ITheme, 
      /* disabled */ Boolean, 
      /* isFocused */ Boolean, 
      /* keyboardSpinDirection */ KeyboardSpinDirection, 
      /* labelPosition */ js.UndefOr[Position], 
      /* className */ js.UndefOr[String], 
      ISpinButtonClassNames
    ]
  ] = js.native
  /**
    * Optional iconButton props on spin button
    */
  var iconButtonProps: js.UndefOr[IButtonProps] = js.native
  /**
    * Icon that goes along with the label for the whole SpinButton
    */
  var iconProps: js.UndefOr[IIconProps] = js.native
  /**
    * Accessibile label text for the increment button for the benefit of the screen reader.
    */
  var incrementButtonAriaLabel: js.UndefOr[String] = js.native
  /**
    * Icon for the increment button of the spinButton
    */
  var incrementButtonIcon: js.UndefOr[IIconProps] = js.native
  /**
    * Optional input props on spin button
    */
  var inputProps: js.UndefOr[InputHTMLAttributes[HTMLElement | HTMLInputElement]] = js.native
  /**
    * Optional keytip for this spin button
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.native
  /**
    * Descriptive label for the SpinButton.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * @defaultvalue Left
    */
  var labelPosition: js.UndefOr[Position] = js.native
  /**
    * The max value of the SpinButton.
    * @defaultvalue 100
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * The min value of the SpinButton.
    * @defaultvalue 0
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * A callback for when the user moves the focus away from the picker
    */
  @JSName("onBlur")
  var onBlur_ISpinButtonProps: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  /**
    * This callback is triggered when the decrement button is pressed or if the user presses down arrow
    * with focus on the input of the spinButton
    * @returns If a string is returned, it will be used as the value of the SpinButton.
    */
  var onDecrement: js.UndefOr[js.Function1[/* value */ String, String | Unit]] = js.native
  /**
    * A callback for when the user put focus on the picker
    */
  @JSName("onFocus")
  var onFocus_ISpinButtonProps: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  /**
    * This callback is triggered when the increment button is pressed or if the user presses up arrow
    * with focus on the input of the spinButton
    * @returns If a string is returned, it will be used as the value of the SpinButton.
    */
  var onIncrement: js.UndefOr[js.Function1[/* value */ String, String | Unit]] = js.native
  /**
    * This callback is triggered when the value inside the SpinButton should be validated.
    * @param value - The value entered in the SpinButton to validate
    * @param event - The event that triggered this validate, if any. (For accessibility)
    * @returns If a string is returned, it will be used as the value of the SpinButton.
    */
  var onValidate: js.UndefOr[
    js.Function2[
      /* value */ String, 
      /* event */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]], 
      String | Unit
    ]
  ] = js.native
  /**
    * How many decimal places the value should be rounded to.
    * The default is calculated based on the precision of `step`: i.e. if step = 1, precision = 0.
    * step = 0.0089, precision = 4. step = 300, precision = 2. step = 23.00, precision = 2.
    */
  var precision: js.UndefOr[Double] = js.native
  /**
    * The difference between the two adjacent values of the SpinButton.
    * This value is sued to calculate the precision of the input if no
    * precision is given. The precision calculated this way will always
    * be \>= 0.
    * @defaultvalue 1
    */
  var step: js.UndefOr[Double] = js.native
  /**
    * Custom styling for individual elements within the button DOM.
    */
  var styles: js.UndefOr[PartialISpinButtonStyles] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Custom styles for the upArrow button.
    *
    * Note: The buttons are in a checked state when arrow keys are used to
    * incremenent/decrement the spinButton. Use rootChecked instead of rootPressed
    * for styling when that is the case.
    */
  var upArrowButtonStyles: js.UndefOr[PartialIButtonStyles] = js.native
  /**
    * The value of the SpinButton. Use this if you intend to pass in a new value as a result of onChange events.
    * This value is mutually exclusive to defaultValue. Use one or the other.
    */
  var value: js.UndefOr[String] = js.native
}

object ISpinButtonProps {
  @scala.inline
  def apply(): ISpinButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpinButtonProps]
  }
  @scala.inline
  implicit class ISpinButtonPropsOps[Self <: ISpinButtonProps] (val x: Self) extends AnyVal {
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
    def withAriaValueNow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaValueNow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaValueNow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaValueNow")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaValueText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaValueText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaValueText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaValueText")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ ISpinButton | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[ISpinButton]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[ISpinButton]): Self = {
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
    def withDecrementButtonAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrementButtonAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecrementButtonAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrementButtonAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDecrementButtonIcon(value: IIconProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrementButtonIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecrementButtonIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrementButtonIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
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
    def withDownArrowButtonStyles(value: PartialIButtonStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downArrowButtonStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownArrowButtonStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downArrowButtonStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withGetClassNames(
      value: (/* theme */ ITheme, /* disabled */ Boolean, /* isFocused */ Boolean, /* keyboardSpinDirection */ KeyboardSpinDirection, /* labelPosition */ js.UndefOr[Position], /* className */ js.UndefOr[String]) => ISpinButtonClassNames
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClassNames")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutGetClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClassNames")(js.undefined)
        ret
    }
    @scala.inline
    def withIconButtonProps(value: IButtonProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withIconProps(value: IIconProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconProps")(js.undefined)
        ret
    }
    @scala.inline
    def withIncrementButtonAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementButtonAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrementButtonAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementButtonAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withIncrementButtonIcon(value: IIconProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementButtonIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrementButtonIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementButtonIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withInputProps(value: InputHTMLAttributes[HTMLElement | HTMLInputElement]): Self = {
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
    def withLabelPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDecrement(value: /* value */ String => String | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDecrement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDecrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDecrement")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIncrement(value: /* value */ String => String | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIncrement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValidate(
      value: (/* value */ String, /* event */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]]) => String | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValidate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: PartialISpinButtonStyles): Self = {
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
    @scala.inline
    def withUpArrowButtonStyles(value: PartialIButtonStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upArrowButtonStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpArrowButtonStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upArrowButtonStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

