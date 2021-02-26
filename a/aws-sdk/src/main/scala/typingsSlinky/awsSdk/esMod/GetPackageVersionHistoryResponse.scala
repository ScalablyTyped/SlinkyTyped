package typingsSlinky.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPackageVersionHistoryResponse extends StObject {
  
  var NextToken: js.UndefOr[String] = js.native
  
  var PackageID: js.UndefOr[typingsSlinky.awsSdk.esMod.PackageID] = js.native
  
  /**
    * List of PackageVersionHistory objects.
    */
  var PackageVersionHistoryList: js.UndefOr[typingsSlinky.awsSdk.esMod.PackageVersionHistoryList] = js.native
}
object GetPackageVersionHistoryResponse {
  
  @scala.inline
  def apply(): GetPackageVersionHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPackageVersionHistoryResponse]
  }
  
  @scala.inline
  implicit class GetPackageVersionHistoryResponseMutableBuilder[Self <: GetPackageVersionHistoryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPackageID(value: PackageID): Self = StObject.set(x, "PackageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageIDUndefined: Self = StObject.set(x, "PackageID", js.undefined)
    
    @scala.inline
    def setPackageVersionHistoryList(value: PackageVersionHistoryList): Self = StObject.set(x, "PackageVersionHistoryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageVersionHistoryListUndefined: Self = StObject.set(x, "PackageVersionHistoryList", js.undefined)
    
    @scala.inline
    def setPackageVersionHistoryListVarargs(value: PackageVersionHistory*): Self = StObject.set(x, "PackageVersionHistoryList", js.Array(value :_*))
  }
}
