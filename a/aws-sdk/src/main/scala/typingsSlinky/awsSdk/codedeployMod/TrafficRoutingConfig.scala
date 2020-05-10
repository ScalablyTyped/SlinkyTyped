package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficRoutingConfig extends js.Object {
  /**
    * A configuration that shifts traffic from one version of a Lambda function to another in two increments. The original and target Lambda function versions are specified in the deployment's AppSpec file.
    */
  var timeBasedCanary: js.UndefOr[TimeBasedCanary] = js.native
  /**
    * A configuration that shifts traffic from one version of a Lambda function to another in equal increments, with an equal number of minutes between each increment. The original and target Lambda function versions are specified in the deployment's AppSpec file.
    */
  var timeBasedLinear: js.UndefOr[TimeBasedLinear] = js.native
  /**
    * The type of traffic shifting (TimeBasedCanary or TimeBasedLinear) used by a deployment configuration .
    */
  var `type`: js.UndefOr[TrafficRoutingType] = js.native
}

object TrafficRoutingConfig {
  @scala.inline
  def apply(): TrafficRoutingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficRoutingConfig]
  }
  @scala.inline
  implicit class TrafficRoutingConfigOps[Self <: TrafficRoutingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimeBasedCanary(value: TimeBasedCanary): Self = {
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
    def withTimeBasedLinear(value: TimeBasedLinear): Self = {
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
    def withType(value: TrafficRoutingType): Self = {
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

