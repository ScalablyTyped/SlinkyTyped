package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.beforeAfterWrapperMod.BeforeAfterWrapperProps
import typingsSlinky.materialUi.beforeAfterWrapperMod.default
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BeforeAfterWrapper {
  
  @JSImport("material-ui/internal/BeforeAfterWrapper", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def afterElementType(value: String): this.type = set("afterElementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def afterStyle(value: CSSProperties): this.type = set("afterStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def beforeElementType(value: String): this.type = set("beforeElementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def beforeStyle(value: CSSProperties): this.type = set("beforeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def elementType(value: String): this.type = set("elementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: BeforeAfterWrapper.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BeforeAfterWrapperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
