package typingsSlinky.officeUiFabricReact.textFieldTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.std.Event_
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextFieldProps extends AllHTMLAttributes[HTMLInputElement | HTMLTextAreaElement] {
  /**
    * Aria label for the text field.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * For multiline text fields, whether or not to auto adjust text field height.
    * @defaultvalue false
    */
  var autoAdjustHeight: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the text field is borderless.
    * @defaultvalue false
    */
  var borderless: js.UndefOr[Boolean] = js.native
  /**
    * Optional callback to access the ITextField component. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ITextField]] = js.native
  /**
    * Default value of the text field. Only provide this if the text field is an uncontrolled component;
    * otherwise, use the `value` property.
    */
  @JSName("defaultValue")
  var defaultValue_ITextFieldProps: js.UndefOr[String] = js.native
  /**
    * Text field will start to validate after users stop typing for `deferredValidationTime` milliseconds.
    * Updates to this prop will not be respected.
    * @defaultvalue 200
    */
  var deferredValidationTime: js.UndefOr[Double] = js.native
  /**
    * Description displayed below the text field to provide additional details about what text to enter.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Static error message displayed below the text field. Use `onGetErrorMessage` to dynamically
    * change the error message displayed (if any) based on the current value. `errorMessage` and
    * `onGetErrorMessage` are mutually exclusive (`errorMessage` takes precedence).
    */
  var errorMessage: js.UndefOr[String | ReactElement] = js.native
  /**
    * Props for an optional icon, displayed in the far right end of the text field.
    */
  var iconProps: js.UndefOr[IIconProps] = js.native
  /**
    * Optional class name that is added specifically to the input/textarea element.
    */
  var inputClassName: js.UndefOr[String] = js.native
  /**
    * Only used by MaskedTextField:
    * The masking string that defines the mask's behavior.
    * A backslash will escape any character.
    * Special format characters are:
    * '9': [0-9]
    * 'a': [a-zA-Z]
    * '*': [a-zA-Z0-9]
    *
    * @example `Phone Number: (999) 999-9999`
    */
  var mask: js.UndefOr[String] = js.native
  /**
    * Only used by MaskedTextField:
    * The character to show in place of unfilled characters of the mask.
    * @defaultvalue '_'
    */
  var maskChar: js.UndefOr[String] = js.native
  /**
    * Only used by MaskedTextField:
    * An object defining the format characters and corresponding regexp values.
    * Default format characters: \{
    *  '9': /[0-9]/,
    *  'a': /[a-zA-Z]/,
    *  '*': /[a-zA-Z0-9]/
    * \}
    */
  var maskFormat: js.UndefOr[StringDictionary[js.RegExp]] = js.native
  /**
    * Whether or not the text field is a multiline text field.
    * @defaultvalue false
    */
  var multiline: js.UndefOr[Boolean] = js.native
  /**
    * Callback for when the input value changes.
    * This is called on both `input` and `change` events.
    * (In a later version, this will probably only be called for the `change` event.)
    */
  @JSName("onChange")
  var onChange_ITextFieldProps: js.UndefOr[
    js.Function2[
      SyntheticEvent[EventTarget with (HTMLInputElement | HTMLTextAreaElement), Event_], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  /**
    * Function used to determine whether the input value is valid and get an error message if not.
    * Mutually exclusive with the static string `errorMessage` (it will take precedence over this).
    *
    * When it returns `string | JSX.Element`:
    * - If valid, it returns empty string.
    * - If invalid, it returns the error message and the text field will
    *   show a red border and show an error message below the text field.
    *
    * When it returns `Promise<string | JSX.Element>`:
    * - The resolved value is displayed as the error message.
    * - If rejected, the value is thrown away.
    */
  var onGetErrorMessage: js.UndefOr[
    js.Function1[
      /* value */ String, 
      js.UndefOr[String | ReactElement | (js.Thenable[String | ReactElement])]
    ]
  ] = js.native
  /**
    * Function called after validation completes.
    */
  var onNotifyValidationResult: js.UndefOr[
    js.Function2[/* errorMessage */ String | ReactElement, /* value */ js.UndefOr[String], Unit]
  ] = js.native
  /**
    * Custom renderer for the description.
    */
  var onRenderDescription: js.UndefOr[IRenderFunction[ITextFieldProps]] = js.native
  /**
    * Custom renderer for the label.
    * If you don't call defaultRender, ensure that you give your custom-rendered label an id and that
    * you set the textfield's aria-labelledby prop to that id.
    */
  var onRenderLabel: js.UndefOr[IRenderFunction[ITextFieldProps]] = js.native
  /**
    * Custom render function for prefix.
    */
  var onRenderPrefix: js.UndefOr[IRenderFunction[ITextFieldProps]] = js.native
  /**
    * Custom render function for suffix.
    */
  var onRenderSuffix: js.UndefOr[IRenderFunction[ITextFieldProps]] = js.native
  /**
    * For multiline text fields, whether or not the field is resizable.
    * @defaultvalue true
    */
  var resizable: js.UndefOr[Boolean] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ITextFieldStyleProps, ITextFieldStyles]] = js.native
  /**
    * Suffix displayed after the text field contents. This is not included in the value.
    * Ensure a descriptive label is present to assist screen readers, as the value does not include the suffix.
    */
  var suffix: js.UndefOr[String] = js.native
  /**
    * Theme (provided through customization).
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Whether or not the text field is underlined.
    * @defaultvalue false
    */
  var underlined: js.UndefOr[Boolean] = js.native
  /**
    * Run validation when focus moves into the input, and **do not** validate on change.
    *
    * (Unless this prop and/or `validateOnFocusOut` is set to true, validation will run on every change.)
    * @defaultvalue false
    */
  var validateOnFocusIn: js.UndefOr[Boolean] = js.native
  /**
    * Run validation when focus moves out of the input, and **do not** validate on change.
    *
    * (Unless this prop and/or `validateOnFocusIn` is set to true, validation will run on every change.)
    * @defaultvalue false
    */
  var validateOnFocusOut: js.UndefOr[Boolean] = js.native
  /**
    * Whether validation should run when the input is initially rendered.
    * @defaultvalue true
    */
  var validateOnLoad: js.UndefOr[Boolean] = js.native
  /**
    * Current value of the text field. Only provide this if the text field is a controlled component where you
    * are maintaining its current state; otherwise, use the `defaultValue` property.
    */
  @JSName("value")
  var value_ITextFieldProps: js.UndefOr[String] = js.native
}

object ITextFieldProps {
  @scala.inline
  def apply(): ITextFieldProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextFieldProps]
  }
  @scala.inline
  implicit class ITextFieldPropsOps[Self <: ITextFieldProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAutoAdjustHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdjustHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAdjustHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdjustHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderless")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ ITextField | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[ITextField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[ITextField]): Self = {
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
    def withDeferredValidationTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferredValidationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferredValidationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferredValidationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessageReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
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
    def withInputClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskChar")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskFormat(value: StringDictionary[js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: (SyntheticEvent[EventTarget with (HTMLInputElement | HTMLTextAreaElement), Event_], /* newValue */ js.UndefOr[String]) => Unit
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
    def withOnGetErrorMessage(
      value: /* value */ String => js.UndefOr[String | ReactElement | (js.Thenable[String | ReactElement])]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetErrorMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGetErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNotifyValidationResult(value: (/* errorMessage */ String | ReactElement, /* value */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotifyValidationResult")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnNotifyValidationResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotifyValidationResult")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderDescription(
      value: (/* props */ js.UndefOr[ITextFieldProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITextFieldProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderDescription")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderLabel(
      value: (/* props */ js.UndefOr[ITextFieldProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITextFieldProps], ReactElement | Null]]) => ReactElement | Null
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
    def withOnRenderPrefix(
      value: (/* props */ js.UndefOr[ITextFieldProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITextFieldProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderPrefix")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderSuffix(
      value: (/* props */ js.UndefOr[ITextFieldProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITextFieldProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderSuffix")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: ITextFieldStyleProps => Partial[ITextFieldStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[ITextFieldStyleProps, ITextFieldStyles]): Self = {
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
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
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
    def withUnderlined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlined")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateOnFocusIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnFocusIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateOnFocusIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnFocusIn")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateOnFocusOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnFocusOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateOnFocusOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnFocusOut")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnLoad")(js.undefined)
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

