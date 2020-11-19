package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.anon.PickCardStylebody
import typingsSlinky.antDesignReactNative.cardBodyMod.CardBodyProps
import typingsSlinky.antDesignReactNative.cardBodyMod.default
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardBody {
  
  @JSImport("@ant-design/react-native/lib/card/CardBody", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def styles(value: Partial[PickCardStylebody]): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CardBodyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: CardBody.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
