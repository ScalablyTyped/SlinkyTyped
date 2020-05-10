package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingJobStoppingConditions extends js.Object {
  /**
    * The maximum number of objects that can be labeled by human workers.
    */
  var MaxHumanLabeledObjectCount: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxHumanLabeledObjectCount] = js.native
  /**
    * The maximum number of input data objects that should be labeled.
    */
  var MaxPercentageOfInputDatasetLabeled: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxPercentageOfInputDatasetLabeled] = js.native
}

object LabelingJobStoppingConditions {
  @scala.inline
  def apply(): LabelingJobStoppingConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelingJobStoppingConditions]
  }
  @scala.inline
  implicit class LabelingJobStoppingConditionsOps[Self <: LabelingJobStoppingConditions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxHumanLabeledObjectCount(value: MaxHumanLabeledObjectCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxHumanLabeledObjectCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHumanLabeledObjectCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxHumanLabeledObjectCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPercentageOfInputDatasetLabeled(value: MaxPercentageOfInputDatasetLabeled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxPercentageOfInputDatasetLabeled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPercentageOfInputDatasetLabeled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxPercentageOfInputDatasetLabeled")(js.undefined)
        ret
    }
  }
  
}

