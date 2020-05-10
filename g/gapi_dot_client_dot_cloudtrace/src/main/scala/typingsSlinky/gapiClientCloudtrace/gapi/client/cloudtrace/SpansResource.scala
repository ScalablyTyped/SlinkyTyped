package typingsSlinky.gapiClientCloudtrace.gapi.client.cloudtrace

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCloudtrace.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpansResource extends js.Object {
  /** Creates a new Span. */
  def create(request: AnonAccesstoken): Request_[Span] = js.native
}

object SpansResource {
  @scala.inline
  def apply(create: AnonAccesstoken => Request_[Span]): SpansResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[SpansResource]
  }
  @scala.inline
  implicit class SpansResourceOps[Self <: SpansResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAccesstoken => Request_[Span]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

