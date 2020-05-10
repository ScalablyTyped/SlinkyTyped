package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateImageRequest extends js.Object {
  /**
    * The element properties for the image.
    *
    * When the aspect ratio of the provided size does not match the image aspect
    * ratio, the image is scaled and centered with respect to the size in order
    * to maintain aspect ratio. The provided transform is applied after this
    * operation.
    */
  var elementProperties: js.UndefOr[PageElementProperties] = js.native
  /**
    * A user-supplied object ID.
    *
    * If you specify an ID, it must be unique among all pages and page elements
    * in the presentation. The ID must start with an alphanumeric character or an
    * underscore (matches regex `[a-zA-Z0-9_]`); remaining characters
    * may include those as well as a hyphen or colon (matches regex
    * `[a-zA-Z0-9_-:]`).
    * The length of the ID must not be less than 5 or greater than 50.
    *
    * If you don't specify an ID, a unique one is generated.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The image URL.
    *
    * The image is fetched once at insertion time and a copy is stored for
    * display inside the presentation. Images must be less than 50MB in size,
    * cannot exceed 25 megapixels, and must be in either in PNG, JPEG, or GIF
    * format.
    *
    * The provided URL can be at maximum 2K bytes large.
    */
  var url: js.UndefOr[String] = js.native
}

object CreateImageRequest {
  @scala.inline
  def apply(): CreateImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImageRequest]
  }
  @scala.inline
  implicit class CreateImageRequestOps[Self <: CreateImageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementProperties(value: PageElementProperties): Self = {
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

