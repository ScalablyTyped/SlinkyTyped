package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.tabBarItemMod.TabBarItemProps
import typingsSlinky.antDesignReactNative.tabBarMod.TabBarNativeProps
import typingsSlinky.antDesignReactNative.tabBarStyleMod.TabBarStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabBar {
  
  object Item {
    
    @scala.inline
    def apply(title: String): SharedBuilder_TabBarItemProps248044842[typingsSlinky.antDesignReactNative.mod.TabBar.Item] = {
      val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      new SharedBuilder_TabBarItemProps248044842[typingsSlinky.antDesignReactNative.mod.TabBar.Item](js.Array(this.component, __props.asInstanceOf[TabBarItemProps]))
    }
    
    @JSImport("@ant-design/react-native", "TabBar.Item")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: TabBarItemProps): SharedBuilder_TabBarItemProps248044842[typingsSlinky.antDesignReactNative.mod.TabBar.Item] = new SharedBuilder_TabBarItemProps248044842[typingsSlinky.antDesignReactNative.mod.TabBar.Item](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@ant-design/react-native", "TabBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.mod.TabBar] {
    
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
  
  implicit def make(companion: TabBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabBarNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
