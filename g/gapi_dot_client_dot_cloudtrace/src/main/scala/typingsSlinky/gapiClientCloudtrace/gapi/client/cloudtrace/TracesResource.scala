package typingsSlinky.gapiClientCloudtrace.gapi.client.cloudtrace

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCloudtrace.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TracesResource extends js.Object {
  var spans: SpansResource = js.native
  /**
    * Sends new spans to Stackdriver Trace or updates existing traces. If the
    * name of a trace that you send matches that of an existing trace, new spans
    * are added to the existing trace. Attempt to update existing spans results
    * undefined behavior. If the name does not match, a new trace is created
    * with given set of spans.
    */
  def batchWrite(request: AnonAccesstoken): Request_[js.Object] = js.native
}

object TracesResource {
  @scala.inline
  def apply(batchWrite: AnonAccesstoken => Request_[js.Object], spans: SpansResource): TracesResource = {
    val __obj = js.Dynamic.literal(batchWrite = js.Any.fromFunction1(batchWrite), spans = spans.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracesResource]
  }
  @scala.inline
  implicit class TracesResourceOps[Self <: TracesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchWrite(value: AnonAccesstoken => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchWrite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSpans(value: SpansResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spans")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

