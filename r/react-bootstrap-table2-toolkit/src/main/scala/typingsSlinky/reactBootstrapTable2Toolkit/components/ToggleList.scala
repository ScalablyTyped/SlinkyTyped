package typingsSlinky.reactBootstrapTable2Toolkit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBootstrapTable2Toolkit.mod.ToggleListProps
import typingsSlinky.reactBootstrapTableNext.mod.ColumnDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToggleList {
  
  @scala.inline
  def apply(
    columns: js.Array[ColumnDescription[_, _]],
    onColumnToggle: String => Unit,
    toggles: js.Array[Boolean]
  ): Builder = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], onColumnToggle = js.Any.fromFunction1(onColumnToggle), toggles = toggles.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ToggleListProps]))
  }
  
  @JSImport("react-bootstrap-table2-toolkit", "ColumnToggle.ToggleList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def btnClassName(value: String): this.type = set("btnClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contextual(value: String): this.type = set("contextual", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToggleListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
