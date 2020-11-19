package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.anon.PickListStyleBriefBriefTe
import typingsSlinky.antDesignReactNative.listItemMod.BriefProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Brief {
  
  @JSImport("@ant-design/react-native/lib/list/ListItem", "Brief")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.listItemMod.Brief] {
    
    @scala.inline
    def style(value: StyleProp[TextStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def styles(value: Partial[PickListStyleBriefBriefTe]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrap(value: Boolean): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BriefProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Brief.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
