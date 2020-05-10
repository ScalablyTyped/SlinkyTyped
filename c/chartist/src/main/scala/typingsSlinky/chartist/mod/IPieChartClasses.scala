package typingsSlinky.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPieChartClasses extends js.Object {
  var chartDonut: js.UndefOr[String] = js.native
  var chartPie: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var series: js.UndefOr[String] = js.native
  var sliceDonut: js.UndefOr[String] = js.native
  var slicePie: js.UndefOr[String] = js.native
}

object IPieChartClasses {
  @scala.inline
  def apply(): IPieChartClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPieChartClasses]
  }
  @scala.inline
  implicit class IPieChartClassesOps[Self <: IPieChartClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChartDonut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartDonut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartDonut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartDonut")(js.undefined)
        ret
    }
    @scala.inline
    def withChartPie(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartPie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartPie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartPie")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withSliceDonut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceDonut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliceDonut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceDonut")(js.undefined)
        ret
    }
    @scala.inline
    def withSlicePie(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slicePie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlicePie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slicePie")(js.undefined)
        ret
    }
  }
  
}

