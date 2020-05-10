package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The headers for the metrics.
  */
@js.native
trait SchemaMetricHeader extends js.Object {
  /**
    * Headers for the metrics in the response.
    */
  var metricHeaderEntries: js.UndefOr[js.Array[SchemaMetricHeaderEntry]] = js.native
  /**
    * Headers for the pivots in the response.
    */
  var pivotHeaders: js.UndefOr[js.Array[SchemaPivotHeader]] = js.native
}

object SchemaMetricHeader {
  @scala.inline
  def apply(): SchemaMetricHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricHeader]
  }
  @scala.inline
  implicit class SchemaMetricHeaderOps[Self <: SchemaMetricHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricHeaderEntries(value: js.Array[SchemaMetricHeaderEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricHeaderEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricHeaderEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricHeaderEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotHeaders(value: js.Array[SchemaPivotHeader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotHeaders")(js.undefined)
        ret
    }
  }
  
}

