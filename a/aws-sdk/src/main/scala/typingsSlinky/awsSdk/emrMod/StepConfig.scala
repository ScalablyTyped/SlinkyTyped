package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepConfig extends js.Object {
  /**
    * The action to take when the cluster step fails. Possible values are TERMINATE_CLUSTER, CANCEL_AND_WAIT, and CONTINUE. TERMINATE_JOB_FLOW is provided for backward compatibility. We recommend using TERMINATE_CLUSTER instead.
    */
  var ActionOnFailure: js.UndefOr[typingsSlinky.awsSdk.emrMod.ActionOnFailure] = js.native
  /**
    * The JAR file used for the step.
    */
  var HadoopJarStep: HadoopJarStepConfig = js.native
  /**
    * The name of the step.
    */
  var Name: XmlStringMaxLen256 = js.native
}

object StepConfig {
  @scala.inline
  def apply(HadoopJarStep: HadoopJarStepConfig, Name: XmlStringMaxLen256): StepConfig = {
    val __obj = js.Dynamic.literal(HadoopJarStep = HadoopJarStep.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepConfig]
  }
  @scala.inline
  implicit class StepConfigOps[Self <: StepConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHadoopJarStep(value: HadoopJarStepConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HadoopJarStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: XmlStringMaxLen256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionOnFailure(value: ActionOnFailure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionOnFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionOnFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionOnFailure")(js.undefined)
        ret
    }
  }
  
}

