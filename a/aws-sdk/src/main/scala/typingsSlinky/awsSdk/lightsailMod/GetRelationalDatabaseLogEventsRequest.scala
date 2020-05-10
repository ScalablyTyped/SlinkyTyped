package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseLogEventsRequest extends js.Object {
  /**
    * The end of the time interval from which to get log events. Constraints:   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the end time.  
    */
  var endTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the log stream. Use the get relational database log streams operation to get a list of available log streams.
    */
  var logStreamName: String = js.native
  /**
    * The token to advance to the next or previous page of results from your request. To get a page token, perform an initial GetRelationalDatabaseLogEvents request. If your results are paginated, the response will return a next forward token and/or next backward token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The name of your database for which to get log events.
    */
  var relationalDatabaseName: ResourceName = js.native
  /**
    * Parameter to specify if the log should start from head or tail. If true is specified, the log event starts from the head of the log. If false is specified, the log event starts from the tail of the log.  For PostgreSQL, the default value of false is the only option available. 
    */
  var startFromHead: js.UndefOr[Boolean] = js.native
  /**
    * The start of the time interval from which to get log events. Constraints:   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the start time.  
    */
  var startTime: js.UndefOr[js.Date] = js.native
}

object GetRelationalDatabaseLogEventsRequest {
  @scala.inline
  def apply(logStreamName: String, relationalDatabaseName: ResourceName): GetRelationalDatabaseLogEventsRequest = {
    val __obj = js.Dynamic.literal(logStreamName = logStreamName.asInstanceOf[js.Any], relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseLogEventsRequest]
  }
  @scala.inline
  implicit class GetRelationalDatabaseLogEventsRequestOps[Self <: GetRelationalDatabaseLogEventsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogStreamName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelationalDatabaseName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationalDatabaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
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
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withStartFromHead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startFromHead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartFromHead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startFromHead")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
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

