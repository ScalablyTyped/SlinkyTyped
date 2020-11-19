package typingsSlinky.griddleReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.griddleReact.mod.components.TableBodyProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableBody {
  
  @JSImport("griddle-react", "components.TableBody")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.griddleReact.mod.components.TableBody] {
    
    @scala.inline
    def Row(value: js.Any): this.type = set("Row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowIdsVarargs(value: Double*): this.type = set("rowIds", js.Array(value :_*))
    
    @scala.inline
    def rowIds(value: js.Array[Double]): this.type = set("rowIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableBodyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TableBody.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
