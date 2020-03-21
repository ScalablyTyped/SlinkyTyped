package typingsSlinky.reactNavigationMaterialBottomTabs.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigation.mod.NavigationProp
import typingsSlinky.reactNavigationMaterialBottomTabs.AnonTintColor
import typingsSlinky.reactNavigationMaterialBottomTabs.materialBottomTabViewMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MaterialBottomTabView
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-navigation-material-bottom-tabs/lib/typescript/src/views/MaterialBottomTabView", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    navigation: NavigationProp[_],
    renderIcon: AnonTintColor => TagMod[Any],
    activeColorDark: String = null,
    activeColorLight: String = null,
    barStyleDark: StyleProp[ViewStyle] = null,
    barStyleLight: StyleProp[ViewStyle] = null,
    inactiveColorDark: String = null,
    inactiveColorLight: String = null,
    screenProps: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], renderIcon = js.Any.fromFunction1(renderIcon))
    if (activeColorDark != null) __obj.updateDynamic("activeColorDark")(activeColorDark.asInstanceOf[js.Any])
    if (activeColorLight != null) __obj.updateDynamic("activeColorLight")(activeColorLight.asInstanceOf[js.Any])
    if (barStyleDark != null) __obj.updateDynamic("barStyleDark")(barStyleDark.asInstanceOf[js.Any])
    if (barStyleLight != null) __obj.updateDynamic("barStyleLight")(barStyleLight.asInstanceOf[js.Any])
    if (inactiveColorDark != null) __obj.updateDynamic("inactiveColorDark")(inactiveColorDark.asInstanceOf[js.Any])
    if (inactiveColorLight != null) __obj.updateDynamic("inactiveColorLight")(inactiveColorLight.asInstanceOf[js.Any])
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactNavigationMaterialBottomTabs.materialBottomTabViewMod.Props
}

