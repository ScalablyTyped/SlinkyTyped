package typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frame extends js.Object {
  /** Specifies the URL of an image to be displayed as background of the Digital gauge.
    * @Default {null}
    */
  var backgroundImageUrl: js.UndefOr[String] = js.native
  /** Specifies the inner width for the frame, when the background image has been set for the Digital gauge..
    * @Default {6}
    */
  var innerWidth: js.UndefOr[Double] = js.native
  /** Specifies the outer width of the frame, when the background image has been set for the Digital gauge.
    * @Default {10}
    */
  var outerWidth: js.UndefOr[Double] = js.native
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
    def withInnerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerWidth")(js.undefined)
        ret
    }
  }
  
}

