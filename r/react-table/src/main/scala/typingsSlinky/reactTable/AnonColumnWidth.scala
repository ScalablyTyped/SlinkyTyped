package typingsSlinky.reactTable

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColumnWidth extends js.Object {
  var columnWidth: Double = js.native
  var columnWidths: js.Any = js.native
  var headerIdWidths: Record[String, Double] = js.native
  var isResizingColumn: js.UndefOr[String] = js.native
  var startX: js.UndefOr[Double] = js.native
}

object AnonColumnWidth {
  @scala.inline
  def apply(columnWidth: Double, columnWidths: js.Any, headerIdWidths: Record[String, Double]): AnonColumnWidth = {
    val __obj = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any], columnWidths = columnWidths.asInstanceOf[js.Any], headerIdWidths = headerIdWidths.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnWidth]
  }
  @scala.inline
  implicit class AnonColumnWidthOps[Self <: AnonColumnWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnWidths(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderIdWidths(value: Record[String, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerIdWidths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsResizingColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResizingColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResizingColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResizingColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withStartX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startX")(js.undefined)
        ret
    }
  }
  
}

