package typingsSlinky.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientClouduseraccounts.AnonFields
import typingsSlinky.gapiClientClouduseraccounts.AnonGroupName
import typingsSlinky.gapiClientClouduseraccounts.AnonOauthtoken
import typingsSlinky.gapiClientClouduseraccounts.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupsResource extends js.Object {
  /** Adds users to the specified group. */
  def addMember(request: AnonGroupName): Request_[Operation] = js.native
  /** Deletes the specified Group resource. */
  def delete(request: AnonGroupName): Request_[Operation] = js.native
  /** Returns the specified Group resource. */
  def get(request: AnonGroupName): Request_[Group] = js.native
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: AnonOauthtoken): Request_[Policy] = js.native
  /** Creates a Group resource in the specified project using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation] = js.native
  /** Retrieves the list of groups contained within the specified project. */
  def list(request: AnonFields): Request_[GroupList] = js.native
  /** Removes users from the specified group. */
  def removeMember(request: AnonGroupName): Request_[Operation] = js.native
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: AnonOauthtoken): Request_[Policy] = js.native
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: AnonOauthtoken): Request_[TestPermissionsResponse] = js.native
}

object GroupsResource {
  @scala.inline
  def apply(
    addMember: AnonGroupName => Request_[Operation],
    delete: AnonGroupName => Request_[Operation],
    get: AnonGroupName => Request_[Group],
    getIamPolicy: AnonOauthtoken => Request_[Policy],
    insert: AnonPrettyPrint => Request_[Operation],
    list: AnonFields => Request_[GroupList],
    removeMember: AnonGroupName => Request_[Operation],
    setIamPolicy: AnonOauthtoken => Request_[Policy],
    testIamPermissions: AnonOauthtoken => Request_[TestPermissionsResponse]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(addMember = js.Any.fromFunction1(addMember), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), removeMember = js.Any.fromFunction1(removeMember), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
    __obj.asInstanceOf[GroupsResource]
  }
  @scala.inline
  implicit class GroupsResourceOps[Self <: GroupsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddMember(value: AnonGroupName => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMember")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonGroupName => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonGroupName => Request_[Group]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIamPolicy(value: AnonOauthtoken => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonPrettyPrint => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[GroupList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveMember(value: AnonGroupName => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMember")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIamPolicy(value: AnonOauthtoken => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestIamPermissions(value: AnonOauthtoken => Request_[TestPermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIamPermissions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

