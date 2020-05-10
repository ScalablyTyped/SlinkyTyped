package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends js.Object {
  /**
    * An URL to an image with a default lifetime of 30 minutes.
    * This URL is tagged with the account of the requester. Anyone with the URL
    * effectively accesses the image as the original requester. Access to the
    * image may be lost if the presentation's sharing settings change.
    */
  var contentUrl: js.UndefOr[String] = js.native
  /** The properties of the image. */
  var imageProperties: js.UndefOr[ImageProperties] = js.native
}

object Image {
  @scala.inline
  def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withImageProperties(value: ImageProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageProperties")(js.undefined)
        ret
    }
  }
  
}

