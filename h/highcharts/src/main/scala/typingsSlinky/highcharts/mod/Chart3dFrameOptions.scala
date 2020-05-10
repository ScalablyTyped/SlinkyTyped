package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chart3dFrameOptions extends js.Object {
  /**
    * (Highcharts) The back side of the frame around a 3D chart.
    */
  var back: js.UndefOr[Chart3dFrameBackOptions] = js.native
  /**
    * (Highcharts) The bottom of the frame around a 3D chart.
    */
  var bottom: js.UndefOr[Chart3dFrameBottomOptions] = js.native
  /**
    * (Highcharts) The front of the frame around a 3D chart.
    */
  var front: js.UndefOr[Chart3dFrameFrontOptions] = js.native
  /**
    * (Highcharts) The left side of the frame around a 3D chart.
    */
  var left: js.UndefOr[Chart3dFrameLeftOptions] = js.native
  /**
    * (Highcharts) The right of the frame around a 3D chart.
    */
  var right: js.UndefOr[Chart3dFrameRightOptions] = js.native
  /**
    * (Highcharts) General pixel thickness for the frame faces.
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The top of the frame around a 3D chart.
    */
  var top: js.UndefOr[Chart3dFrameTopOptions] = js.native
  /**
    * (Highcharts) Whether the frames are visible.
    */
  var visible: js.UndefOr[String] = js.native
}

object Chart3dFrameOptions {
  @scala.inline
  def apply(): Chart3dFrameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chart3dFrameOptions]
  }
  @scala.inline
  implicit class Chart3dFrameOptionsOps[Self <: Chart3dFrameOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBack(value: Chart3dFrameBackOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back")(js.undefined)
        ret
    }
    @scala.inline
    def withBottom(value: Chart3dFrameBottomOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withFront(value: Chart3dFrameFrontOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("front")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFront: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("front")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Chart3dFrameLeftOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: Chart3dFrameRightOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
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
    def withTop(value: Chart3dFrameTopOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: String): Self = {
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

