package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A histogram series containing the series color and data.
  */
@js.native
trait SchemaHistogramSeries extends js.Object {
  /**
    * The color of the column representing this series in each bucket. This
    * field is optional.
    */
  var barColor: js.UndefOr[SchemaColor] = js.native
  /**
    * The data for this histogram series.
    */
  var data: js.UndefOr[SchemaChartData] = js.native
}

object SchemaHistogramSeries {
  @scala.inline
  def apply(): SchemaHistogramSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramSeries]
  }
  @scala.inline
  implicit class SchemaHistogramSeriesOps[Self <: SchemaHistogramSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarColor(value: SchemaColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barColor")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: SchemaChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
  }
  
}

