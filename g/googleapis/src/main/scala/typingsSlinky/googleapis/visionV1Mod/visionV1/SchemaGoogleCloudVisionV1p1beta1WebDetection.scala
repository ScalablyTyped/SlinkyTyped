package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Relevant information for the image from the Internet.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1WebDetection extends js.Object {
  /**
    * The service&#39;s best guess as to the topic of the request image.
    * Inferred from similar images on the open web.
    */
  var bestGuessLabels: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1WebDetectionWebLabel]] = js.native
  /**
    * Fully matching images from the Internet. Can include resized copies of
    * the query image.
    */
  var fullMatchingImages: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1WebDetectionWebImage]] = js.native
  /**
    * Web pages containing the matching images from the Internet.
    */
  var pagesWithMatchingImages: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1WebDetectionWebPage]] = js.native
  /**
    * Partial matching images from the Internet. Those images are similar
    * enough to share some key-point features. For example an original image
    * will likely have partial matching for its crops.
    */
  var partialMatchingImages: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1WebDetectionWebImage]] = js.native
  /**
    * The visually similar image results.
    */
  var visuallySimilarImages: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1WebDetectionWebImage]] = js.native
  /**
    * Deduced entities from similar images on the Internet.
    */
  var webEntities: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1WebDetectionWebEntity]] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1WebDetection {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1WebDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1WebDetection]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1WebDetectionOps[Self <: SchemaGoogleCloudVisionV1p1beta1WebDetection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBestGuessLabels(value: js.Array[SchemaGoogleCloudVisionV1p1beta1WebDetectionWebLabel]): Self = {
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
    def withFullMatchingImages(value: js.Array[SchemaGoogleCloudVisionV1p1beta1WebDetectionWebImage]): Self = {
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
    def withPagesWithMatchingImages(value: js.Array[SchemaGoogleCloudVisionV1p1beta1WebDetectionWebPage]): Self = {
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
    def withPartialMatchingImages(value: js.Array[SchemaGoogleCloudVisionV1p1beta1WebDetectionWebImage]): Self = {
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
    def withVisuallySimilarImages(value: js.Array[SchemaGoogleCloudVisionV1p1beta1WebDetectionWebImage]): Self = {
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
    def withWebEntities(value: js.Array[SchemaGoogleCloudVisionV1p1beta1WebDetectionWebEntity]): Self = {
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

