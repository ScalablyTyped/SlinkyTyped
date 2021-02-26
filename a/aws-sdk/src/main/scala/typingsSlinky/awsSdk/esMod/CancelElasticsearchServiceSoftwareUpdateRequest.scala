package typingsSlinky.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelElasticsearchServiceSoftwareUpdateRequest extends StObject {
  
  /**
    * The name of the domain that you want to stop the latest service software update on.
    */
  var DomainName: typingsSlinky.awsSdk.esMod.DomainName = js.native
}
object CancelElasticsearchServiceSoftwareUpdateRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): CancelElasticsearchServiceSoftwareUpdateRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelElasticsearchServiceSoftwareUpdateRequest]
  }
  
  @scala.inline
  implicit class CancelElasticsearchServiceSoftwareUpdateRequestMutableBuilder[Self <: CancelElasticsearchServiceSoftwareUpdateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
