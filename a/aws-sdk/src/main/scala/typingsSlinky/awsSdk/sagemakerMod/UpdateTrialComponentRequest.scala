package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTrialComponentRequest extends js.Object {
  /**
    * The name of the component as displayed. The name doesn't need to be unique. If DisplayName isn't specified, TrialComponentName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * When the component ended.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * Replaces all of the component's input artifacts with the specified artifacts.
    */
  var InputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.native
  /**
    * The input artifacts to remove from the component.
    */
  var InputArtifactsToRemove: js.UndefOr[ListTrialComponentKey256] = js.native
  /**
    * Replaces all of the component's output artifacts with the specified artifacts.
    */
  var OutputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.native
  /**
    * The output artifacts to remove from the component.
    */
  var OutputArtifactsToRemove: js.UndefOr[ListTrialComponentKey256] = js.native
  /**
    * Replaces all of the component's hyperparameters with the specified hyperparameters.
    */
  var Parameters: js.UndefOr[TrialComponentParameters] = js.native
  /**
    * The hyperparameters to remove from the component.
    */
  var ParametersToRemove: js.UndefOr[ListTrialComponentKey256] = js.native
  /**
    * When the component started.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * The new status of the component.
    */
  var Status: js.UndefOr[TrialComponentStatus] = js.native
  /**
    * The name of the component to update.
    */
  var TrialComponentName: ExperimentEntityName = js.native
}

object UpdateTrialComponentRequest {
  @scala.inline
  def apply(TrialComponentName: ExperimentEntityName): UpdateTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrialComponentRequest]
  }
  @scala.inline
  implicit class UpdateTrialComponentRequestOps[Self <: UpdateTrialComponentRequest] (val x: Self) extends AnyVal {
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
    def withDisplayName(value: ExperimentEntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withInputArtifacts(value: TrialComponentArtifacts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputArtifacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputArtifacts")(js.undefined)
        ret
    }
    @scala.inline
    def withInputArtifactsToRemove(value: ListTrialComponentKey256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputArtifactsToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputArtifactsToRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputArtifactsToRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputArtifacts(value: TrialComponentArtifacts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputArtifacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputArtifacts")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputArtifactsToRemove(value: ListTrialComponentKey256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputArtifactsToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputArtifactsToRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputArtifactsToRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: TrialComponentParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withParametersToRemove(value: ListTrialComponentKey256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParametersToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParametersToRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParametersToRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: TrialComponentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

