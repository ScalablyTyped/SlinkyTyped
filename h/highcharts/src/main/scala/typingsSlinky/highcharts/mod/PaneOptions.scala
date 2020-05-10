package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaneOptions extends js.Object {
  /**
    * (Highcharts) An array of background items for the pane.
    */
  var background: js.UndefOr[js.Array[PaneBackgroundOptions]] = js.native
  /**
    * (Highcharts) The center of a polar chart or angular gauge, given as an
    * array of [x, y] positions. Positions can be given as integers that
    * transform to pixels, or as percentages of the plot area size.
    */
  var center: js.UndefOr[js.Array[String | Double]] = js.native
  /**
    * (Highcharts) The end angle of the polar X axis or gauge value axis, given
    * in degrees where 0 is north. Defaults to startAngle
    *
    * + 360.
    */
  var endAngle: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The size of the pane, either as a number defining pixels, or
    * a percentage defining a percentage of the plot are.
    */
  var size: js.UndefOr[Double | String] = js.native
  /**
    * (Highcharts) The start angle of the polar X axis or gauge axis, given in
    * degrees where 0 is north. Defaults to 0.
    */
  var startAngle: js.UndefOr[Double] = js.native
}

object PaneOptions {
  @scala.inline
  def apply(): PaneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaneOptions]
  }
  @scala.inline
  implicit class PaneOptionsOps[Self <: PaneOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: js.Array[PaneBackgroundOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: js.Array[String | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withEndAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(js.undefined)
        ret
    }
  }
  
}

