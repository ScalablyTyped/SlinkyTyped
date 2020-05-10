package typingsSlinky.gapiClientMonitoring.gapi.client.monitoring

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientMonitoring.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MembersResource extends js.Object {
  /** Lists the monitored resources that are members of a group. */
  def list(request: AnonAlt): Request_[ListGroupMembersResponse] = js.native
}

object MembersResource {
  @scala.inline
  def apply(list: AnonAlt => Request_[ListGroupMembersResponse]): MembersResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MembersResource]
  }
  @scala.inline
  implicit class MembersResourceOps[Self <: MembersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonAlt => Request_[ListGroupMembersResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

