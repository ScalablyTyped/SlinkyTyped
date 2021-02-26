package typingsSlinky.bizcharts.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.bizcharts.anon.X
import typingsSlinky.bizcharts.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object View {
  
  @JSImport("bizcharts", "View")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.bizcharts.mod.View] {
    
    @scala.inline
    def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def data(value: js.Any): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def end(value: X): this.type = set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filter(value: js.Array[_]): this.type = set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterVarargs(value: js.Any*): this.type = set("filter", js.Array(value :_*))
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def start(value: X): this.type = set("start", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: View.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
