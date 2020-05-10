package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a product.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult extends js.Object {
  /**
    * The resource name of the image from the product that is the closest match
    * to the query.
    */
  var image: js.UndefOr[String] = js.native
  /**
    * The Product.
    */
  var product: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1Product] = js.native
  /**
    * A confidence level on the match, ranging from 0 (no confidence) to 1
    * (full confidence).
    */
  var score: js.UndefOr[Double] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResultOps[Self <: SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withProduct(value: SchemaGoogleCloudVisionV1p1beta1Product): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(js.undefined)
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
  }
  
}

