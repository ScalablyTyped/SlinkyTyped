package typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.QueryPlanNode

import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.ITrace
import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.google.protobuf.ITimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FetchNode. */
@js.native
trait IFetchNode extends js.Object {
  /** FetchNode receivedTime */
  var receivedTime: js.UndefOr[ITimestamp | Null] = js.native
  /** FetchNode sentTime */
  var sentTime: js.UndefOr[ITimestamp | Null] = js.native
  /** FetchNode sentTimeOffset */
  var sentTimeOffset: js.UndefOr[Double | Null] = js.native
  /** FetchNode serviceName */
  var serviceName: js.UndefOr[String | Null] = js.native
  /** FetchNode trace */
  var trace: js.UndefOr[ITrace | Null] = js.native
  /** FetchNode traceParsingFailed */
  var traceParsingFailed: js.UndefOr[Boolean | Null] = js.native
}

object IFetchNode {
  @scala.inline
  def apply(): IFetchNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFetchNode]
  }
  @scala.inline
  implicit class IFetchNodeOps[Self <: IFetchNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReceivedTime(value: ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceivedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withReceivedTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedTime")(null)
        ret
    }
    @scala.inline
    def withSentTime(value: ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSentTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentTime")(null)
        ret
    }
    @scala.inline
    def withSentTimeOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentTimeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentTimeOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentTimeOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSentTimeOffsetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentTimeOffset")(null)
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(null)
        ret
    }
    @scala.inline
    def withTrace(value: ITrace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.undefined)
        ret
    }
    @scala.inline
    def withTraceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(null)
        ret
    }
    @scala.inline
    def withTraceParsingFailed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceParsingFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraceParsingFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceParsingFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withTraceParsingFailedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceParsingFailed")(null)
        ret
    }
  }
  
}

