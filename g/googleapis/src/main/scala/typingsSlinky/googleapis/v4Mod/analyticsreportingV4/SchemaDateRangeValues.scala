package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to return a list of metrics for a single DateRange / dimension
  * combination
  */
@js.native
trait SchemaDateRangeValues extends js.Object {
  /**
    * The values of each pivot region.
    */
  var pivotValueRegions: js.UndefOr[js.Array[SchemaPivotValueRegion]] = js.native
  /**
    * Each value corresponds to each Metric in the request.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SchemaDateRangeValues {
  @scala.inline
  def apply(): SchemaDateRangeValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateRangeValues]
  }
  @scala.inline
  implicit class SchemaDateRangeValuesOps[Self <: SchemaDateRangeValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPivotValueRegions(value: js.Array[SchemaPivotValueRegion]): Self = {
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

