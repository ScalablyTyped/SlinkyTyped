package typingsSlinky.reactDashNavigationDashDrawer.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.DrawerContentComponentProps
import typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.NavigationDrawerState
import typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.SceneDescriptorMap
import typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerSidebarMod.default
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.left
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerSidebar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-navigation-drawer/lib/typescript/src/views/DrawerSidebar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    descriptors: SceneDescriptorMap,
    drawerOpenProgress: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    drawerPosition: left | right,
    navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams],
    contentComponent: ReactComponentClass[DrawerContentComponentProps] = null,
    contentOptions: js.Object = null,
    screenProps: js.Any = null,
    style: ViewStyle = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], drawerOpenProgress = drawerOpenProgress.asInstanceOf[js.Any], drawerPosition = drawerPosition.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any])
    if (contentComponent != null) __obj.updateDynamic("contentComponent")(contentComponent.asInstanceOf[js.Any])
    if (contentOptions != null) __obj.updateDynamic("contentOptions")(contentOptions.asInstanceOf[js.Any])
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerSidebarMod.Props
}

