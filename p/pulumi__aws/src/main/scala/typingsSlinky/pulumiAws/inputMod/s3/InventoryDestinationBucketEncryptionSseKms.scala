package typingsSlinky.pulumiAws.inputMod.s3

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryDestinationBucketEncryptionSseKms extends js.Object {
  
  /**
    * The ARN of the KMS customer master key (CMK) used to encrypt the inventory file.
    */
  var keyId: Input[String] = js.native
}
object InventoryDestinationBucketEncryptionSseKms {
  
  @scala.inline
  def apply(keyId: Input[String]): InventoryDestinationBucketEncryptionSseKms = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryDestinationBucketEncryptionSseKms]
  }
  
  @scala.inline
  implicit class InventoryDestinationBucketEncryptionSseKmsOps[Self <: InventoryDestinationBucketEncryptionSseKms] (val x: Self) extends AnyVal {
    
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
    def setKeyId(value: Input[String]): Self = this.set("keyId", value.asInstanceOf[js.Any])
  }
}
