package typingsSlinky.awsLambda.codepipelineMod

import typingsSlinky.awsLambda.anon.AccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodePipelineEvent extends js.Object {
  @JSName("CodePipeline.job")
  var CodePipelineDotjob: AccountId = js.native
}

object CodePipelineEvent {
  @scala.inline
  def apply(CodePipelineDotjob: AccountId): CodePipelineEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CodePipeline.job")(CodePipelineDotjob.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodePipelineEvent]
  }
  @scala.inline
  implicit class CodePipelineEventOps[Self <: CodePipelineEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodePipelineDotjob(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodePipeline.job")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

