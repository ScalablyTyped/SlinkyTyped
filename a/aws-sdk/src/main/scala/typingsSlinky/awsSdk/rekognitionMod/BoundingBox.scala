package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoundingBox extends js.Object {
  /**
    * Height of the bounding box as a ratio of the overall image height.
    */
  var Height: js.UndefOr[Float] = js.native
  /**
    * Left coordinate of the bounding box as a ratio of overall image width.
    */
  var Left: js.UndefOr[Float] = js.native
  /**
    * Top coordinate of the bounding box as a ratio of overall image height.
    */
  var Top: js.UndefOr[Float] = js.native
  /**
    * Width of the bounding box as a ratio of the overall image width.
    */
  var Width: js.UndefOr[Float] = js.native
}

object BoundingBox {
  @scala.inline
  def apply(): BoundingBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundingBox]
  }
  @scala.inline
  implicit class BoundingBoxOps[Self <: BoundingBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Left")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Top")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(js.undefined)
        ret
    }
  }
  
}

