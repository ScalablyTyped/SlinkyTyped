package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataFilterValueRange extends js.Object {
  var dataFilter: js.UndefOr[DataFilter] = js.native
  var majorDimension: js.UndefOr[String] = js.native
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.native
}

object DataFilterValueRange {
  @scala.inline
  def apply(): DataFilterValueRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataFilterValueRange]
  }
  @scala.inline
  implicit class DataFilterValueRangeOps[Self <: DataFilterValueRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataFilter(value: DataFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorDimension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

