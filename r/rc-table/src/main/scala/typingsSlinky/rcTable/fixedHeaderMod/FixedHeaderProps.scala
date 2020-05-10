package typingsSlinky.rcTable.fixedHeaderMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.rcTable.headerMod.HeaderProps
import typingsSlinky.rcTable.interfaceMod.ColumnType
import typingsSlinky.rcTable.interfaceMod.ColumnsType
import typingsSlinky.rcTable.interfaceMod.StickyOffsets
import typingsSlinky.rcTable.rcTableStrings.ltr
import typingsSlinky.rcTable.rcTableStrings.rtl
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FixedHeaderProps[RecordType] extends HeaderProps[RecordType] {
  var colWidths: js.Array[Double] = js.native
  var columCount: Double = js.native
  var direction: ltr | rtl = js.native
}

object FixedHeaderProps {
  @scala.inline
  def apply[RecordType](
    colWidths: js.Array[Double],
    columCount: Double,
    columns: ColumnsType[RecordType],
    direction: ltr | rtl,
    flattenColumns: js.Array[ColumnType[RecordType]],
    onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement],
    stickyOffsets: StickyOffsets
  ): FixedHeaderProps[RecordType] = {
    val __obj = js.Dynamic.literal(colWidths = colWidths.asInstanceOf[js.Any], columCount = columCount.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], onHeaderRow = js.Any.fromFunction2(onHeaderRow), stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedHeaderProps[RecordType]]
  }
  @scala.inline
  implicit class FixedHeaderPropsOps[Self[recordtype] <: FixedHeaderProps[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withColWidths(value: js.Array[Double]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colWidths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumCount(value: Double): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: ltr | rtl): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

