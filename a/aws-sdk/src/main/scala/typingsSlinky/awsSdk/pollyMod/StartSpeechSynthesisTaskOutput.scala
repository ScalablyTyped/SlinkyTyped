package typingsSlinky.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSpeechSynthesisTaskOutput extends js.Object {
  /**
    * SynthesisTask object that provides information and attributes about a newly submitted speech synthesis task.
    */
  var SynthesisTask: js.UndefOr[typingsSlinky.awsSdk.pollyMod.SynthesisTask] = js.native
}

object StartSpeechSynthesisTaskOutput {
  @scala.inline
  def apply(): StartSpeechSynthesisTaskOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSpeechSynthesisTaskOutput]
  }
  @scala.inline
  implicit class StartSpeechSynthesisTaskOutputOps[Self <: StartSpeechSynthesisTaskOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSynthesisTask(value: SynthesisTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SynthesisTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynthesisTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SynthesisTask")(js.undefined)
        ret
    }
  }
  
}

