package typingsSlinky.gapiClientDoubleclicksearch

import typingsSlinky.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch.ReportApiColumnSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSortOrder extends js.Object {
  /** Column to perform the sort on. This can be a DoubleClick Search-defined column or a saved column. */
  var column: js.UndefOr[ReportApiColumnSpec] = js.native
  /** The sort direction, which is either ascending or descending. */
  var sortOrder: js.UndefOr[String] = js.native
}

object AnonSortOrder {
  @scala.inline
  def apply(): AnonSortOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSortOrder]
  }
  @scala.inline
  implicit class AnonSortOrderOps[Self <: AnonSortOrder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: ReportApiColumnSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
  }
  
}

