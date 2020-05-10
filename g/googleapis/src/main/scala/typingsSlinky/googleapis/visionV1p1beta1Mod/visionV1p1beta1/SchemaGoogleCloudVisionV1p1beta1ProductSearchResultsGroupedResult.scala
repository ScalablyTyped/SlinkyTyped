package typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the products similar to a single product in a query
  * image.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsGroupedResult extends js.Object {
  /**
    * The bounding polygon around the product detected in the query image.
    */
  var boundingPoly: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1BoundingPoly] = js.native
  /**
    * List of results, one for each product match.
    */
  var results: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult]] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsGroupedResult {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsGroupedResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsGroupedResult]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsGroupedResultOps[Self <: SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsGroupedResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingPoly(value: SchemaGoogleCloudVisionV1p1beta1BoundingPoly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingPoly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundingPoly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingPoly")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: js.Array[SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
  }
  
}

