package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterLogEventsRequest extends js.Object {
  /**
    * The end of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp later than this time are not returned.
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  /**
    * The filter pattern to use. For more information, see Filter and Pattern Syntax. If not provided, all the events are matched.
    */
  var filterPattern: js.UndefOr[FilterPattern] = js.native
  /**
    * If the value is true, the operation makes a best effort to provide responses that contain events from multiple log streams within the log group, interleaved in a single response. If the value is false, all the matched log events in the first log stream are searched first, then those in the next log stream, and so on. The default is false.  IMPORTANT: Starting on June 17, 2019, this parameter will be ignored and the value will be assumed to be true. The response from this operation will always interleave events from multiple log streams within a log group.
    */
  var interleaved: js.UndefOr[Interleaved] = js.native
  /**
    * The maximum number of events to return. The default is 10,000 events.
    */
  var limit: js.UndefOr[EventsLimit] = js.native
  /**
    * The name of the log group to search.
    */
  var logGroupName: LogGroupName = js.native
  /**
    * Filters the results to include only events from log streams that have names starting with this prefix. If you specify a value for both logStreamNamePrefix and logStreamNames, but the value for logStreamNamePrefix does not match any log stream names specified in logStreamNames, the action returns an InvalidParameterException error.
    */
  var logStreamNamePrefix: js.UndefOr[LogStreamName] = js.native
  /**
    * Filters the results to only logs from the log streams in this list. If you specify a value for both logStreamNamePrefix and logStreamNames, the action returns an InvalidParameterException error.
    */
  var logStreamNames: js.UndefOr[InputLogStreamNames] = js.native
  /**
    * The token for the next set of events to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp before this time are not returned.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
}

object FilterLogEventsRequest {
  @scala.inline
  def apply(logGroupName: LogGroupName): FilterLogEventsRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterLogEventsRequest]
  }
  @scala.inline
  implicit class FilterLogEventsRequestOps[Self <: FilterLogEventsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogGroupName(value: LogGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndTime(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterPattern(value: FilterPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withInterleaved(value: Interleaved): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interleaved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterleaved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interleaved")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: EventsLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withLogStreamNamePrefix(value: LogStreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamNamePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogStreamNamePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamNamePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withLogStreamNames(value: InputLogStreamNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogStreamNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamNames")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
  }
  
}

