package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotOrganizationDataLabelsOptions extends js.Object {
  var style: js.UndefOr[js.Any] = js.native
}

object PlotOrganizationDataLabelsOptions {
  @scala.inline
  def apply(): PlotOrganizationDataLabelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotOrganizationDataLabelsOptions]
  }
  @scala.inline
  implicit class PlotOrganizationDataLabelsOptionsOps[Self <: PlotOrganizationDataLabelsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

