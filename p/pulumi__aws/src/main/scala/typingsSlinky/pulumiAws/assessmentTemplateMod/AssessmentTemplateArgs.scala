package typingsSlinky.pulumiAws.assessmentTemplateMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentTemplateArgs extends js.Object {
  /**
    * The duration of the inspector run.
    */
  val duration: Input[Double] = js.native
  /**
    * The name of the assessment template.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The rules to be used during the run.
    */
  val rulesPackageArns: Input[js.Array[Input[String]]] = js.native
  /**
    * The assessment target ARN to attach the template to.
    */
  val targetArn: Input[String] = js.native
}

object AssessmentTemplateArgs {
  @scala.inline
  def apply(
    duration: Input[Double],
    rulesPackageArns: Input[js.Array[Input[String]]],
    targetArn: Input[String]
  ): AssessmentTemplateArgs = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], rulesPackageArns = rulesPackageArns.asInstanceOf[js.Any], targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentTemplateArgs]
  }
  @scala.inline
  implicit class AssessmentTemplateArgsOps[Self <: AssessmentTemplateArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRulesPackageArns(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesPackageArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

