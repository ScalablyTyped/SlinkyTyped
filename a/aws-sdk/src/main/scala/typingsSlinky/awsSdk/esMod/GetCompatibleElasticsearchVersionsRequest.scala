package typingsSlinky.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCompatibleElasticsearchVersionsRequest extends StObject {
  
  var DomainName: js.UndefOr[typingsSlinky.awsSdk.esMod.DomainName] = js.native
}
object GetCompatibleElasticsearchVersionsRequest {
  
  @scala.inline
  def apply(): GetCompatibleElasticsearchVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCompatibleElasticsearchVersionsRequest]
  }
  
  @scala.inline
  implicit class GetCompatibleElasticsearchVersionsRequestMutableBuilder[Self <: GetCompatibleElasticsearchVersionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
  }
}
