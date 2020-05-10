package typingsSlinky.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSinksResponse extends js.Object {
  /**
    * If there might be more results than appear in this response, then nextPageToken is included. To get the next set of results, call the same method again
    * using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** A list of sinks. */
  var sinks: js.UndefOr[js.Array[LogSink]] = js.native
}

object ListSinksResponse {
  @scala.inline
  def apply(): ListSinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSinksResponse]
  }
  @scala.inline
  implicit class ListSinksResponseOps[Self <: ListSinksResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSinks(value: js.Array[LogSink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sinks")(js.undefined)
        ret
    }
  }
  
}

