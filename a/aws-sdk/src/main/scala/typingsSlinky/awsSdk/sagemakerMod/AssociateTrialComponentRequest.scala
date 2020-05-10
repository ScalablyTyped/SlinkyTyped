package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateTrialComponentRequest extends js.Object {
  /**
    * The name of the component to associated with the trial.
    */
  var TrialComponentName: ExperimentEntityName = js.native
  /**
    * The name of the trial to associate with.
    */
  var TrialName: ExperimentEntityName = js.native
}

object AssociateTrialComponentRequest {
  @scala.inline
  def apply(TrialComponentName: ExperimentEntityName, TrialName: ExperimentEntityName): AssociateTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any], TrialName = TrialName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateTrialComponentRequest]
  }
  @scala.inline
  implicit class AssociateTrialComponentRequestOps[Self <: AssociateTrialComponentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrialComponentName(value: ExperimentEntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialComponentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrialName(value: ExperimentEntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

