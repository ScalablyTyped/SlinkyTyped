package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRange extends js.Object {
  /** The column span of the table range. */
  var columnSpan: js.UndefOr[Double] = js.native
  /** The starting location of the table range. */
  var location: js.UndefOr[TableCellLocation] = js.native
  /** The row span of the table range. */
  var rowSpan: js.UndefOr[Double] = js.native
}

object TableRange {
  @scala.inline
  def apply(): TableRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRange]
  }
  @scala.inline
  implicit class TableRangeOps[Self <: TableRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: TableCellLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSpan")(js.undefined)
        ret
    }
  }
  
}

