package typingsSlinky.oracleOraclejet.ojtrainMod

import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.ojtrainMod.ojTrain.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTrainSettableProperties extends baseComponentSettableProperties {
  var selectedStep: String = js.native
  var steps: js.Array[Step] = js.native
}

object ojTrainSettableProperties {
  @scala.inline
  def apply(selectedStep: String, steps: js.Array[Step]): ojTrainSettableProperties = {
    val __obj = js.Dynamic.literal(selectedStep = selectedStep.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTrainSettableProperties]
  }
  @scala.inline
  implicit class ojTrainSettablePropertiesOps[Self <: ojTrainSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectedStep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSteps(value: js.Array[Step]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

