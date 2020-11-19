package typingsSlinky.reactNavigationDrawer.components

import slinky.core.facade.ReactElement
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationDrawer.anon.Focused
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.right
import typingsSlinky.reactNavigationDrawer.typesMod.DrawerNavigatorItemsProps
import typingsSlinky.reactNavigationDrawer.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DrawerNavigatorItems {
  
  @JSImport("react-navigation-drawer", "DrawerNavigatorItems")
  @js.native
  object component extends js.Object
  
  def withProps(p: DrawerNavigatorItemsProps): SharedBuilder_DrawerNavigatorItemsProps644699346[typingsSlinky.reactNavigationDrawer.mod.DrawerNavigatorItems] = new SharedBuilder_DrawerNavigatorItemsProps644699346[typingsSlinky.reactNavigationDrawer.mod.DrawerNavigatorItems](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    drawerPosition: left | right,
    getLabel: Scene => ReactElement,
    items: js.Array[NavigationRoute[NavigationParams]],
    onItemPress: Focused => Unit,
    renderIcon: Scene => ReactElement,
    screenProps: js.Any
  ): SharedBuilder_DrawerNavigatorItemsProps644699346[typingsSlinky.reactNavigationDrawer.mod.DrawerNavigatorItems] = {
    val __props = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], getLabel = js.Any.fromFunction1(getLabel), items = items.asInstanceOf[js.Any], onItemPress = js.Any.fromFunction1(onItemPress), renderIcon = js.Any.fromFunction1(renderIcon), screenProps = screenProps.asInstanceOf[js.Any])
    new SharedBuilder_DrawerNavigatorItemsProps644699346[typingsSlinky.reactNavigationDrawer.mod.DrawerNavigatorItems](js.Array(this.component, __props.asInstanceOf[DrawerNavigatorItemsProps]))
  }
}
