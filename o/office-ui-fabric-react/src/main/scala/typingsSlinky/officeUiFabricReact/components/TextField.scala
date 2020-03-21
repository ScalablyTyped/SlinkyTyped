package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.textarea.tag
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.textFieldTypesMod.ITextField
import typingsSlinky.officeUiFabricReact.textFieldTypesMod.ITextFieldProps
import typingsSlinky.officeUiFabricReact.textFieldTypesMod.ITextFieldStyleProps
import typingsSlinky.officeUiFabricReact.textFieldTypesMod.ITextFieldStyles
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.std.Event_
import typingsSlinky.std.HTMLInputElement
import typingsSlinky.std.HTMLTextAreaElement
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TextField
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("office-ui-fabric-react", "TextField")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLInputElement | HTMLTextAreaElement] = null,
    ariaLabel: String = null,
    autoAdjustHeight: js.UndefOr[Boolean] = js.undefined,
    borderless: js.UndefOr[Boolean] = js.undefined,
    componentRef: IRefObject[ITextField] = null,
    defaultValue: String = null,
    deferredValidationTime: Int | Double = null,
    description: String = null,
    errorMessage: String | ReactElement = null,
    iconProps: IIconProps = null,
    inputClassName: String = null,
    mask: String = null,
    maskChar: String = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    onChange: (SyntheticEvent[
      EventTarget with (org.scalajs.dom.raw.HTMLInputElement | org.scalajs.dom.raw.HTMLTextAreaElement), 
      Event_
    ], /* newValue */ js.UndefOr[String]) => Unit = null,
    onGetErrorMessage: /* value */ String => js.UndefOr[String | ReactElement | (js.Thenable[String | ReactElement])] = null,
    onNotifyValidationResult: (/* errorMessage */ String | ReactElement, /* value */ js.UndefOr[String]) => Unit = null,
    onRenderDescription: (/* props */ js.UndefOr[ITextFieldProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITextFieldProps], ReactElement | Null]]) => ReactElement | Null = null,
    onRenderLabel: (/* props */ js.UndefOr[ITextFieldProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITextFieldProps], ReactElement | Null]]) => ReactElement | Null = null,
    onRenderPrefix: (/* props */ js.UndefOr[ITextFieldProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITextFieldProps], ReactElement | Null]]) => ReactElement | Null = null,
    onRenderSuffix: (/* props */ js.UndefOr[ITextFieldProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITextFieldProps], ReactElement | Null]]) => ReactElement | Null = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[ITextFieldStyleProps, ITextFieldStyles] = null,
    suffix: String = null,
    theme: ITheme = null,
    underlined: js.UndefOr[Boolean] = js.undefined,
    validateOnFocusIn: js.UndefOr[Boolean] = js.undefined,
    validateOnFocusOut: js.UndefOr[Boolean] = js.undefined,
    validateOnLoad: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAdjustHeight)) __obj.updateDynamic("autoAdjustHeight")(autoAdjustHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (deferredValidationTime != null) __obj.updateDynamic("deferredValidationTime")(deferredValidationTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (iconProps != null) __obj.updateDynamic("iconProps")(iconProps.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskChar != null) __obj.updateDynamic("maskChar")(maskChar.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onGetErrorMessage != null) __obj.updateDynamic("onGetErrorMessage")(js.Any.fromFunction1(onGetErrorMessage))
    if (onNotifyValidationResult != null) __obj.updateDynamic("onNotifyValidationResult")(js.Any.fromFunction2(onNotifyValidationResult))
    if (onRenderDescription != null) __obj.updateDynamic("onRenderDescription")(js.Any.fromFunction2(onRenderDescription))
    if (onRenderLabel != null) __obj.updateDynamic("onRenderLabel")(js.Any.fromFunction2(onRenderLabel))
    if (onRenderPrefix != null) __obj.updateDynamic("onRenderPrefix")(js.Any.fromFunction2(onRenderPrefix))
    if (onRenderSuffix != null) __obj.updateDynamic("onRenderSuffix")(js.Any.fromFunction2(onRenderSuffix))
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(underlined)) __obj.updateDynamic("underlined")(underlined.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnFocusIn)) __obj.updateDynamic("validateOnFocusIn")(validateOnFocusIn.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnFocusOut)) __obj.updateDynamic("validateOnFocusOut")(validateOnFocusOut.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnLoad)) __obj.updateDynamic("validateOnLoad")(validateOnLoad.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.textarea.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ITextFieldProps
}

