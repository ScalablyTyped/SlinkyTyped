package typingsSlinky.chromeApps.chrome.extensionTypes

import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.jpeg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageDetailsPng extends ImageDetails {
  /**
    * The format of the resulting image.
    * @default 'jpeg'
    */
  var format: js.UndefOr[jpeg] = js.native
  /**
    * Controls the quality of the resulting image.
    * As quality is decreased, the resulting image
    * will have more visual artifacts, and the number
    * of bytes needed to store it will decrease.
    */
  var quality: js.UndefOr[integer] = js.native
}

object ImageDetailsPng {
  @scala.inline
  def apply(): ImageDetailsPng = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageDetailsPng]
  }
  @scala.inline
  implicit class ImageDetailsPngOps[Self <: ImageDetailsPng] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: jpeg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
  }
  
}

