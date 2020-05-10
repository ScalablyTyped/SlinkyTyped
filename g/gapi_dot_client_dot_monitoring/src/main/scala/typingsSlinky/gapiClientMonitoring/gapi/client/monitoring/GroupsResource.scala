package typingsSlinky.gapiClientMonitoring.gapi.client.monitoring

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientMonitoring.AnonAccesstoken
import typingsSlinky.gapiClientMonitoring.AnonAncestorsOfGroup
import typingsSlinky.gapiClientMonitoring.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupsResource extends js.Object {
  var members: MembersResource = js.native
  /** Creates a new group. */
  def create(request: AnonBearertoken): Request_[Group] = js.native
  /** Deletes an existing group. */
  def delete(request: AnonAccesstoken): Request_[js.Object] = js.native
  /** Gets a single group. */
  def get(request: AnonAccesstoken): Request_[Group] = js.native
  /** Lists the existing groups. */
  def list(request: AnonAncestorsOfGroup): Request_[ListGroupsResponse] = js.native
  /** Updates an existing group. You can change any group attributes except name. */
  def update(request: AnonBearertoken): Request_[Group] = js.native
}

object GroupsResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => Request_[Group],
    delete: AnonAccesstoken => Request_[js.Object],
    get: AnonAccesstoken => Request_[Group],
    list: AnonAncestorsOfGroup => Request_[ListGroupsResponse],
    members: MembersResource,
    update: AnonBearertoken => Request_[Group]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), members = members.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[GroupsResource]
  }
  @scala.inline
  implicit class GroupsResourceOps[Self <: GroupsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonBearertoken => Request_[Group]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonAccesstoken => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAccesstoken => Request_[Group]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAncestorsOfGroup => Request_[ListGroupsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMembers(value: MembersResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: AnonBearertoken => Request_[Group]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

