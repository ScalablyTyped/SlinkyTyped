package typingsSlinky.reactNavigationDrawer.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigationDrawer.typesMod.ThemedColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_DrawerNavigatorItemsProps644699346[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def activeBackgroundColor(value: String | ThemedColor): this.type = set("activeBackgroundColor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def activeItemKey(value: String): this.type = set("activeItemKey", value.asInstanceOf[js.Any])
  
  @scala.inline
  def activeItemKeyNull: this.type = set("activeItemKey", null)
  
  @scala.inline
  def activeLabelStyle(value: StyleProp[TextStyle]): this.type = set("activeLabelStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def activeLabelStyleNull: this.type = set("activeLabelStyle", null)
  
  @scala.inline
  def activeTintColor(value: String | ThemedColor): this.type = set("activeTintColor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def iconContainerStyle(value: StyleProp[ViewStyle]): this.type = set("iconContainerStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def iconContainerStyleNull: this.type = set("iconContainerStyle", null)
  
  @scala.inline
  def inactiveBackgroundColor(value: String | ThemedColor): this.type = set("inactiveBackgroundColor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def inactiveLabelStyle(value: StyleProp[TextStyle]): this.type = set("inactiveLabelStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def inactiveLabelStyleNull: this.type = set("inactiveLabelStyle", null)
  
  @scala.inline
  def inactiveTintColor(value: String | ThemedColor): this.type = set("inactiveTintColor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def itemStyle(value: StyleProp[ViewStyle]): this.type = set("itemStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def itemStyleNull: this.type = set("itemStyle", null)
  
  @scala.inline
  def itemsContainerStyle(value: StyleProp[ViewStyle]): this.type = set("itemsContainerStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def itemsContainerStyleNull: this.type = set("itemsContainerStyle", null)
  
  @scala.inline
  def labelStyle(value: StyleProp[TextStyle]): this.type = set("labelStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def labelStyleNull: this.type = set("labelStyle", null)
}
