package typingsSlinky.gapiClientDrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonId extends js.Object {
  /** The ID of an image file in Drive to use for the background image. */
  var id: js.UndefOr[String] = js.native
  /**
    * The width of the cropped image in the closed range of 0 to 1. This value represents the width of the cropped image divided by the width of the entire
    * image. The height is computed by applying a width to height aspect ratio of 80 to 9. The resulting image must be at least 1280 pixels wide and 144
    * pixels high.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * The X coordinate of the upper left corner of the cropping area in the background image. This is a value in the closed range of 0 to 1. This value
    * represents the horizontal distance from the left side of the entire image to the left side of the cropping area divided by the width of the entire
    * image.
    */
  var xCoordinate: js.UndefOr[Double] = js.native
  /**
    * The Y coordinate of the upper left corner of the cropping area in the background image. This is a value in the closed range of 0 to 1. This value
    * represents the vertical distance from the top side of the entire image to the top side of the cropping area divided by the height of the entire image.
    */
  var yCoordinate: js.UndefOr[Double] = js.native
}

object AnonId {
  @scala.inline
  def apply(): AnonId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonId]
  }
  @scala.inline
  implicit class AnonIdOps[Self <: AnonId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withXCoordinate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xCoordinate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXCoordinate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xCoordinate")(js.undefined)
        ret
    }
    @scala.inline
    def withYCoordinate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yCoordinate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYCoordinate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yCoordinate")(js.undefined)
        ret
    }
  }
  
}

