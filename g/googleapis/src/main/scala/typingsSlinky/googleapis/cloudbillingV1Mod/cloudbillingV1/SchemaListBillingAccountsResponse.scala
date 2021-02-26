package typingsSlinky.googleapis.cloudbillingV1Mod.cloudbillingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for `ListBillingAccounts`.
  */
@js.native
trait SchemaListBillingAccountsResponse extends StObject {
  
  /**
    * A list of billing accounts.
    */
  var billingAccounts: js.UndefOr[js.Array[SchemaBillingAccount]] = js.native
  
  /**
    * A token to retrieve the next page of results. To retrieve the next page,
    * call `ListBillingAccounts` again with the `page_token` field set to this
    * value. This field is empty if there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListBillingAccountsResponse {
  
  @scala.inline
  def apply(): SchemaListBillingAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBillingAccountsResponse]
  }
  
  @scala.inline
  implicit class SchemaListBillingAccountsResponseMutableBuilder[Self <: SchemaListBillingAccountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingAccounts(value: js.Array[SchemaBillingAccount]): Self = StObject.set(x, "billingAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingAccountsUndefined: Self = StObject.set(x, "billingAccounts", js.undefined)
    
    @scala.inline
    def setBillingAccountsVarargs(value: SchemaBillingAccount*): Self = StObject.set(x, "billingAccounts", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
