package typingsSlinky.reactBootstrapTable2Toolkit.components

import typingsSlinky.reactBootstrapTable2Toolkit.mod.ExportCSVButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CSVExportToggleList {
  @JSImport("react-bootstrap-table2-toolkit", "CSVExport.ToggleList")
  @js.native
  object component extends js.Object
  
  def withProps(p: ExportCSVButtonProps): SharedBuilder_ExportCSVButtonProps_1769251381 = new SharedBuilder_ExportCSVButtonProps_1769251381(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onExport: () => Unit): SharedBuilder_ExportCSVButtonProps_1769251381 = {
    val __props = js.Dynamic.literal(onExport = js.Any.fromFunction0(onExport))
    new SharedBuilder_ExportCSVButtonProps_1769251381(js.Array(this.component, __props.asInstanceOf[ExportCSVButtonProps]))
  }
}

