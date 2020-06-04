package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFormat extends js.Object {
  var framesPerSecond: Double
  var imageResolution: ImageResolution
  var `type`: String
}

object VideoFormat {
  @scala.inline
  def apply(framesPerSecond: Double, imageResolution: ImageResolution, `type`: String): VideoFormat = {
    val __obj = js.Dynamic.literal(framesPerSecond = framesPerSecond.asInstanceOf[js.Any], imageResolution = imageResolution.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFormat]
  }
  @scala.inline
  implicit class VideoFormatOps[Self <: VideoFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFramesPerSecond(value: Double): Self = this.set("framesPerSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageResolution(value: ImageResolution): Self = this.set("imageResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

