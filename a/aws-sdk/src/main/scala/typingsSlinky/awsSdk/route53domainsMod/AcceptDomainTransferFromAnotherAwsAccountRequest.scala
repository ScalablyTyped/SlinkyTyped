package typingsSlinky.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptDomainTransferFromAnotherAwsAccountRequest extends StObject {
  
  /**
    * The name of the domain that was specified when another AWS account submitted a TransferDomainToAnotherAwsAccount request. 
    */
  var DomainName: typingsSlinky.awsSdk.route53domainsMod.DomainName = js.native
  
  /**
    * The password that was returned by the TransferDomainToAnotherAwsAccount request. 
    */
  var Password: String = js.native
}
object AcceptDomainTransferFromAnotherAwsAccountRequest {
  
  @scala.inline
  def apply(DomainName: DomainName, Password: String): AcceptDomainTransferFromAnotherAwsAccountRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptDomainTransferFromAnotherAwsAccountRequest]
  }
  
  @scala.inline
  implicit class AcceptDomainTransferFromAnotherAwsAccountRequestMutableBuilder[Self <: AcceptDomainTransferFromAnotherAwsAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
  }
}
