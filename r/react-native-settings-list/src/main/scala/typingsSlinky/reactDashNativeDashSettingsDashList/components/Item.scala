package typingsSlinky.reactDashNativeDashSettingsDashList.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.ImageStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashSettingsDashList.reactDashNativeDashSettingsDashListMod.ItemProps
import typingsSlinky.reactDashNativeDashSettingsDashList.reactDashNativeDashSettingsDashListStrings.Both
import typingsSlinky.reactDashNativeDashSettingsDashList.reactDashNativeDashSettingsDashListStrings.Bottom
import typingsSlinky.reactDashNativeDashSettingsDashList.reactDashNativeDashSettingsDashListStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Item
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashSettingsDashList.reactDashNativeDashSettingsDashListMod.default.Item
    ] {
  @JSImport("react-native-settings-list", "default.Item")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    arrowIcon: TagMod[Any] = null,
    arrowStyle: StyleProp[ImageStyle] = null,
    authPropsPW: js.Object = null,
    authPropsUser: js.Object = null,
    backgroundColor: String = null,
    borderHide: Top | Bottom | Both = null,
    editableTextStyle: StyleProp[TextStyle] = null,
    hasNavArrow: js.UndefOr[Boolean] = js.undefined,
    hasSwitch: js.UndefOr[Boolean] = js.undefined,
    icon: TagMod[Any] = null,
    isAuth: js.UndefOr[Boolean] = js.undefined,
    itemBoxStyle: StyleProp[ViewStyle] = null,
    itemRef: () => Unit = null,
    itemWidth: Int | Double = null,
    onLongPress: () => Unit = null,
    onPress: () => Unit = null,
    rightSideContent: TagMod[Any] = null,
    rightSideStyle: StyleProp[ViewStyle] = null,
    switchOnValueChange: () => Unit = null,
    switchProps: js.Object = null,
    switchState: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    titleBoxStyle: StyleProp[ViewStyle] = null,
    titleInfo: String = null,
    titleInfoPosition: String = null,
    titleInfoStyle: StyleProp[TextStyle] = null,
    titleStyle: StyleProp[TextStyle] = null,
    underlayColor: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashSettingsDashList.reactDashNativeDashSettingsDashListMod.default.Item
  ] = {
    val __obj = js.Dynamic.literal()
    if (arrowIcon != null) __obj.updateDynamic("arrowIcon")(arrowIcon.asInstanceOf[js.Any])
    if (arrowStyle != null) __obj.updateDynamic("arrowStyle")(arrowStyle.asInstanceOf[js.Any])
    if (authPropsPW != null) __obj.updateDynamic("authPropsPW")(authPropsPW.asInstanceOf[js.Any])
    if (authPropsUser != null) __obj.updateDynamic("authPropsUser")(authPropsUser.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderHide != null) __obj.updateDynamic("borderHide")(borderHide.asInstanceOf[js.Any])
    if (editableTextStyle != null) __obj.updateDynamic("editableTextStyle")(editableTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hasNavArrow)) __obj.updateDynamic("hasNavArrow")(hasNavArrow.asInstanceOf[js.Any])
    if (!js.isUndefined(hasSwitch)) __obj.updateDynamic("hasSwitch")(hasSwitch.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isAuth)) __obj.updateDynamic("isAuth")(isAuth.asInstanceOf[js.Any])
    if (itemBoxStyle != null) __obj.updateDynamic("itemBoxStyle")(itemBoxStyle.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(js.Any.fromFunction0(itemRef))
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (rightSideContent != null) __obj.updateDynamic("rightSideContent")(rightSideContent.asInstanceOf[js.Any])
    if (rightSideStyle != null) __obj.updateDynamic("rightSideStyle")(rightSideStyle.asInstanceOf[js.Any])
    if (switchOnValueChange != null) __obj.updateDynamic("switchOnValueChange")(js.Any.fromFunction0(switchOnValueChange))
    if (switchProps != null) __obj.updateDynamic("switchProps")(switchProps.asInstanceOf[js.Any])
    if (!js.isUndefined(switchState)) __obj.updateDynamic("switchState")(switchState.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleBoxStyle != null) __obj.updateDynamic("titleBoxStyle")(titleBoxStyle.asInstanceOf[js.Any])
    if (titleInfo != null) __obj.updateDynamic("titleInfo")(titleInfo.asInstanceOf[js.Any])
    if (titleInfoPosition != null) __obj.updateDynamic("titleInfoPosition")(titleInfoPosition.asInstanceOf[js.Any])
    if (titleInfoStyle != null) __obj.updateDynamic("titleInfoStyle")(titleInfoStyle.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashSettingsDashList.reactDashNativeDashSettingsDashListMod.default.Item
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashSettingsDashList.reactDashNativeDashSettingsDashListMod.default.Item](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ItemProps
}

