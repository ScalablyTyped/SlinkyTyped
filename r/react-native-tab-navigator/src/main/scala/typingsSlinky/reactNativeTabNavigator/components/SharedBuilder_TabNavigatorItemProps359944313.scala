package typingsSlinky.reactNativeTabNavigator.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_TabNavigatorItemProps359944313[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def allowFontScaling(value: Boolean): this.type = set("allowFontScaling", value.asInstanceOf[js.Any])
  
  @scala.inline
  def badgeText(value: String | Double): this.type = set("badgeText", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
  
  @scala.inline
  def renderBadge(value: () => ReactElement): this.type = set("renderBadge", js.Any.fromFunction0(value))
  
  @scala.inline
  def renderIcon(value: () => ReactElement): this.type = set("renderIcon", js.Any.fromFunction0(value))
  
  @scala.inline
  def renderSelectedIcon(value: () => ReactElement): this.type = set("renderSelectedIcon", js.Any.fromFunction0(value))
  
  @scala.inline
  def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
  
  @scala.inline
  def selectedTitleStyle(value: TextStyle): this.type = set("selectedTitleStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tabStyle(value: ViewStyle): this.type = set("tabStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  
  @scala.inline
  def titleStyle(value: TextStyle): this.type = set("titleStyle", value.asInstanceOf[js.Any])
}
