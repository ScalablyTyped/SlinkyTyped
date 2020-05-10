package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Replaces an existing image with a new image.  Replacing an image removes
  * some image effects from the existing image.
  */
@js.native
trait SchemaReplaceImageRequest extends js.Object {
  /**
    * The ID of the existing image that will be replaced.
    */
  var imageObjectId: js.UndefOr[String] = js.native
  /**
    * The replacement method.
    */
  var imageReplaceMethod: js.UndefOr[String] = js.native
  /**
    * The URL of the new image.  The image is fetched once at insertion time
    * and a copy is stored for display inside the presentation. Images must be
    * less than 50MB in size, cannot exceed 25 megapixels, and must be in one
    * of PNG, JPEG, or GIF format.  The provided URL can be at most 2 kB in
    * length. The URL itself is saved with the image, and exposed via the
    * Image.source_url field.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaReplaceImageRequest {
  @scala.inline
  def apply(): SchemaReplaceImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceImageRequest]
  }
  @scala.inline
  implicit class SchemaReplaceImageRequestOps[Self <: SchemaReplaceImageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageObjectId")(js.undefined)
        ret
    }
    @scala.inline
    def withImageReplaceMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageReplaceMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageReplaceMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageReplaceMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

