package typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frame extends js.Object {
  /** Specify the URL of the frame background image for circular gauge
    * @Default {null}
    */
  var backgroundImageUrl: js.UndefOr[String] = js.native
  /** Specifies the frameType of circular gauge. See
    * @Default {FullCircle}
    */
  var frameType: js.UndefOr[FrameType | String] = js.native
  /** Specifies the end angle for the half circular frame.
    * @Default {360}
    */
  var halfCircleFrameEndAngle: js.UndefOr[Double] = js.native
  /** Specifies the start angle for the half circular frame.
    * @Default {180}
    */
  var halfCircleFrameStartAngle: js.UndefOr[Double] = js.native
}

object Frame {
  @scala.inline
  def apply(): Frame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  implicit class FrameOps[Self <: Frame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameType(value: FrameType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameType")(js.undefined)
        ret
    }
    @scala.inline
    def withHalfCircleFrameEndAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfCircleFrameEndAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHalfCircleFrameEndAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfCircleFrameEndAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withHalfCircleFrameStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfCircleFrameStartAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHalfCircleFrameStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfCircleFrameStartAngle")(js.undefined)
        ret
    }
  }
  
}

