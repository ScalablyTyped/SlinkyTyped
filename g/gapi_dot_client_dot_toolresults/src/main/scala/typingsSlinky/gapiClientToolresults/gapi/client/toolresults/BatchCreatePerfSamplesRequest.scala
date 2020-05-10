package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCreatePerfSamplesRequest extends js.Object {
  /** The set of PerfSamples to create should not include existing timestamps */
  var perfSamples: js.UndefOr[js.Array[PerfSample]] = js.native
}

object BatchCreatePerfSamplesRequest {
  @scala.inline
  def apply(): BatchCreatePerfSamplesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreatePerfSamplesRequest]
  }
  @scala.inline
  implicit class BatchCreatePerfSamplesRequestOps[Self <: BatchCreatePerfSamplesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPerfSamples(value: js.Array[PerfSample]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfSamples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerfSamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfSamples")(js.undefined)
        ret
    }
  }
  
}

