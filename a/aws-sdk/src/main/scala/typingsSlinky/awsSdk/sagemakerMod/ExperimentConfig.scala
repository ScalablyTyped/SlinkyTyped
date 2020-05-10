package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExperimentConfig extends js.Object {
  /**
    * The name of the experiment.
    */
  var ExperimentName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * Display name for the trial component.
    */
  var TrialComponentDisplayName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * The name of the trial.
    */
  var TrialName: js.UndefOr[ExperimentEntityName] = js.native
}

object ExperimentConfig {
  @scala.inline
  def apply(): ExperimentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentConfig]
  }
  @scala.inline
  implicit class ExperimentConfigOps[Self <: ExperimentConfig] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutExperimentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExperimentName")(js.undefined)
        ret
    }
    @scala.inline
    def withTrialComponentDisplayName(value: ExperimentEntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialComponentDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrialComponentDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialComponentDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withTrialName(value: ExperimentEntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrialName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialName")(js.undefined)
        ret
    }
  }
  
}

