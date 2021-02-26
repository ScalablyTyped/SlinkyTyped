package typingsSlinky.antDesignReactNative.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.libStyleMod.Theme
import typingsSlinky.antDesignReactNative.tabBarPropsTypeMod.TabBarIcon
import typingsSlinky.antDesignReactNative.tabBarStyleMod.TabBarStyle
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_TabBarItemProps248044842[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def badge(value: String | Double): this.type = set("badge", value.asInstanceOf[js.Any])
  
  @scala.inline
  def icon(value: TabBarIcon): this.type = set("icon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def iconStyle(value: StyleProp[ImageStyle]): this.type = set("iconStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def iconStyleNull: this.type = set("iconStyle", null)
  
  @scala.inline
  def iconVarargs(value: ImageURISource*): this.type = set("icon", js.Array(value :_*))
  
  @scala.inline
  def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
  
  @scala.inline
  def renderAsOriginal(value: Boolean): this.type = set("renderAsOriginal", value.asInstanceOf[js.Any])
  
  @scala.inline
  def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
  
  @scala.inline
  def selectedIcon(value: TabBarIcon): this.type = set("selectedIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def selectedIconReactElement(value: ReactElement): this.type = set("selectedIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def selectedIconVarargs(value: ImageURISource*): this.type = set("selectedIcon", js.Array(value :_*))
  
  @scala.inline
  def styles(value: ReturnType[js.Function1[/* theme */ Theme, TabBarStyle]]): this.type = set("styles", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def unselectedTintColor(value: String): this.type = set("unselectedTintColor", value.asInstanceOf[js.Any])
}
