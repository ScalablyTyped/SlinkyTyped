package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateRangeValues extends js.Object {
  var pivotValueRegions: js.UndefOr[js.Array[PivotValueRegion]] = js.native
  var values: js.UndefOr[js.Array[String]] = js.native
}

object DateRangeValues {
  @scala.inline
  def apply(): DateRangeValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangeValues]
  }
  @scala.inline
  implicit class DateRangeValuesOps[Self <: DateRangeValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPivotValueRegions(value: js.Array[PivotValueRegion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotValueRegions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotValueRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotValueRegions")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[String]): Self = {
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

