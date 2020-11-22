package typingsSlinky.pulumiAws.inputMod.emr

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterStep extends js.Object {
  
  /**
    * The action to take if the step fails. Valid values: `TERMINATE_JOB_FLOW`, `TERMINATE_CLUSTER`, `CANCEL_AND_WAIT`, and `CONTINUE`
    */
  var actionOnFailure: Input[String] = js.native
  
  /**
    * The JAR file used for the step. Defined below.
    */
  var hadoopJarStep: Input[ClusterStepHadoopJarStep] = js.native
  
  /**
    * Friendly name given to the instance fleet.
    */
  var name: Input[String] = js.native
}
object ClusterStep {
  
  @scala.inline
  def apply(
    actionOnFailure: Input[String],
    hadoopJarStep: Input[ClusterStepHadoopJarStep],
    name: Input[String]
  ): ClusterStep = {
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionOnFailure(value: Input[String]): Self = this.set("actionOnFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHadoopJarStep(value: Input[ClusterStepHadoopJarStep]): Self = this.set("hadoopJarStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
