package typingsSlinky.pulumiAws.outputMod.codebuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectEnvironmentRegistryCredential extends js.Object {
  /**
    * The Amazon Resource Name (ARN) or name of credentials created using AWS Secrets Manager.
    */
  var credential: String = js.native
  /**
    * The service that created the credentials to access a private Docker registry. The valid value, SECRETS_MANAGER, is for AWS Secrets Manager.
    */
  var credentialProvider: String = js.native
}

object ProjectEnvironmentRegistryCredential {
  @scala.inline
  def apply(credential: String, credentialProvider: String): ProjectEnvironmentRegistryCredential = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], credentialProvider = credentialProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectEnvironmentRegistryCredential]
  }
  @scala.inline
  implicit class ProjectEnvironmentRegistryCredentialOps[Self <: ProjectEnvironmentRegistryCredential] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredential(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredentialProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialProvider")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

