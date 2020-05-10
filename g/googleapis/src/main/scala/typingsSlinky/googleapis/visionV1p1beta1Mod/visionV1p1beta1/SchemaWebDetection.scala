package typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Relevant information for the image from the Internet.
  */
@js.native
trait SchemaWebDetection extends js.Object {
  /**
    * The service&#39;s best guess as to the topic of the request image.
    * Inferred from similar images on the open web.
    */
  var bestGuessLabels: js.UndefOr[js.Array[SchemaWebLabel]] = js.native
  /**
    * Fully matching images from the Internet. Can include resized copies of
    * the query image.
    */
  var fullMatchingImages: js.UndefOr[js.Array[SchemaWebImage]] = js.native
  /**
    * Web pages containing the matching images from the Internet.
    */
  var pagesWithMatchingImages: js.UndefOr[js.Array[SchemaWebPage]] = js.native
  /**
    * Partial matching images from the Internet. Those images are similar
    * enough to share some key-point features. For example an original image
    * will likely have partial matching for its crops.
    */
  var partialMatchingImages: js.UndefOr[js.Array[SchemaWebImage]] = js.native
  /**
    * The visually similar image results.
    */
  var visuallySimilarImages: js.UndefOr[js.Array[SchemaWebImage]] = js.native
  /**
    * Deduced entities from similar images on the Internet.
    */
  var webEntities: js.UndefOr[js.Array[SchemaWebEntity]] = js.native
}

object SchemaWebDetection {
  @scala.inline
  def apply(): SchemaWebDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebDetection]
  }
  @scala.inline
  implicit class SchemaWebDetectionOps[Self <: SchemaWebDetection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBestGuessLabels(value: js.Array[SchemaWebLabel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bestGuessLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBestGuessLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bestGuessLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withFullMatchingImages(value: js.Array[SchemaWebImage]): Self = {
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
    def withPagesWithMatchingImages(value: js.Array[SchemaWebPage]): Self = {
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
    def withPartialMatchingImages(value: js.Array[SchemaWebImage]): Self = {
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
    def withVisuallySimilarImages(value: js.Array[SchemaWebImage]): Self = {
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
    def withWebEntities(value: js.Array[SchemaWebEntity]): Self = {
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

