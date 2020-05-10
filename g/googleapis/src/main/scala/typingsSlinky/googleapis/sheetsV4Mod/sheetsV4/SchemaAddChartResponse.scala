package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of adding a chart to a spreadsheet.
  */
@js.native
trait SchemaAddChartResponse extends js.Object {
  /**
    * The newly added chart.
    */
  var chart: js.UndefOr[SchemaEmbeddedChart] = js.native
}

object SchemaAddChartResponse {
  @scala.inline
  def apply(): SchemaAddChartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddChartResponse]
  }
  @scala.inline
  implicit class SchemaAddChartResponseOps[Self <: SchemaAddChartResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChart(value: SchemaEmbeddedChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(js.undefined)
        ret
    }
  }
  
}

