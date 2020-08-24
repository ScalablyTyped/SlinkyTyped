package typingsSlinky.reactNavigationDrawer.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationScreenProp
import typingsSlinky.reactNavigationDrawer.drawerSidebarMod.Props
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.right
import typingsSlinky.reactNavigationDrawer.typesMod.DrawerContentComponentProps
import typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerState
import typingsSlinky.reactNavigationDrawer.typesMod.SceneDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerSidebar {
  @JSImport("react-navigation-drawer", "DrawerSidebar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNavigationDrawer.mod.DrawerSidebar] {
    @scala.inline
    def contentComponentFunctionComponent(value: ReactComponentClass[DrawerContentComponentProps]): this.type = set("contentComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def contentComponentComponentClass(value: ReactComponentClass[DrawerContentComponentProps]): this.type = set("contentComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def contentComponent(value: ReactComponentClass[DrawerContentComponentProps]): this.type = set("contentComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def contentOptions(value: js.Object): this.type = set("contentOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def screenProps(value: js.Any): this.type = set("screenProps", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    descriptors: SceneDescriptorMap,
    drawerOpenProgress: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    drawerPosition: left | right,
    navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams]
  ): Builder = {
    val __props = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], drawerOpenProgress = drawerOpenProgress.asInstanceOf[js.Any], drawerPosition = drawerPosition.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

