package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopActivationConditionsConfig extends js.Object {
  /**
    * JSON expressing use-case specific conditions declaratively. If any condition is matched, atomic tasks are created against the configured work team. The set of conditions is different for Rekognition and Textract.
    */
  var HumanLoopActivationConditions: typingsSlinky.awsSdk.sagemakerMod.HumanLoopActivationConditions = js.native
}

object HumanLoopActivationConditionsConfig {
  @scala.inline
  def apply(HumanLoopActivationConditions: HumanLoopActivationConditions): HumanLoopActivationConditionsConfig = {
    val __obj = js.Dynamic.literal(HumanLoopActivationConditions = HumanLoopActivationConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopActivationConditionsConfig]
  }
  @scala.inline
  implicit class HumanLoopActivationConditionsConfigOps[Self <: HumanLoopActivationConditionsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHumanLoopActivationConditions(value: HumanLoopActivationConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopActivationConditions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

