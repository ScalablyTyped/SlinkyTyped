package typingsSlinky.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetrieveDomainAuthCodeRequest extends StObject {
  
  /**
    * The name of the domain that you want to get an authorization code for.
    */
  var DomainName: typingsSlinky.awsSdk.route53domainsMod.DomainName = js.native
}
object RetrieveDomainAuthCodeRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): RetrieveDomainAuthCodeRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveDomainAuthCodeRequest]
  }
  
  @scala.inline
  implicit class RetrieveDomainAuthCodeRequestMutableBuilder[Self <: RetrieveDomainAuthCodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
