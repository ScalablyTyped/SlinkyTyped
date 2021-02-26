package typingsSlinky.recharts.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.recharts.mod.ResponsiveContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResponsiveContainer {
  
  @JSImport("recharts", "ResponsiveContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.recharts.mod.ResponsiveContainer] {
    
    @scala.inline
    def aspect(value: Double): this.type = set("aspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String | Double): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def debounce(value: Double): this.type = set("debounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: String | Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String | Double): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxHeight(value: String | Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minHeight(value: String | Double): this.type = set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minWidth(value: String | Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ResponsiveContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ResponsiveContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
