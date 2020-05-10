package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGitHubAccountTokenOutput extends js.Object {
  /**
    * The name of the GitHub account connection that was deleted.
    */
  var tokenName: js.UndefOr[GitHubAccountTokenName] = js.native
}

object DeleteGitHubAccountTokenOutput {
  @scala.inline
  def apply(): DeleteGitHubAccountTokenOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGitHubAccountTokenOutput]
  }
  @scala.inline
  implicit class DeleteGitHubAccountTokenOutputOps[Self <: DeleteGitHubAccountTokenOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTokenName(value: GitHubAccountTokenName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenName")(js.undefined)
        ret
    }
  }
  
}

