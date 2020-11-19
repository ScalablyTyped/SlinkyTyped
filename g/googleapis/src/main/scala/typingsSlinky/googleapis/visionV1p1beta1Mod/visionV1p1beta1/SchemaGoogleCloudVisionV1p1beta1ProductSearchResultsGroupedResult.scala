package typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBoundingPoly(value: SchemaGoogleCloudVisionV1p1beta1BoundingPoly): Self = this.set("boundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingPoly: Self = this.set("boundingPoly", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
}
