package typingsSlinky.reactNavigationDrawer.components

import slinky.core.TagMod
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationDrawer.AnonFocused
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.right
import typingsSlinky.reactNavigationDrawer.typesMod.DrawerNavigatorItemsProps
import typingsSlinky.reactNavigationDrawer.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerItems {
  @JSImport("react-navigation-drawer", "DrawerItems")
  @js.native
  object component extends js.Object
  
  def withProps(p: DrawerNavigatorItemsProps): SharedBuilder_DrawerNavigatorItemsProps644699346[typingsSlinky.reactNavigationDrawer.mod.DrawerItems] = new SharedBuilder_DrawerNavigatorItemsProps644699346[typingsSlinky.reactNavigationDrawer.mod.DrawerItems](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    drawerPosition: left | right,
    getLabel: Scene => TagMod[Any],
    items: js.Array[NavigationRoute[NavigationParams]],
    onItemPress: AnonFocused => Unit,
    renderIcon: Scene => TagMod[Any],
    screenProps: js.Any
  ): SharedBuilder_DrawerNavigatorItemsProps644699346[typingsSlinky.reactNavigationDrawer.mod.DrawerItems] = {
    val __props = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], getLabel = js.Any.fromFunction1(getLabel), items = items.asInstanceOf[js.Any], onItemPress = js.Any.fromFunction1(onItemPress), renderIcon = js.Any.fromFunction1(renderIcon), screenProps = screenProps.asInstanceOf[js.Any])
    new SharedBuilder_DrawerNavigatorItemsProps644699346[typingsSlinky.reactNavigationDrawer.mod.DrawerItems](js.Array(this.component, __props.asInstanceOf[DrawerNavigatorItemsProps]))
  }
}

