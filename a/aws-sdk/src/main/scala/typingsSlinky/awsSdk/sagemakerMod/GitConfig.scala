package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitConfig extends js.Object {
  /**
    * The default branch for the Git repository.
    */
  var Branch: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.Branch] = js.native
  /**
    * The URL where the Git repository is located.
    */
  var RepositoryUrl: GitConfigUrl = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the git repository. The secret must have a staging label of AWSCURRENT and must be in the following format:  {"username": UserName, "password": Password} 
    */
  var SecretArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SecretArn] = js.native
}

object GitConfig {
  @scala.inline
  def apply(RepositoryUrl: GitConfigUrl): GitConfig = {
    val __obj = js.Dynamic.literal(RepositoryUrl = RepositoryUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitConfig]
  }
  @scala.inline
  implicit class GitConfigOps[Self <: GitConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepositoryUrl(value: GitConfigUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepositoryUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranch(value: Branch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Branch")(js.undefined)
        ret
    }
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

