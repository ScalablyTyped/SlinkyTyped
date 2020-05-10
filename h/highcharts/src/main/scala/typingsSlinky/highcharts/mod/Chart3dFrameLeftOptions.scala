package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsStrings.auto
import typingsSlinky.highcharts.highchartsStrings.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chart3dFrameLeftOptions extends js.Object {
  /**
    * (Highcharts) The color of the panel.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) The thickness of the panel.
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Whether to display the frame. Possible values are `true`,
    * `false`, `"auto"` to display only the frames behind the data, and
    * `"default"` to display faces behind the data based on the axis layout,
    * ignoring the point of view.
    */
  var visible: js.UndefOr[auto | default | Boolean] = js.native
}

object Chart3dFrameLeftOptions {
  @scala.inline
  def apply(): Chart3dFrameLeftOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chart3dFrameLeftOptions]
  }
  @scala.inline
  implicit class Chart3dFrameLeftOptionsOps[Self <: Chart3dFrameLeftOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
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
    def withVisible(value: auto | default | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

