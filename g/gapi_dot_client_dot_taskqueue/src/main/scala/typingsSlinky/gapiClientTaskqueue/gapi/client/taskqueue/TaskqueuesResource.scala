package typingsSlinky.gapiClientTaskqueue.gapi.client.taskqueue

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientTaskqueue.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskqueuesResource extends js.Object {
  /** Get detailed information about a TaskQueue. */
  def get(request: AnonAlt): Request_[TaskQueue]
}

object TaskqueuesResource {
  @scala.inline
  def apply(get: AnonAlt => Request_[TaskQueue]): TaskqueuesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[TaskqueuesResource]
  }
}

