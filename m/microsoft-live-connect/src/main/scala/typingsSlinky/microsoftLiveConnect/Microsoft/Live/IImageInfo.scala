package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an image.
  */
@js.native
trait IImageInfo extends js.Object {
  /**
    * The height, in pixels, of this image of this particular size.
    */
  var height: Double = js.native
  /**
    * The width, in pixels, of this image of this particular size.
    */
  var source: String = js.native
  /**
    * The type of this image of this particular size. Valid values are:
    * full (maximum size: 2048 x 2048 pixels)
    * - normal (maximum size 800 x 800 pixels)
    * - album (maximum size 176 x 176 pixels)
    * - small (maximum size 96 x 96 pixels)
    */
  var `type`: String = js.native
  /**
    * The width, in pixels, of this image of this particular size.
    */
  var width: Double = js.native
}

object IImageInfo {
  @scala.inline
  def apply(height: Double, source: String, `type`: String, width: Double): IImageInfo = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImageInfo]
  }
  @scala.inline
  implicit class IImageInfoOps[Self <: IImageInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

