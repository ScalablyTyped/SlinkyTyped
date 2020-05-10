package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetDeploymentResponsePayload extends js.Object {
  var deploy: String = js.native
}

object ReposGetDeploymentResponsePayload {
  @scala.inline
  def apply(deploy: String): ReposGetDeploymentResponsePayload = {
    val __obj = js.Dynamic.literal(deploy = deploy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetDeploymentResponsePayload]
  }
  @scala.inline
  implicit class ReposGetDeploymentResponsePayloadOps[Self <: ReposGetDeploymentResponsePayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

