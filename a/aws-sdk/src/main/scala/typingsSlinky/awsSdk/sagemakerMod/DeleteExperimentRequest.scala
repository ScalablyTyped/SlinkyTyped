package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteExperimentRequest extends js.Object {
  /**
    * The name of the experiment to delete.
    */
  var ExperimentName: ExperimentEntityName = js.native
}

object DeleteExperimentRequest {
  @scala.inline
  def apply(ExperimentName: ExperimentEntityName): DeleteExperimentRequest = {
    val __obj = js.Dynamic.literal(ExperimentName = ExperimentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExperimentRequest]
  }
  @scala.inline
  implicit class DeleteExperimentRequestOps[Self <: DeleteExperimentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExperimentName(value: ExperimentEntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExperimentName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

