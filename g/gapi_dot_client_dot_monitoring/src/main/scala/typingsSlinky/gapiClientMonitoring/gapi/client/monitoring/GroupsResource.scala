package typingsSlinky.gapiClientMonitoring.gapi.client.monitoring

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientMonitoring.anon.Accesstoken
import typingsSlinky.gapiClientMonitoring.anon.AncestorsOfGroup
import typingsSlinky.gapiClientMonitoring.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupsResource extends js.Object {
  var members: MembersResource = js.native
  /** Creates a new group. */
  def create(request: Bearertoken): Request[Group] = js.native
  /** Deletes an existing group. */
  def delete(request: Accesstoken): Request[js.Object] = js.native
  /** Gets a single group. */
  def get(request: Accesstoken): Request[Group] = js.native
  /** Lists the existing groups. */
  def list(request: AncestorsOfGroup): Request[ListGroupsResponse] = js.native
  /** Updates an existing group. You can change any group attributes except name. */
  def update(request: Bearertoken): Request[Group] = js.native
}

object GroupsResource {
  @scala.inline
  def apply(
    create: Bearertoken => Request[Group],
    delete: Accesstoken => Request[js.Object],
    get: Accesstoken => Request[Group],
    list: AncestorsOfGroup => Request[ListGroupsResponse],
    members: MembersResource,
    update: Bearertoken => Request[Group]
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
    def withCreate(value: Bearertoken => Request[Group]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Accesstoken => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Accesstoken => Request[Group]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AncestorsOfGroup => Request[ListGroupsResponse]): Self = {
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
    def withUpdate(value: Bearertoken => Request[Group]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

