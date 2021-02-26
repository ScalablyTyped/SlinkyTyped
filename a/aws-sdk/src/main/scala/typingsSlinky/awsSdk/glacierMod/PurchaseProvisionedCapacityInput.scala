package typingsSlinky.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseProvisionedCapacityInput extends StObject {
  
  /**
    * The AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, don't include any hyphens ('-') in the ID. 
    */
  var accountId: String = js.native
}
object PurchaseProvisionedCapacityInput {
  
  @scala.inline
  def apply(accountId: String): PurchaseProvisionedCapacityInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseProvisionedCapacityInput]
  }
  
  @scala.inline
  implicit class PurchaseProvisionedCapacityInputMutableBuilder[Self <: PurchaseProvisionedCapacityInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
  }
}
