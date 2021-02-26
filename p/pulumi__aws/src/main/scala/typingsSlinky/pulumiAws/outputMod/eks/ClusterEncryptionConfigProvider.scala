package typingsSlinky.pulumiAws.outputMod.eks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterEncryptionConfigProvider extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the Key Management Service (KMS) customer master key (CMK). The CMK must be symmetric, created in the same region as the cluster, and if the CMK was created in a different account, the user must have access to the CMK. For more information, see [Allowing Users in Other Accounts to Use a CMK in the AWS Key Management Service Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-modifying-external-accounts.html).
    */
  var keyArn: String = js.native
}
object ClusterEncryptionConfigProvider {
  
  @scala.inline
  def apply(keyArn: String): ClusterEncryptionConfigProvider = {
    val __obj = js.Dynamic.literal(keyArn = keyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEncryptionConfigProvider]
  }
  
  @scala.inline
  implicit class ClusterEncryptionConfigProviderMutableBuilder[Self <: ClusterEncryptionConfigProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyArn(value: String): Self = StObject.set(x, "keyArn", value.asInstanceOf[js.Any])
  }
}
