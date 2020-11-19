package typingsSlinky.pulumiAws.inputMod.mq

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrokerEncryptionOptions extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of Key Management Service (KMS) Customer Master Key (CMK) to use for encryption at rest. Requires setting `useAwsOwnedKey` to `false`. To perform drift detection when AWS managed CMKs or customer managed CMKs are in use, this value must be configured.
    */
  var kmsKeyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Boolean to enable an AWS owned Key Management Service (KMS) Customer Master Key (CMK) that is not in your account. Defaults to `true`. Setting to `false` without configuring `kmsKeyId` will create an AWS managed Customer Master Key (CMK) aliased to `aws/mq` in your account.
    */
  var useAwsOwnedKey: js.UndefOr[Input[Boolean]] = js.native
}
object BrokerEncryptionOptions {
  
  @scala.inline
  def apply(): BrokerEncryptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerEncryptionOptions]
  }
  
  @scala.inline
  implicit class BrokerEncryptionOptionsOps[Self <: BrokerEncryptionOptions] (val x: Self) extends AnyVal {
    
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
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    
    @scala.inline
    def setUseAwsOwnedKey(value: Input[Boolean]): Self = this.set("useAwsOwnedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAwsOwnedKey: Self = this.set("useAwsOwnedKey", js.undefined)
  }
}
