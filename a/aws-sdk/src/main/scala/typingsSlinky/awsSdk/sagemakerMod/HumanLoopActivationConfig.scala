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
}

