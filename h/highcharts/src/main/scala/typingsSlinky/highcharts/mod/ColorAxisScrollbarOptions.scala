package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorAxisScrollbarOptions extends js.Object {
  /**
    * (Highstock) The background color of the scrollbar itself.
    */
  var barBackgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highstock) The color of the scrollbar's border.
    */
  var barBorderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highstock) The border rounding radius of the bar.
    */
  var barBorderRadius: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The width of the bar's border.
    */
  var barBorderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The color of the small arrow inside the scrollbar buttons.
    */
  var buttonArrowColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highstock) The color of scrollbar buttons.
    */
  var buttonBackgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highstock) The color of the border of the scrollbar buttons.
    */
  var buttonBorderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highstock) The corner radius of the scrollbar buttons.
    */
  var buttonBorderRadius: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The border width of the scrollbar buttons.
    */
  var buttonBorderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Enable or disable the scrollbar.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) The height of the scrollbar. The height also applies to the
    * width of the scroll arrows so that they are always squares. Defaults to
    * 20 for touch devices and 14 for mouse devices.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Whether to redraw the main chart as the scrollbar or the
    * navigator zoomed window is moved. Defaults to `true` for modern browsers
    * and `false` for legacy IE browsers as well as mobile devices.
    */
  var liveRedraw: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) The margin between the scrollbar and its axis when the
    * scrollbar is applied directly to an axis.
    */
  var margin: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The minimum width of the scrollbar.
    */
  var minWidth: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The color of the small rifles in the middle of the scrollbar.
    */
  var rifleColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highstock) Whether to show or hide the scrollbar when the scrolled
    * content is zoomed out to it full extent.
    */
  var showFull: js.UndefOr[Boolean] = js.native
  var step: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The color of the track background.
    */
  var trackBackgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highstock) The color of the border of the scrollbar track.
    */
  var trackBorderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highstock) The corner radius of the border of the scrollbar track.
    */
  var trackBorderRadius: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The width of the border of the scrollbar track.
    */
  var trackBorderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The z index of the scrollbar group.
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object ColorAxisScrollbarOptions {
  @scala.inline
  def apply(): ColorAxisScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorAxisScrollbarOptions]
  }
  @scala.inline
  implicit class ColorAxisScrollbarOptionsOps[Self <: ColorAxisScrollbarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBarBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBarBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBorderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBorderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBarBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonArrowColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonArrowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonArrowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonArrowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonBorderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonBorderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonBorderWidth")(js.undefined)
        ret
    }
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
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveRedraw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveRedraw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveRedraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveRedraw")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withRifleColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rifleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRifleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rifleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFull")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackBorderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackBorderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

