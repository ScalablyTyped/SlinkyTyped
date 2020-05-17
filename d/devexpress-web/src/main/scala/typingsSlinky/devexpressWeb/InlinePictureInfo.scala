package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains in-line picture settings.
  */
@js.native
trait InlinePictureInfo extends js.Object {
  /**
    * Gets the actual image height.
    */
  val actualHeight: Double = js.native
  val actualHeigth: Double = js.native
  /**
    * Gets the actual image width.
    */
  val actualWidth: Double = js.native
  /**
    * Gets the image identifier.
    */
  val id: Double = js.native
  /**
    * Gets the initial image height.
    */
  val initialHeight: Double = js.native
  /**
    * Gets the initial image width.
    */
  val initialWidth: Double = js.native
  /**
    * Gets the image position.
    */
  val position: Double = js.native
  /**
    * Gets the X-scaling factor of the inline image.
    */
  val scaleX: Double = js.native
  /**
    * Gets the Y-scaling factor of the inline image.
    */
  val scaleY: Double = js.native
}

object InlinePictureInfo {
  @scala.inline
  def apply(
    actualHeight: Double,
    actualHeigth: Double,
    actualWidth: Double,
    id: Double,
    initialHeight: Double,
    initialWidth: Double,
    position: Double,
    scaleX: Double,
    scaleY: Double
  ): InlinePictureInfo = {
    val __obj = js.Dynamic.literal(actualHeight = actualHeight.asInstanceOf[js.Any], actualHeigth = actualHeigth.asInstanceOf[js.Any], actualWidth = actualWidth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialHeight = initialHeight.asInstanceOf[js.Any], initialWidth = initialWidth.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlinePictureInfo]
  }
  @scala.inline
  implicit class InlinePictureInfoOps[Self <: InlinePictureInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActualHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActualHeigth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualHeigth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActualWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

