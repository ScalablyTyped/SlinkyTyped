package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunPipelineActivityResponse extends js.Object {
  /**
    * In case the pipeline activity fails, the log message that is generated.
    */
  var logResult: js.UndefOr[LogResult] = js.native
  /**
    * The enriched or transformed sample message payloads as base64-encoded strings. (The results of running the pipeline activity on each input sample message payload, encoded in base64.)
    */
  var payloads: js.UndefOr[MessagePayloads] = js.native
}

object RunPipelineActivityResponse {
  @scala.inline
  def apply(): RunPipelineActivityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunPipelineActivityResponse]
  }
  @scala.inline
  implicit class RunPipelineActivityResponseOps[Self <: RunPipelineActivityResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogResult(value: LogResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logResult")(js.undefined)
        ret
    }
    @scala.inline
    def withPayloads(value: MessagePayloads): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayloads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloads")(js.undefined)
        ret
    }
  }
  
}

