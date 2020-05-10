package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates a chart&#39;s specifications. (This does not move or resize a
  * chart. To move or resize a chart, use UpdateEmbeddedObjectPositionRequest.)
  */
@js.native
trait SchemaUpdateChartSpecRequest extends js.Object {
  /**
    * The ID of the chart to update.
    */
  var chartId: js.UndefOr[Double] = js.native
  /**
    * The specification to apply to the chart.
    */
  var spec: js.UndefOr[SchemaChartSpec] = js.native
}

object SchemaUpdateChartSpecRequest {
  @scala.inline
  def apply(): SchemaUpdateChartSpecRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateChartSpecRequest]
  }
  @scala.inline
  implicit class SchemaUpdateChartSpecRequestOps[Self <: SchemaUpdateChartSpecRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChartId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartId")(js.undefined)
        ret
    }
    @scala.inline
    def withSpec(value: SchemaChartSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(js.undefined)
        ret
    }
  }
  
}

