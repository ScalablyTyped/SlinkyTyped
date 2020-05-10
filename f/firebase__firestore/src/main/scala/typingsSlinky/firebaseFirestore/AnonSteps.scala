package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.specsSpecTestRunnerMod.SpecConfig
import typingsSlinky.firebaseFirestore.specsSpecTestRunnerMod.SpecStep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSteps extends js.Object {
  var config: SpecConfig = js.native
  var steps: js.Array[SpecStep] = js.native
}

object AnonSteps {
  @scala.inline
  def apply(config: SpecConfig, steps: js.Array[SpecStep]): AnonSteps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSteps]
  }
  @scala.inline
  implicit class AnonStepsOps[Self <: AnonSteps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: SpecConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSteps(value: js.Array[SpecStep]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

