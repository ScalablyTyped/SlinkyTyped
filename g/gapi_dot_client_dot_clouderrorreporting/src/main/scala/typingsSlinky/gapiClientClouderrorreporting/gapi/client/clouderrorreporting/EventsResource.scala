package typingsSlinky.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientClouderrorreporting.AnonAccesstoken
import typingsSlinky.gapiClientClouderrorreporting.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsResource extends js.Object {
  /** Lists the specified events. */
  def list(request: AnonAccesstoken): Request_[ListEventsResponse] = js.native
  /**
    * Report an individual error event.
    *
    * This endpoint accepts <strong>either</strong> an OAuth token,
    * <strong>or</strong> an
    * <a href="https://support.google.com/cloud/answer/6158862">API key</a>
    * for authentication. To use an API key, append it to the URL as the value of
    * a `key` parameter. For example:
    * <pre>POST https://clouderrorreporting.googleapis.com/v1beta1/projects/example-project/events:report?key=123ABC456</pre>
    */
  def report(request: AnonAlt): Request_[js.Object] = js.native
}

object EventsResource {
  @scala.inline
  def apply(list: AnonAccesstoken => Request_[ListEventsResponse], report: AnonAlt => Request_[js.Object]): EventsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), report = js.Any.fromFunction1(report))
    __obj.asInstanceOf[EventsResource]
  }
  @scala.inline
  implicit class EventsResourceOps[Self <: EventsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonAccesstoken => Request_[ListEventsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReport(value: AnonAlt => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

