package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetTracesResult extends js.Object {
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Full traces for the specified requests.
    */
  var Traces: js.UndefOr[TraceList] = js.native
  /**
    * Trace IDs of requests that haven't been processed.
    */
  var UnprocessedTraceIds: js.UndefOr[UnprocessedTraceIdList] = js.native
}

object BatchGetTracesResult {
  @scala.inline
  def apply(): BatchGetTracesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetTracesResult]
  }
  @scala.inline
  implicit class BatchGetTracesResultOps[Self <: BatchGetTracesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
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
    def withTraces(value: TraceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Traces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Traces")(js.undefined)
        ret
    }
    @scala.inline
    def withUnprocessedTraceIds(value: UnprocessedTraceIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedTraceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnprocessedTraceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedTraceIds")(js.undefined)
        ret
    }
  }
  
}

