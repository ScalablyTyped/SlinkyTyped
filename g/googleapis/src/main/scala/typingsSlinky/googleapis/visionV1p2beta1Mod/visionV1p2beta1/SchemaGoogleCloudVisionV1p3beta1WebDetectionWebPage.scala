package typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for web pages.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1WebDetectionWebPage extends js.Object {
  /**
    * Fully matching images on the page. Can include resized copies of the
    * query image.
    */
  var fullMatchingImages: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1WebDetectionWebImage]] = js.native
  /**
    * Title for the web page, may contain HTML markups.
    */
  var pageTitle: js.UndefOr[String] = js.native
  /**
    * Partial matching images on the page. Those images are similar enough to
    * share some key-point features. For example an original image will likely
    * have partial matching for its crops.
    */
  var partialMatchingImages: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1WebDetectionWebImage]] = js.native
  /**
    * (Deprecated) Overall relevancy score for the web page.
    */
  var score: js.UndefOr[Double] = js.native
  /**
    * The result web page URL.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p3beta1WebDetectionWebPage {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p3beta1WebDetectionWebPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1WebDetectionWebPage]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p3beta1WebDetectionWebPageOps[Self <: SchemaGoogleCloudVisionV1p3beta1WebDetectionWebPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullMatchingImages(value: js.Array[SchemaGoogleCloudVisionV1p3beta1WebDetectionWebImage]): Self = {
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
    def withPageTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withPartialMatchingImages(value: js.Array[SchemaGoogleCloudVisionV1p3beta1WebDetectionWebImage]): Self = {
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
    def withScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(js.undefined)
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

