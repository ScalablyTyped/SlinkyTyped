package typingsSlinky.pulumiAws.inputMod.codedeploy

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentConfigTrafficRoutingConfig extends js.Object {
  var timeBasedCanary: js.UndefOr[Input[DeploymentConfigTrafficRoutingConfigTimeBasedCanary]] = js.native
  var timeBasedLinear: js.UndefOr[Input[DeploymentConfigTrafficRoutingConfigTimeBasedLinear]] = js.native
  var `type`: js.UndefOr[Input[String]] = js.native
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
    def withTimeBasedCanary(value: Input[DeploymentConfigTrafficRoutingConfigTimeBasedCanary]): Self = {
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
    def withTimeBasedLinear(value: Input[DeploymentConfigTrafficRoutingConfigTimeBasedLinear]): Self = {
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
    def withType(value: Input[String]): Self = {
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

