package typingsSlinky.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authorization extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the secret in Secrets Manager that your Content Distribution Network (CDN) uses for authorization to access your endpoint.
    */
  var CdnIdentifierSecret: string = js.native
  /**
    * The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
    */
  var SecretsRoleArn: string = js.native
}

object Authorization {
  @scala.inline
  def apply(CdnIdentifierSecret: string, SecretsRoleArn: string): Authorization = {
    val __obj = js.Dynamic.literal(CdnIdentifierSecret = CdnIdentifierSecret.asInstanceOf[js.Any], SecretsRoleArn = SecretsRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
  @scala.inline
  implicit class AuthorizationOps[Self <: Authorization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCdnIdentifierSecret(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CdnIdentifierSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecretsRoleArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretsRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

