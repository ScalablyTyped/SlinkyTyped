package typingsSlinky.gapiClientCloudtrace.gapi.client.cloudtrace

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCloudtrace.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpansResource extends js.Object {
  /** Creates a new Span. */
  def create(request: AnonAccesstoken): Request_[Span]
}

object SpansResource {
  @scala.inline
  def apply(create: AnonAccesstoken => Request_[Span]): SpansResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[SpansResource]
  }
}

