package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitConfigForUpdate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the git repository. The secret must have a staging label of AWSCURRENT and must be in the following format:  {"username": UserName, "password": Password} 
    */
  var SecretArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SecretArn] = js.native
}

object GitConfigForUpdate {
  @scala.inline
  def apply(): GitConfigForUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitConfigForUpdate]
  }
  @scala.inline
  implicit class GitConfigForUpdateOps[Self <: GitConfigForUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecretArn(value: SecretArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretArn")(js.undefined)
        ret
    }
  }
  
}

