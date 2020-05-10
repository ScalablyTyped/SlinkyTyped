package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceOperationRequest extends js.Object {
  /** Information about a request to get metadata about a source. */
  var getMetadata: js.UndefOr[SourceGetMetadataRequest] = js.native
  /** Information about a request to split a source. */
  var split: js.UndefOr[SourceSplitRequest] = js.native
}

object SourceOperationRequest {
  @scala.inline
  def apply(): SourceOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceOperationRequest]
  }
  @scala.inline
  implicit class SourceOperationRequestOps[Self <: SourceOperationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMetadata(value: SourceGetMetadataRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withSplit(value: SourceSplitRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(js.undefined)
        ret
    }
  }
  
}

