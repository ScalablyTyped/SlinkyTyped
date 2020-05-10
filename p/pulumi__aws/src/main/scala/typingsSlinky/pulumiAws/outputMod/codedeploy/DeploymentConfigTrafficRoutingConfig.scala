package typingsSlinky.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentConfigTrafficRoutingConfig extends js.Object {
  var timeBasedCanary: js.UndefOr[DeploymentConfigTrafficRoutingConfigTimeBasedCanary] = js.native
  var timeBasedLinear: js.UndefOr[DeploymentConfigTrafficRoutingConfigTimeBasedLinear] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object DeploymentConfigTrafficRoutingConfig {
  @scala.inline
  def apply(): DeploymentConfigTrafficRoutingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentConfigTrafficRoutingConfig]
  }
  @scala.inline
  implicit class DeploymentConfigTrafficRoutingConfigOps[Self <: DeploymentConfigTrafficRoutingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimeBasedCanary(value: DeploymentConfigTrafficRoutingConfigTimeBasedCanary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeBasedCanary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeBasedCanary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeBasedCanary")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeBasedLinear(value: DeploymentConfigTrafficRoutingConfigTimeBasedLinear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeBasedLinear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeBasedLinear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeBasedLinear")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

