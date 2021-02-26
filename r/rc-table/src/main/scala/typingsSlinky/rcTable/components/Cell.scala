package typingsSlinky.rcTable.components

import typingsSlinky.rcTable.footerCellMod.SummaryCellProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cell {
  
  @scala.inline
  def apply(index: Double): SharedBuilder_SummaryCellProps1018071789 = {
    val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    new SharedBuilder_SummaryCellProps1018071789(js.Array(this.component, __props.asInstanceOf[/* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps]))
  }
  
  @JSImport("rc-table", "Summary.Cell")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: /* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps): SharedBuilder_SummaryCellProps1018071789 = new SharedBuilder_SummaryCellProps1018071789(js.Array(this.component, p.asInstanceOf[js.Any]))
}
