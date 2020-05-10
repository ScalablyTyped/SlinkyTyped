package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A chart embedded in a sheet.
  */
@js.native
trait SchemaEmbeddedChart extends js.Object {
  /**
    * The ID of the chart.
    */
  var chartId: js.UndefOr[Double] = js.native
  /**
    * The position of the chart.
    */
  var position: js.UndefOr[SchemaEmbeddedObjectPosition] = js.native
  /**
    * The specification of the chart.
    */
  var spec: js.UndefOr[SchemaChartSpec] = js.native
}

object SchemaEmbeddedChart {
  @scala.inline
  def apply(): SchemaEmbeddedChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmbeddedChart]
  }
  @scala.inline
  implicit class SchemaEmbeddedChartOps[Self <: SchemaEmbeddedChart] (val x: Self) extends AnyVal {
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
    def withPosition(value: SchemaEmbeddedObjectPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
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

