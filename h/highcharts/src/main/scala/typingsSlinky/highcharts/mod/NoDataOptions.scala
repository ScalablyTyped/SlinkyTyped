package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoDataOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) An object of additional SVG attributes for
    * the no-data label.
    */
  var attr: js.UndefOr[SVGAttributes] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The position of the no-data label,
    * relative to the plot area.
    */
  var position: js.UndefOr[AlignObject | NoDataPositionOptions] = js.native
  /**
    * (Highcharts, Highstock, Gantt) CSS styles for the no-data label.
    */
  var style: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Whether to insert the label as HTML, or as
    * pseudo-HTML rendered with SVG.
    */
  var useHTML: js.UndefOr[Boolean] = js.native
}

object NoDataOptions {
  @scala.inline
  def apply(): NoDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoDataOptions]
  }
  @scala.inline
  implicit class NoDataOptionsOps[Self <: NoDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttr(value: SVGAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attr")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: AlignObject | NoDataPositionOptions): Self = {
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
    def withStyle(value: CSSObject): Self = {
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
    @scala.inline
    def withUseHTML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHTML")(js.undefined)
        ret
    }
  }
  
}

