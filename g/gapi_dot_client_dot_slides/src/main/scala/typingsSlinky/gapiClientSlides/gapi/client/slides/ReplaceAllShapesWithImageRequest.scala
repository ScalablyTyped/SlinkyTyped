package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceAllShapesWithImageRequest extends js.Object {
  /**
    * If set, this request will replace all of the shapes that contain the
    * given text.
    */
  var containsText: js.UndefOr[SubstringMatchCriteria] = js.native
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
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * If non-empty, limits the matches to page elements only on the given pages.
    *
    * Returns a 400 bad request error if given the page object ID of a
    * notes page or a
    * notes master, or if a
    * page with that object ID doesn't exist in the presentation.
    */
  var pageObjectIds: js.UndefOr[js.Array[String]] = js.native
  /** The replace method. */
  var replaceMethod: js.UndefOr[String] = js.native
}

object ReplaceAllShapesWithImageRequest {
  @scala.inline
  def apply(): ReplaceAllShapesWithImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAllShapesWithImageRequest]
  }
  @scala.inline
  implicit class ReplaceAllShapesWithImageRequestOps[Self <: ReplaceAllShapesWithImageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainsText(value: SubstringMatchCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainsText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsText")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPageObjectIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageObjectIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageObjectIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageObjectIds")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceMethod")(js.undefined)
        ret
    }
  }
  
}

