package typingsSlinky.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainDetailRequest extends StObject {
  
  /**
    * The name of the domain that you want to get detailed information about.
    */
  var DomainName: typingsSlinky.awsSdk.route53domainsMod.DomainName = js.native
}
object GetDomainDetailRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): GetDomainDetailRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainDetailRequest]
  }
  
  @scala.inline
  implicit class GetDomainDetailRequestMutableBuilder[Self <: GetDomainDetailRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
