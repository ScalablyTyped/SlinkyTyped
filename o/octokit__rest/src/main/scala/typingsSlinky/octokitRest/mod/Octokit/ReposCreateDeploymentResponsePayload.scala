package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposCreateDeploymentResponsePayload extends js.Object {
  var deploy: String = js.native
}

object ReposCreateDeploymentResponsePayload {
  @scala.inline
  def apply(deploy: String): ReposCreateDeploymentResponsePayload = {
    val __obj = js.Dynamic.literal(deploy = deploy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateDeploymentResponsePayload]
  }
  @scala.inline
  implicit class ReposCreateDeploymentResponsePayloadOps[Self <: ReposCreateDeploymentResponsePayload] (val x: Self) extends AnyVal {
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

