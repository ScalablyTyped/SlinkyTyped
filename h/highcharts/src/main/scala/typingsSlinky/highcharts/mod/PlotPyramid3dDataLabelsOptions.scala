package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotPyramid3dDataLabelsOptions extends js.Object {
  var verticalAlign: js.UndefOr[String] = js.native
}

object PlotPyramid3dDataLabelsOptions {
  @scala.inline
  def apply(): PlotPyramid3dDataLabelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPyramid3dDataLabelsOptions]
  }
  @scala.inline
  implicit class PlotPyramid3dDataLabelsOptionsOps[Self <: PlotPyramid3dDataLabelsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVerticalAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(js.undefined)
        ret
    }
  }
  
}

