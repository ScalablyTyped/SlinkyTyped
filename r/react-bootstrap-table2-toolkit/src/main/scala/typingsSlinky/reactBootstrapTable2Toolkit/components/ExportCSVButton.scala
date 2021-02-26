package typingsSlinky.reactBootstrapTable2Toolkit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactBootstrapTable2Toolkit.mod.ExportCSVButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExportCSVButton {
  
  @scala.inline
  def apply(onExport: () => Unit): Builder = {
    val __props = js.Dynamic.literal(onExport = js.Any.fromFunction0(onExport))
    new Builder(js.Array(this.component, __props.asInstanceOf[ExportCSVButtonProps]))
  }
  
  @JSImport("react-bootstrap-table2-toolkit", "CSVExport.ExportCSVButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ExportCSVButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
