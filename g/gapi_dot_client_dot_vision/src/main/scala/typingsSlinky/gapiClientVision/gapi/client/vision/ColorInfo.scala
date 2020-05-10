package typingsSlinky.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorInfo extends js.Object {
  /** RGB components of the color. */
  var color: js.UndefOr[Color] = js.native
  /**
    * The fraction of pixels the color occupies in the image.
    * Value in range [0, 1].
    */
  var pixelFraction: js.UndefOr[Double] = js.native
  /** Image-specific score for this color. Value in range [0, 1]. */
  var score: js.UndefOr[Double] = js.native
}

object ColorInfo {
  @scala.inline
  def apply(): ColorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorInfo]
  }
  @scala.inline
  implicit class ColorInfoOps[Self <: ColorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Color): Self = {
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
    def withPixelFraction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelFraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelFraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelFraction")(js.undefined)
        ret
    }
    @scala.inline
    def withScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(js.undefined)
        ret
    }
  }
  
}

