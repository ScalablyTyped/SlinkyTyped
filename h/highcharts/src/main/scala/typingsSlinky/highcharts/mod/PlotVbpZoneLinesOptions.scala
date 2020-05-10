package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotVbpZoneLinesOptions extends js.Object {
  /**
    * (Highstock) Enable/disable zone lines.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) Specify the style of zone lines.
    */
  var styles: js.UndefOr[CSSObject] = js.native
}

object PlotVbpZoneLinesOptions {
  @scala.inline
  def apply(): PlotVbpZoneLinesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVbpZoneLinesOptions]
  }
  @scala.inline
  implicit class PlotVbpZoneLinesOptionsOps[Self <: PlotVbpZoneLinesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: CSSObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

