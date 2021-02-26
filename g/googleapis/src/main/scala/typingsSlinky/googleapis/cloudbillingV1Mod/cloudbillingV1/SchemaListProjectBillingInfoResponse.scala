package typingsSlinky.googleapis.cloudbillingV1Mod.cloudbillingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for `ListProjectBillingInfoResponse`.
  */
@js.native
trait SchemaListProjectBillingInfoResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. To retrieve the next page,
    * call `ListProjectBillingInfo` again with the `page_token` field set to
    * this value. This field is empty if there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * A list of `ProjectBillingInfo` resources representing the projects
    * associated with the billing account.
    */
  var projectBillingInfo: js.UndefOr[js.Array[SchemaProjectBillingInfo]] = js.native
}
object SchemaListProjectBillingInfoResponse {
  
  @scala.inline
  def apply(): SchemaListProjectBillingInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListProjectBillingInfoResponse]
  }
  
  @scala.inline
  implicit class SchemaListProjectBillingInfoResponseMutableBuilder[Self <: SchemaListProjectBillingInfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setProjectBillingInfo(value: js.Array[SchemaProjectBillingInfo]): Self = StObject.set(x, "projectBillingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectBillingInfoUndefined: Self = StObject.set(x, "projectBillingInfo", js.undefined)
    
    @scala.inline
    def setProjectBillingInfoVarargs(value: SchemaProjectBillingInfo*): Self = StObject.set(x, "projectBillingInfo", js.Array(value :_*))
  }
}
