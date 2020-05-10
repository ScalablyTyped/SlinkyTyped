package typingsSlinky.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebDetection extends js.Object {
  /**
    * Fully matching images from the Internet.
    * Can include resized copies of the query image.
    */
  var fullMatchingImages: js.UndefOr[js.Array[WebImage]] = js.native
  /** Web pages containing the matching images from the Internet. */
  var pagesWithMatchingImages: js.UndefOr[js.Array[WebPage]] = js.native
  /**
    * Partial matching images from the Internet.
    * Those images are similar enough to share some key-point features. For
    * example an original image will likely have partial matching for its crops.
    */
  var partialMatchingImages: js.UndefOr[js.Array[WebImage]] = js.native
  /** The visually similar image results. */
  var visuallySimilarImages: js.UndefOr[js.Array[WebImage]] = js.native
  /** Deduced entities from similar images on the Internet. */
  var webEntities: js.UndefOr[js.Array[WebEntity]] = js.native
}

object WebDetection {
  @scala.inline
  def apply(): WebDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebDetection]
  }
  @scala.inline
  implicit class WebDetectionOps[Self <: WebDetection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullMatchingImages(value: js.Array[WebImage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullMatchingImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullMatchingImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullMatchingImages")(js.undefined)
        ret
    }
    @scala.inline
    def withPagesWithMatchingImages(value: js.Array[WebPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagesWithMatchingImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagesWithMatchingImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagesWithMatchingImages")(js.undefined)
        ret
    }
    @scala.inline
    def withPartialMatchingImages(value: js.Array[WebImage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialMatchingImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartialMatchingImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialMatchingImages")(js.undefined)
        ret
    }
    @scala.inline
    def withVisuallySimilarImages(value: js.Array[WebImage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visuallySimilarImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisuallySimilarImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visuallySimilarImages")(js.undefined)
        ret
    }
    @scala.inline
    def withWebEntities(value: js.Array[WebEntity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webEntities")(js.undefined)
        ret
    }
  }
  
}

