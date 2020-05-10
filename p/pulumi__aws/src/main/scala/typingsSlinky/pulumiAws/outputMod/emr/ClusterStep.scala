package typingsSlinky.pulumiAws.outputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterStep extends js.Object {
  var actionOnFailure: String = js.native
  var hadoopJarStep: ClusterStepHadoopJarStep = js.native
  /**
    * The name of the job flow
    */
  var name: String = js.native
}

object ClusterStep {
  @scala.inline
  def apply(actionOnFailure: String, hadoopJarStep: ClusterStepHadoopJarStep, name: String): ClusterStep = {
    val __obj = js.Dynamic.literal(actionOnFailure = actionOnFailure.asInstanceOf[js.Any], hadoopJarStep = hadoopJarStep.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStep]
  }
  @scala.inline
  implicit class ClusterStepOps[Self <: ClusterStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionOnFailure(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionOnFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHadoopJarStep(value: ClusterStepHadoopJarStep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hadoopJarStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

