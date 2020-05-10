package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentJobRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: ClientRequestToken = js.native
  /**
    * The deployment application configuration.
    */
  var deploymentApplicationConfigs: DeploymentApplicationConfigs = js.native
  /**
    * The requested deployment configuration.
    */
  var deploymentConfig: js.UndefOr[DeploymentConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) of the fleet to deploy.
    */
  var fleet: Arn = js.native
  /**
    * A map that contains tag keys and tag values that are attached to the deployment job.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateDeploymentJobRequest {
  @scala.inline
  def apply(
    clientRequestToken: ClientRequestToken,
    deploymentApplicationConfigs: DeploymentApplicationConfigs,
    fleet: Arn
  ): CreateDeploymentJobRequest = {
    val __obj = js.Dynamic.literal(clientRequestToken = clientRequestToken.asInstanceOf[js.Any], deploymentApplicationConfigs = deploymentApplicationConfigs.asInstanceOf[js.Any], fleet = fleet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentJobRequest]
  }
  @scala.inline
  implicit class CreateDeploymentJobRequestOps[Self <: CreateDeploymentJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeploymentApplicationConfigs(value: DeploymentApplicationConfigs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentApplicationConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFleet(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fleet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeploymentConfig(value: DeploymentConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

