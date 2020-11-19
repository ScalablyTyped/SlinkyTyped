package typingsSlinky.pulumiAws.inputMod.eks

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterEncryptionConfigProvider extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the Key Management Service (KMS) customer master key (CMK). The CMK must be symmetric, created in the same region as the cluster, and if the CMK was created in a different account, the user must have access to the CMK. For more information, see [Allowing Users in Other Accounts to Use a CMK in the AWS Key Management Service Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-modifying-external-accounts.html).
    */
  var keyArn: Input[String] = js.native
}
object ClusterEncryptionConfigProvider {
  
  @scala.inline
  def apply(keyArn: Input[String]): ClusterEncryptionConfigProvider = {
    val __obj = js.Dynamic.literal(keyArn = keyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEncryptionConfigProvider]
  }
  
  @scala.inline
  implicit class ClusterEncryptionConfigProviderOps[Self <: ClusterEncryptionConfigProvider] (val x: Self) extends AnyVal {
    
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
    def setKeyArn(value: Input[String]): Self = this.set("keyArn", value.asInstanceOf[js.Any])
  }
}
