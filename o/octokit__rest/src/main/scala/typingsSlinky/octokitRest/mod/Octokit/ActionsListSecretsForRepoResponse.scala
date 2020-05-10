package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsListSecretsForRepoResponse extends js.Object {
  var secrets: js.Array[ActionsListSecretsForRepoResponseSecretsItem] = js.native
  var total_count: Double = js.native
}

object ActionsListSecretsForRepoResponse {
  @scala.inline
  def apply(secrets: js.Array[ActionsListSecretsForRepoResponseSecretsItem], total_count: Double): ActionsListSecretsForRepoResponse = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListSecretsForRepoResponse]
  }
  @scala.inline
  implicit class ActionsListSecretsForRepoResponseOps[Self <: ActionsListSecretsForRepoResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecrets(value: js.Array[ActionsListSecretsForRepoResponseSecretsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secrets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

