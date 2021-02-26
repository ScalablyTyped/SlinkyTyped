package typingsSlinky.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferDomainToAnotherAwsAccountRequest extends StObject {
  
  /**
    * The account ID of the AWS account that you want to transfer the domain to, for example, 111122223333.
    */
  var AccountId: typingsSlinky.awsSdk.route53domainsMod.AccountId = js.native
  
  /**
    * The name of the domain that you want to transfer from the current AWS account to another account.
    */
  var DomainName: typingsSlinky.awsSdk.route53domainsMod.DomainName = js.native
}
object TransferDomainToAnotherAwsAccountRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, DomainName: DomainName): TransferDomainToAnotherAwsAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferDomainToAnotherAwsAccountRequest]
  }
  
  @scala.inline
  implicit class TransferDomainToAnotherAwsAccountRequestMutableBuilder[Self <: TransferDomainToAnotherAwsAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
