package typingsSlinky.reactNativeSvg.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeSvg.mod.NumberProp
import typingsSlinky.reactNativeSvg.mod.SymbolCls
import typingsSlinky.reactNativeSvg.mod.SymbolProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Symbol {
  
  @JSImport("react-native-svg", "Symbol")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, SymbolCls] {
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def opacity(value: NumberProp): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preserveAspectRatio(value: String): this.type = set("preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def viewBox(value: String): this.type = set("viewBox", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Symbol.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SymbolProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
