package typingsSlinky.reactNativeMaterialDesignSearchbar.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.ReturnKeyType
import typingsSlinky.reactNative.mod.ReturnKeyTypeAndroid
import typingsSlinky.reactNative.mod.ReturnKeyTypeIOS
import typingsSlinky.reactNative.mod.TextInputProps
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNativeMaterialDesignSearchbar.mod.SearchBarProps
import typingsSlinky.reactNativeMaterialDesignSearchbar.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeMaterialDesignSearchbar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-material-design-searchbar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: placeholder */
  def apply(
    height: Double,
    alwaysShowBackButton: js.UndefOr[Boolean] = js.undefined,
    autoCorrect: js.UndefOr[Boolean] = js.undefined,
    iconBackName: String = null,
    iconCloseName: String = null,
    iconColor: String = null,
    iconPadding: Int | Double = null,
    iconSearchName: String = null,
    iconSize: Int | Double = null,
    inputProps: TextInputProps = null,
    inputStyle: TextStyle = null,
    onBackPress: () => Unit = null,
    onBlur: () => Unit = null,
    onClose: () => Unit = null,
    onEndEditing: () => Unit = null,
    onFocus: () => Unit = null,
    onSearchChange: /* text */ String => Unit = null,
    onSubmitEditing: () => Unit = null,
    padding: Int | Double = null,
    placeholderColor: String = null,
    returnKeyType: ReturnKeyType | ReturnKeyTypeAndroid | ReturnKeyTypeIOS = null,
    textStyle: TextStyle = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysShowBackButton)) __obj.updateDynamic("alwaysShowBackButton")(alwaysShowBackButton.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (iconBackName != null) __obj.updateDynamic("iconBackName")(iconBackName.asInstanceOf[js.Any])
    if (iconCloseName != null) __obj.updateDynamic("iconCloseName")(iconCloseName.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (iconPadding != null) __obj.updateDynamic("iconPadding")(iconPadding.asInstanceOf[js.Any])
    if (iconSearchName != null) __obj.updateDynamic("iconSearchName")(iconSearchName.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (onBackPress != null) __obj.updateDynamic("onBackPress")(js.Any.fromFunction0(onBackPress))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onEndEditing != null) __obj.updateDynamic("onEndEditing")(js.Any.fromFunction0(onEndEditing))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(js.Any.fromFunction1(onSearchChange))
    if (onSubmitEditing != null) __obj.updateDynamic("onSubmitEditing")(js.Any.fromFunction0(onSubmitEditing))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (placeholderColor != null) __obj.updateDynamic("placeholderColor")(placeholderColor.asInstanceOf[js.Any])
    if (returnKeyType != null) __obj.updateDynamic("returnKeyType")(returnKeyType.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SearchBarProps
}

