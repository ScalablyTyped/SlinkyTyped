package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.tabBarMod.TabBarNativeProps
import typingsSlinky.antDesignReactNative.tabBarMod.default
import typingsSlinky.antDesignReactNative.tabBarStyleMod.TabBarStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabBar {
  @JSImport("@ant-design/react-native/lib/tab-bar", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def barTintColor(value: String): this.type = set("barTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def styles(value: TabBarStyle): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def swipeable(value: Boolean): this.type = set("swipeable", value.asInstanceOf[js.Any])
    @scala.inline
    def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def unselectedTintColor(value: String): this.type = set("unselectedTintColor", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabBarNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TabBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

