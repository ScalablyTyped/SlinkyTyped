package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The headers for the each of the metric column corresponding to the metrics
  * requested in the pivots section of the response.
  */
@js.native
trait SchemaPivotHeaderEntry extends js.Object {
  /**
    * The name of the dimensions in the pivot response.
    */
  var dimensionNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The values for the dimensions in the pivot.
    */
  var dimensionValues: js.UndefOr[js.Array[String]] = js.native
  /**
    * The metric header for the metric in the pivot.
    */
  var metric: js.UndefOr[SchemaMetricHeaderEntry] = js.native
}

object SchemaPivotHeaderEntry {
  @scala.inline
  def apply(): SchemaPivotHeaderEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotHeaderEntry]
  }
  @scala.inline
  implicit class SchemaPivotHeaderEntryOps[Self <: SchemaPivotHeaderEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensionNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionNames")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensionValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionValues")(js.undefined)
        ret
    }
    @scala.inline
    def withMetric(value: SchemaMetricHeaderEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metric")(js.undefined)
        ret
    }
  }
  
}

