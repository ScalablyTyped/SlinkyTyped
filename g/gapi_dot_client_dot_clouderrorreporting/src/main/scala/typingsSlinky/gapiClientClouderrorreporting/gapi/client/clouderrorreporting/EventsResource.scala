package typingsSlinky.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientClouderrorreporting.anon.Accesstoken
import typingsSlinky.gapiClientClouderrorreporting.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsResource extends js.Object {
  /** Lists the specified events. */
  def list(request: Accesstoken): Request[ListEventsResponse] = js.native
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
  def report(request: Alt): Request[js.Object] = js.native
}

object EventsResource {
  @scala.inline
  def apply(list: Accesstoken => Request[ListEventsResponse], report: Alt => Request[js.Object]): EventsResource = {
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
    def withList(value: Accesstoken => Request[ListEventsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReport(value: Alt => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

