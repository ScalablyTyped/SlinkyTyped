package typingsSlinky.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSecretResponse extends StObject {
  
  /**
    * The ARN of the secret that was updated.  Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a new secret with the same name as an old secret that you previously deleted, then users with access to the old secret don't automatically get access to the new secret because the ARNs are different. 
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  
  /**
    * The friendly name of the secret that was updated.
    */
  var Name: js.UndefOr[SecretNameType] = js.native
  
  /**
    * If a new version of the secret was created by this operation, then VersionId contains the unique identifier of the new version.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.native
}
object UpdateSecretResponse {
  
  @scala.inline
  def apply(): UpdateSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSecretResponse]
  }
  
  @scala.inline
  implicit class UpdateSecretResponseMutableBuilder[Self <: UpdateSecretResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setName(value: SecretNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setVersionId(value: SecretVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
