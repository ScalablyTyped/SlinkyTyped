package typingsSlinky.gapiClientDns.gapi.client.dns

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDns.anon.Alt
import typingsSlinky.gapiClientDns.anon.ChangeId
import typingsSlinky.gapiClientDns.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangesResource extends js.Object {
  /** Atomically update the ResourceRecordSet collection. */
  def create(request: Alt): Request[Change] = js.native
  /** Fetch the representation of an existing Change. */
  def get(request: ChangeId): Request[Change] = js.native
  /** Enumerate Changes to a ResourceRecordSet collection. */
  def list(request: Fields): Request[ChangesListResponse] = js.native
}

object ChangesResource {
  @scala.inline
  def apply(
    create: Alt => Request[Change],
    get: ChangeId => Request[Change],
    list: Fields => Request[ChangesListResponse]
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
    def withCreate(value: Alt => Request[Change]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: ChangeId => Request[Change]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Fields => Request[ChangesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

