package typingsSlinky.griddleReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.griddleReact.mod.components.TableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  @JSImport("griddle-react", "components.Table")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.griddleReact.mod.components.Table] {
    
    @scala.inline
    def NoResults(value: js.Any): this.type = set("NoResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def TableBody(value: js.Any): this.type = set("TableBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def TableHeading(value: js.Any): this.type = set("TableHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visibleRows(value: Double): this.type = set("visibleRows", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Table.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
