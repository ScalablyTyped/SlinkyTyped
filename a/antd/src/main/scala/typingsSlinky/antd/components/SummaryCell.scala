package typingsSlinky.antd.components

import typingsSlinky.rcTable.footerCellMod.SummaryCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SummaryCell {
  @JSImport("antd/lib/table", "default.Summary.Cell")
  @js.native
  object component extends js.Object
  
  def withProps(p: /* hasClassNameIndexChildrenColSpanRowSpan */ SummaryCellProps): SharedBuilder_SummaryCellProps1018071789 = new SharedBuilder_SummaryCellProps1018071789(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(index: Double): SharedBuilder_SummaryCellProps1018071789 = {
    val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    new SharedBuilder_SummaryCellProps1018071789(js.Array(this.component, __props.asInstanceOf[/* hasClassNameIndexChildrenColSpanRowSpan */ SummaryCellProps]))
  }
}

