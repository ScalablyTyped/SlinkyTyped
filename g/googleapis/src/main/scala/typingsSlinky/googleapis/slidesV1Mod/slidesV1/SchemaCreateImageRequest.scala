package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates an image.
  */
@js.native
trait SchemaCreateImageRequest extends js.Object {
  /**
    * The element properties for the image.  When the aspect ratio of the
    * provided size does not match the image aspect ratio, the image is scaled
    * and centered with respect to the size in order to maintain aspect ratio.
    * The provided transform is applied after this operation.  The
    * PageElementProperties.size property is optional. If you don&#39;t specify
    * the size, the default size of the image is used.  The
    * PageElementProperties.transform property is optional. If you don&#39;t
    * specify a transform, the image will be placed at the top left corner of
    * the page.
    */
  var elementProperties: js.UndefOr[SchemaPageElementProperties] = js.native
  /**
    * A user-supplied object ID.  If you specify an ID, it must be unique among
    * all pages and page elements in the presentation. The ID must start with
    * an alphanumeric character or an underscore (matches regex
    * `[a-zA-Z0-9_]`); remaining characters may include those as well as a
    * hyphen or colon (matches regex `[a-zA-Z0-9_-:]`). The length of the ID
    * must not be less than 5 or greater than 50.  If you don&#39;t specify an
    * ID, a unique one is generated.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The image URL.  The image is fetched once at insertion time and a copy is
    * stored for display inside the presentation. Images must be less than 50MB
    * in size, cannot exceed 25 megapixels, and must be in one of PNG, JPEG, or
    * GIF format.  The provided URL can be at most 2 kB in length. The URL
    * itself is saved with the image, and exposed via the Image.source_url
    * field.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaCreateImageRequest {
  @scala.inline
  def apply(): SchemaCreateImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateImageRequest]
  }
  @scala.inline
  implicit class SchemaCreateImageRequestOps[Self <: SchemaCreateImageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementProperties(value: SchemaPageElementProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
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

