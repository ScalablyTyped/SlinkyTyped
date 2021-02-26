package typingsSlinky.reactHighlight.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactHighlight.mod.HighlightProps
import typingsSlinky.reactHighlight.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactHighlight {
  
  @JSImport("react-highlight", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerHTML(value: Boolean): this.type = set("innerHTML", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactHighlight.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HighlightProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
