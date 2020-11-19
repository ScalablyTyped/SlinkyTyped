package typingsSlinky.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainEncryptAtRest extends js.Object {
  
  /**
    * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
    */
  var enabled: Boolean = js.native
  
  /**
    * The KMS key id to encrypt the Elasticsearch domain with. If not specified then it defaults to using the `aws/es` service KMS key.
    */
  var kmsKeyId: String = js.native
}
object DomainEncryptAtRest {
  
  @scala.inline
  def apply(enabled: Boolean, kmsKeyId: String): DomainEncryptAtRest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainEncryptAtRest]
  }
  
  @scala.inline
  implicit class DomainEncryptAtRestOps[Self <: DomainEncryptAtRest] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
  }
}
