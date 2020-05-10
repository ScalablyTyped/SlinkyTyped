package typingsSlinky.blueprintjsCore.numericInputMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.left
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.none
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.right
import typingsSlinky.blueprintjsCore.propsMod.IIntentProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INumericInputProps
  extends IIntentProps
     with IProps {
  /**
    * Whether to allow only floating-point number characters in the field,
    * mimicking the native `input[type="number"]`.
    * @default true
    */
  var allowNumericCharactersOnly: js.UndefOr[Boolean] = js.native
  /**
    * The position of the buttons with respect to the input field.
    * @default Position.RIGHT
    */
  var buttonPosition: js.UndefOr[left | right | none] = js.native
  /**
    * Whether the value should be clamped to `[min, max]` on blur.
    * The value will be clamped to each bound only if the bound is defined.
    * Note that native `input[type="number"]` controls do *NOT* clamp on blur.
    * @default false
    */
  var clampValueOnBlur: js.UndefOr[Boolean] = js.native
  /**
    * Whether the input is non-interactive.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /** Whether the numeric input should take up the full width of its container. */
  var fill: js.UndefOr[Boolean] = js.native
  /**
    * Ref handler that receives HTML `<input>` element backing this component.
    */
  var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLInputElement | Null, _]] = js.native
  /**
    * If set to `true`, the input will display with larger styling.
    * This is equivalent to setting `Classes.LARGE` via className on the
    * parent control group and on the child input group.
    * @default false
    */
  var large: js.UndefOr[Boolean] = js.native
  /**
    * Name of a Blueprint UI icon (or an icon element) to render on the left side of input.
    */
  var leftIcon: js.UndefOr[IconName | MaybeElement] = js.native
  /**
    * The increment between successive values when <kbd>shift</kbd> is held.
    * Pass explicit `null` value to disable this interaction.
    * @default 10
    */
  var majorStepSize: js.UndefOr[Double | Null] = js.native
  /** The maximum value of the input. */
  var max: js.UndefOr[Double] = js.native
  /** The minimum value of the input. */
  var min: js.UndefOr[Double] = js.native
  /**
    * The increment between successive values when <kbd>alt</kbd> is held.
    * Pass explicit `null` value to disable this interaction.
    * @default 0.1
    */
  var minorStepSize: js.UndefOr[Double | Null] = js.native
  /** The callback invoked when the value changes due to a button click. */
  var onButtonClick: js.UndefOr[js.Function2[/* valueAsNumber */ Double, /* valueAsString */ String, Unit]] = js.native
  /** The callback invoked when the value changes due to typing, arrow keys, or button clicks. */
  var onValueChange: js.UndefOr[js.Function2[/* valueAsNumber */ Double, /* valueAsString */ String, Unit]] = js.native
  /** The placeholder text in the absence of any value. */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * Element to render on right side of input.
    * For best results, use a minimal button, tag, or small spinner.
    */
  var rightElement: js.UndefOr[ReactElement] = js.native
  /**
    * Whether the entire text field should be selected on focus.
    * @default false
    */
  var selectAllOnFocus: js.UndefOr[Boolean] = js.native
  /**
    * Whether the entire text field should be selected on increment.
    * @default false
    */
  var selectAllOnIncrement: js.UndefOr[Boolean] = js.native
  /**
    * The increment between successive values when no modifier keys are held.
    * @default 1
    */
  var stepSize: js.UndefOr[Double] = js.native
  /** The value to display in the input field. */
  var value: js.UndefOr[Double | String] = js.native
}

object INumericInputProps {
  @scala.inline
  def apply(): INumericInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INumericInputProps]
  }
  @scala.inline
  implicit class INumericInputPropsOps[Self <: INumericInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowNumericCharactersOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNumericCharactersOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNumericCharactersOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNumericCharactersOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonPosition(value: left | right | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withClampValueOnBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clampValueOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClampValueOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clampValueOnBlur")(js.undefined)
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
    def withFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withInputRef(value: /* ref */ HTMLInputElement | Null => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInputRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(js.undefined)
        ret
    }
    @scala.inline
    def withLarge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftIcon(value: IconName | MaybeElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIcon")(null)
        ret
    }
    @scala.inline
    def withMajorStepSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorStepSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorStepSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorStepSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorStepSizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorStepSize")(null)
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
    def withMinorStepSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorStepSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorStepSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorStepSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorStepSizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorStepSize")(null)
        ret
    }
    @scala.inline
    def withOnButtonClick(value: (/* valueAsNumber */ Double, /* valueAsString */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onButtonClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnButtonClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onButtonClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValueChange(value: (/* valueAsNumber */ Double, /* valueAsString */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnValueChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChange")(js.undefined)
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
    def withRightElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightElement")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllOnIncrement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllOnIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllOnIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllOnIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withStepSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepSize")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double | String): Self = {
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

