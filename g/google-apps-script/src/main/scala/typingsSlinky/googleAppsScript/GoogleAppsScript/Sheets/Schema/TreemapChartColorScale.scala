package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreemapChartColorScale extends js.Object {
  var maxValueColor: js.UndefOr[Color] = js.native
  var midValueColor: js.UndefOr[Color] = js.native
  var minValueColor: js.UndefOr[Color] = js.native
  var noDataColor: js.UndefOr[Color] = js.native
}

object TreemapChartColorScale {
  @scala.inline
  def apply(): TreemapChartColorScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreemapChartColorScale]
  }
  @scala.inline
  implicit class TreemapChartColorScaleOps[Self <: TreemapChartColorScale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxValueColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValueColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValueColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValueColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMidValueColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midValueColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMidValueColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midValueColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValueColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValueColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValueColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValueColor")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDataColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDataColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataColor")(js.undefined)
        ret
    }
  }
  
}

