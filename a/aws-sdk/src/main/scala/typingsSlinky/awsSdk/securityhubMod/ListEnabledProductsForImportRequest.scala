package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEnabledProductsForImportRequest extends js.Object {
  
  /**
    * The maximum number of items to return in the response.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.MaxResults] = js.native
  
  /**
    * The token that is required for pagination. On your first call to the ListEnabledProductsForImport operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.NextToken] = js.native
}
object ListEnabledProductsForImportRequest {
  
  @scala.inline
  def apply(): ListEnabledProductsForImportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnabledProductsForImportRequest]
  }
  
  @scala.inline
  implicit class ListEnabledProductsForImportRequestOps[Self <: ListEnabledProductsForImportRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
