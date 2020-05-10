package typingsSlinky.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSpeechSynthesisTasksOutput extends js.Object {
  /**
    * An opaque pagination token returned from the previous List operation in this request. If present, this indicates where to continue the listing.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.pollyMod.NextToken] = js.native
  /**
    * List of SynthesisTask objects that provides information from the specified task in the list request, including output format, creation time, task status, and so on.
    */
  var SynthesisTasks: js.UndefOr[typingsSlinky.awsSdk.pollyMod.SynthesisTasks] = js.native
}

object ListSpeechSynthesisTasksOutput {
  @scala.inline
  def apply(): ListSpeechSynthesisTasksOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSpeechSynthesisTasksOutput]
  }
  @scala.inline
  implicit class ListSpeechSynthesisTasksOutputOps[Self <: ListSpeechSynthesisTasksOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSynthesisTasks(value: SynthesisTasks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SynthesisTasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynthesisTasks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SynthesisTasks")(js.undefined)
        ret
    }
  }
  
}

