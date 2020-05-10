package typingsSlinky.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEventsResponse extends js.Object {
  /** The error events which match the given request. */
  var errorEvents: js.UndefOr[js.Array[ErrorEvent]] = js.native
  /**
    * If non-empty, more results are available.
    * Pass this token, along with the same query parameters as the first
    * request, to view the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The timestamp specifies the start time to which the request was restricted. */
  var timeRangeBegin: js.UndefOr[String] = js.native
}

object ListEventsResponse {
  @scala.inline
  def apply(): ListEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventsResponse]
  }
  @scala.inline
  implicit class ListEventsResponseOps[Self <: ListEventsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorEvents(value: js.Array[ErrorEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeRangeBegin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRangeBegin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeRangeBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRangeBegin")(js.undefined)
        ret
    }
  }
  
}

