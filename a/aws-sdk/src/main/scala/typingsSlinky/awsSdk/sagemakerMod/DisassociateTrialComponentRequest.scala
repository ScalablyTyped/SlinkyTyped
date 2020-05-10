package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateTrialComponentRequest extends js.Object {
  /**
    * The name of the component to disassociate from the trial.
    */
  var TrialComponentName: ExperimentEntityName = js.native
  /**
    * The name of the trial to disassociate from.
    */
  var TrialName: ExperimentEntityName = js.native
}

object DisassociateTrialComponentRequest {
  @scala.inline
  def apply(TrialComponentName: ExperimentEntityName, TrialName: ExperimentEntityName): DisassociateTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any], TrialName = TrialName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateTrialComponentRequest]
  }
  @scala.inline
  implicit class DisassociateTrialComponentRequestOps[Self <: DisassociateTrialComponentRequest] (val x: Self) extends AnyVal {
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

