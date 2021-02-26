package typingsSlinky.inkDivider.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.inkDivider.mod.DividerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InkDivider {
  
  @JSImport("ink-divider", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def dividerChar(value: String): this.type = set("dividerChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dividerColor(value: String): this.type = set("dividerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def padding(value: Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleColor(value: String): this.type = set("titleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titlePadding(value: Double): this.type = set("titlePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InkDivider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DividerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
