package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunPipelineActivityRequest extends js.Object {
  /**
    * The sample message payloads on which the pipeline activity is run.
    */
  var payloads: MessagePayloads = js.native
  /**
    * The pipeline activity that is run. This must not be a 'channel' activity or a 'datastore' activity because these activities are used in a pipeline only to load the original message and to store the (possibly) transformed message. If a 'lambda' activity is specified, only short-running Lambda functions (those with a timeout of less than 30 seconds or less) can be used.
    */
  var pipelineActivity: PipelineActivity = js.native
}

object RunPipelineActivityRequest {
  @scala.inline
  def apply(payloads: MessagePayloads, pipelineActivity: PipelineActivity): RunPipelineActivityRequest = {
    val __obj = js.Dynamic.literal(payloads = payloads.asInstanceOf[js.Any], pipelineActivity = pipelineActivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunPipelineActivityRequest]
  }
  @scala.inline
  implicit class RunPipelineActivityRequestOps[Self <: RunPipelineActivityRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayloads(value: MessagePayloads): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPipelineActivity(value: PipelineActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineActivity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

