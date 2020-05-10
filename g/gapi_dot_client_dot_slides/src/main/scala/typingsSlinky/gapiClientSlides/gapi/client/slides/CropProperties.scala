package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CropProperties extends js.Object {
  /**
    * The rotation angle of the crop window around its center, in radians.
    * Rotation angle is applied after the offset.
    */
  var angle: js.UndefOr[Double] = js.native
  /**
    * The offset specifies the bottom edge of the crop rectangle that is located
    * above the original bounding rectangle bottom edge, relative to the object's
    * original height.
    */
  var bottomOffset: js.UndefOr[Double] = js.native
  /**
    * The offset specifies the left edge of the crop rectangle that is located to
    * the right of the original bounding rectangle left edge, relative to the
    * object's original width.
    */
  var leftOffset: js.UndefOr[Double] = js.native
  /**
    * The offset specifies the right edge of the crop rectangle that is located
    * to the left of the original bounding rectangle right edge, relative to the
    * object's original width.
    */
  var rightOffset: js.UndefOr[Double] = js.native
  /**
    * The offset specifies the top edge of the crop rectangle that is located
    * below the original bounding rectangle top edge, relative to the object's
    * original height.
    */
  var topOffset: js.UndefOr[Double] = js.native
}

object CropProperties {
  @scala.inline
  def apply(): CropProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropProperties]
  }
  @scala.inline
  implicit class CropPropertiesOps[Self <: CropProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withRightOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withTopOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topOffset")(js.undefined)
        ret
    }
  }
  
}

