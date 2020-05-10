package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchRecord extends js.Object {
  /**
    * A summary of the properties of an experiment.
    */
  var Experiment: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.Experiment] = js.native
  /**
    * A TrainingJob object that is returned as part of a Search request.
    */
  var TrainingJob: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrainingJob] = js.native
  /**
    * A summary of the properties of a trial.
    */
  var Trial: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.Trial] = js.native
  /**
    * A summary of the properties of a trial component.
    */
  var TrialComponent: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrialComponent] = js.native
}

object SearchRecord {
  @scala.inline
  def apply(): SearchRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchRecord]
  }
  @scala.inline
  implicit class SearchRecordOps[Self <: SearchRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExperiment(value: Experiment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Experiment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperiment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Experiment")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingJob(value: TrainingJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJob")(js.undefined)
        ret
    }
    @scala.inline
    def withTrial(value: Trial): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Trial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Trial")(js.undefined)
        ret
    }
    @scala.inline
    def withTrialComponent(value: TrialComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrialComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialComponent")(js.undefined)
        ret
    }
  }
  
}

