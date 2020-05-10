package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentResult extends js.Object {
  /**
    * The deployment ID, which can be used with other requests to identify the deployment.
    */
  var DeploymentId: js.UndefOr[String] = js.native
}

object CreateDeploymentResult {
  @scala.inline
  def apply(): CreateDeploymentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeploymentResult]
  }
  @scala.inline
  implicit class CreateDeploymentResultOps[Self <: CreateDeploymentResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentId")(js.undefined)
        ret
    }
  }
  
}

