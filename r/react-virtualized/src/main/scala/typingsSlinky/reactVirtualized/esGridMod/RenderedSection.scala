package typingsSlinky.reactVirtualized.esGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderedSection extends js.Object {
  var columnOverscanStartIndex: Double = js.native
  var columnOverscanStopIndex: Double = js.native
  var columnStartIndex: Double = js.native
  var columnStopIndex: Double = js.native
  var rowOverscanStartIndex: Double = js.native
  var rowOverscanStopIndex: Double = js.native
  var rowStartIndex: Double = js.native
  var rowStopIndex: Double = js.native
}

object RenderedSection {
  @scala.inline
  def apply(
    columnOverscanStartIndex: Double,
    columnOverscanStopIndex: Double,
    columnStartIndex: Double,
    columnStopIndex: Double,
    rowOverscanStartIndex: Double,
    rowOverscanStopIndex: Double,
    rowStartIndex: Double,
    rowStopIndex: Double
  ): RenderedSection = {
    val __obj = js.Dynamic.literal(columnOverscanStartIndex = columnOverscanStartIndex.asInstanceOf[js.Any], columnOverscanStopIndex = columnOverscanStopIndex.asInstanceOf[js.Any], columnStartIndex = columnStartIndex.asInstanceOf[js.Any], columnStopIndex = columnStopIndex.asInstanceOf[js.Any], rowOverscanStartIndex = rowOverscanStartIndex.asInstanceOf[js.Any], rowOverscanStopIndex = rowOverscanStopIndex.asInstanceOf[js.Any], rowStartIndex = rowStartIndex.asInstanceOf[js.Any], rowStopIndex = rowStopIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderedSection]
  }
  @scala.inline
  implicit class RenderedSectionOps[Self <: RenderedSection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnOverscanStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnOverscanStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnOverscanStopIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnOverscanStopIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnStopIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnStopIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowOverscanStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowOverscanStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowOverscanStopIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowOverscanStopIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowStopIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowStopIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

