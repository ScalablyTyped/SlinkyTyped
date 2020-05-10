package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Replaces all shapes that match the given criteria with the provided image.
  * The images replacing the shapes are rectangular after being inserted into
  * the presentation and do not take on the forms of the shapes.
  */
@js.native
trait SchemaReplaceAllShapesWithImageRequest extends js.Object {
  /**
    * If set, this request will replace all of the shapes that contain the
    * given text.
    */
  var containsText: js.UndefOr[SchemaSubstringMatchCriteria] = js.native
  /**
    * The image replace method.  If you specify both a `replace_method` and an
    * `image_replace_method`, the `image_replace_method` takes precedence.  If
    * you do not specify a value for `image_replace_method`, but specify a
    * value for `replace_method`, then the specified `replace_method` value is
    * used.  If you do not specify either, then CENTER_INSIDE is used.
    */
  var imageReplaceMethod: js.UndefOr[String] = js.native
  /**
    * The image URL.  The image is fetched once at insertion time and a copy is
    * stored for display inside the presentation. Images must be less than 50MB
    * in size, cannot exceed 25 megapixels, and must be in one of PNG, JPEG, or
    * GIF format.  The provided URL can be at most 2 kB in length. The URL
    * itself is saved with the image, and exposed via the Image.source_url
    * field.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * If non-empty, limits the matches to page elements only on the given
    * pages.  Returns a 400 bad request error if given the page object ID of a
    * notes page or a notes master, or if a page with that object ID
    * doesn&#39;t exist in the presentation.
    */
  var pageObjectIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The replace method.  &lt;b&gt;Deprecated&lt;/b&gt;: use
    * `image_replace_method` instead.  If you specify both a `replace_method`
    * and an `image_replace_method`, the `image_replace_method` takes
    * precedence.
    */
  var replaceMethod: js.UndefOr[String] = js.native
}

object SchemaReplaceAllShapesWithImageRequest {
  @scala.inline
  def apply(): SchemaReplaceAllShapesWithImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceAllShapesWithImageRequest]
  }
  @scala.inline
  implicit class SchemaReplaceAllShapesWithImageRequestOps[Self <: SchemaReplaceAllShapesWithImageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainsText(value: SchemaSubstringMatchCriteria): Self = {
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

