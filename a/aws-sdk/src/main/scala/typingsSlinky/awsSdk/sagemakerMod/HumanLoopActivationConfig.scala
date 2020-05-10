package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopActivationConfig extends js.Object {
  /**
    * Container structure for defining under what conditions SageMaker creates a human loop.
    */
  var HumanLoopActivationConditionsConfig: typingsSlinky.awsSdk.sagemakerMod.HumanLoopActivationConditionsConfig = js.native
  /**
    * Container for configuring the source of human task requests.
    */
  var HumanLoopRequestSource: typingsSlinky.awsSdk.sagemakerMod.HumanLoopRequestSource = js.native
}

object HumanLoopActivationConfig {
  @scala.inline
  def apply(
    HumanLoopActivationConditionsConfig: HumanLoopActivationConditionsConfig,
    HumanLoopRequestSource: HumanLoopRequestSource
  ): HumanLoopActivationConfig = {
    val __obj = js.Dynamic.literal(HumanLoopActivationConditionsConfig = HumanLoopActivationConditionsConfig.asInstanceOf[js.Any], HumanLoopRequestSource = HumanLoopRequestSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopActivationConfig]
  }
  @scala.inline
  implicit class HumanLoopActivationConfigOps[Self <: HumanLoopActivationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHumanLoopActivationConditionsConfig(value: HumanLoopActivationConditionsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopActivationConditionsConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHumanLoopRequestSource(value: HumanLoopRequestSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopRequestSource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

