package typingsSlinky.reactNavigationDrawer.drawerSidebarMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationScreenProp
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.right
import typingsSlinky.reactNavigationDrawer.typesMod.DrawerContentComponentProps
import typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerState
import typingsSlinky.reactNavigationDrawer.typesMod.SceneDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var contentComponent: js.UndefOr[ReactComponentClass[DrawerContentComponentProps]] = js.native
  
  var contentOptions: js.UndefOr[js.Object] = js.native
  
  var descriptors: SceneDescriptorMap = js.native
  
  var drawerOpenProgress: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any = js.native
  
  var drawerPosition: left | right = js.native
  
  var navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams] = js.native
  
  var screenProps: js.UndefOr[js.Any] = js.native
  
  var style: js.UndefOr[ViewStyle] = js.native
}
object Props {
  
  @scala.inline
  def apply(
    descriptors: SceneDescriptorMap,
    drawerOpenProgress: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    drawerPosition: left | right,
    navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams]
  ): Props = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], drawerOpenProgress = drawerOpenProgress.asInstanceOf[js.Any], drawerPosition = drawerPosition.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescriptors(value: SceneDescriptorMap): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawerOpenProgress(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
    ): Self = this.set("drawerOpenProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawerPosition(value: left | right): Self = this.set("drawerPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(value: NavigationScreenProp[NavigationDrawerState, NavigationParams]): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentComponentFunctionComponent(value: ReactComponentClass[DrawerContentComponentProps]): Self = this.set("contentComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentComponentComponentClass(value: ReactComponentClass[DrawerContentComponentProps]): Self = this.set("contentComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentComponent(value: ReactComponentClass[DrawerContentComponentProps]): Self = this.set("contentComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentComponent: Self = this.set("contentComponent", js.undefined)
    
    @scala.inline
    def setContentOptions(value: js.Object): Self = this.set("contentOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentOptions: Self = this.set("contentOptions", js.undefined)
    
    @scala.inline
    def setScreenProps(value: js.Any): Self = this.set("screenProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenProps: Self = this.set("screenProps", js.undefined)
    
    @scala.inline
    def setStyle(value: ViewStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
