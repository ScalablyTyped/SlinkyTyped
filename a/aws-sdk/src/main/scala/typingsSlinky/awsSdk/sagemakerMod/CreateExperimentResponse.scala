package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateExperimentResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the experiment.
    */
  var ExperimentArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ExperimentArn] = js.native
}

object CreateExperimentResponse {
  @scala.inline
  def apply(): CreateExperimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateExperimentResponse]
  }
  @scala.inline
  implicit class CreateExperimentResponseOps[Self <: CreateExperimentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExperimentArn(value: ExperimentArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExperimentArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExperimentArn")(js.undefined)
        ret
    }
  }
  
}

