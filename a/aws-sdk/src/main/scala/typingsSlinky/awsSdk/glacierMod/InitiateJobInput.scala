package typingsSlinky.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitiateJobInput extends StObject {
  
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
    */
  var accountId: String = js.native
  
  /**
    * Provides options for specifying job information.
    */
  var jobParameters: js.UndefOr[JobParameters] = js.native
  
  /**
    * The name of the vault.
    */
  var vaultName: String = js.native
}
object InitiateJobInput {
  
  @scala.inline
  def apply(accountId: String, vaultName: String): InitiateJobInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateJobInput]
  }
  
  @scala.inline
  implicit class InitiateJobInputMutableBuilder[Self <: InitiateJobInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobParameters(value: JobParameters): Self = StObject.set(x, "jobParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobParametersUndefined: Self = StObject.set(x, "jobParameters", js.undefined)
    
    @scala.inline
    def setVaultName(value: String): Self = StObject.set(x, "vaultName", value.asInstanceOf[js.Any])
  }
}
