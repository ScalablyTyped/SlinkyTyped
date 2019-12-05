package typingsSlinky.rcDashTable

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcDashTable.libInterfaceMod.ExpandedRowRender
import typingsSlinky.rcDashTable.libInterfaceMod.FixedType
import typingsSlinky.rcDashTable.libInterfaceMod.Key
import typingsSlinky.rcDashTable.libInterfaceMod.LegacyFunction
import typingsSlinky.rcDashTable.libInterfaceMod.RenderExpandIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/ExpandableRow", JSImport.Namespace)
@js.native
object libExpandableRowMod extends js.Object {
  @js.native
  trait ExpandableRowProps[ValueType] extends js.Object {
    var childrenColumnName: js.UndefOr[String] = js.native
    var expandIcon: js.UndefOr[RenderExpandIcon[ValueType]] = js.native
    var expandIconAsCell: js.UndefOr[Boolean] = js.native
    var expandIconColumnIndex: js.UndefOr[Double] = js.native
    var expandRowByClick: js.UndefOr[Boolean] = js.native
    var expanded: Boolean = js.native
    var expandedRowRender: js.UndefOr[ExpandedRowRender[ValueType]] = js.native
    var fixed: js.UndefOr[FixedType] = js.native
    var indentSize: js.UndefOr[Double] = js.native
    var needIndentSpaced: Boolean = js.native
    var onRowClick: js.UndefOr[LegacyFunction[ValueType]] = js.native
    var prefixCls: String = js.native
    var record: ValueType = js.native
    var rowKey: Key = js.native
    def children(info: Anon_Cells[ValueType]): TagMod[Any] = js.native
    def onExpandedChange(expanded: Boolean, record: ValueType, event: SyntheticMouseEvent[HTMLElement], rowKey: Key): Unit = js.native
    def onExpandedChange(
      expanded: Boolean,
      record: ValueType,
      event: SyntheticMouseEvent[HTMLElement],
      rowKey: Key,
      destroy: Boolean
    ): Unit = js.native
  }
  
  val default: js.Any = js.native
}

