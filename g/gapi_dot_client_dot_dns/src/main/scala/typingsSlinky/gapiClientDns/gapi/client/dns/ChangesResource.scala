package typingsSlinky.gapiClientDns.gapi.client.dns

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDns.AnonAlt
import typingsSlinky.gapiClientDns.AnonChangeId
import typingsSlinky.gapiClientDns.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangesResource extends js.Object {
  /** Atomically update the ResourceRecordSet collection. */
  def create(request: AnonAlt): Request_[Change]
  /** Fetch the representation of an existing Change. */
  def get(request: AnonChangeId): Request_[Change]
  /** Enumerate Changes to a ResourceRecordSet collection. */
  def list(request: AnonFields): Request_[ChangesListResponse]
}

object ChangesResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Change],
    get: AnonChangeId => Request_[Change],
    list: AnonFields => Request_[ChangesListResponse]
  ): ChangesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ChangesResource]
  }
}

