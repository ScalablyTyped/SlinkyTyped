package typingsSlinky.gapiClientDns.gapi.client.dns

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDns.AnonAlt
import typingsSlinky.gapiClientDns.AnonChangeId
import typingsSlinky.gapiClientDns.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangesResource extends js.Object {
  /** Atomically update the ResourceRecordSet collection. */
  def create(request: AnonAlt): Request_[Change] = js.native
  /** Fetch the representation of an existing Change. */
  def get(request: AnonChangeId): Request_[Change] = js.native
  /** Enumerate Changes to a ResourceRecordSet collection. */
  def list(request: AnonFields): Request_[ChangesListResponse] = js.native
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
  @scala.inline
  implicit class ChangesResourceOps[Self <: ChangesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAlt => Request_[Change]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonChangeId => Request_[Change]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[ChangesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

