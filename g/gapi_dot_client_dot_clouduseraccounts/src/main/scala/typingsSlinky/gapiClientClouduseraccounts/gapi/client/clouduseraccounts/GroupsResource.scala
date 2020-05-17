package typingsSlinky.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientClouduseraccounts.anon.Fields
import typingsSlinky.gapiClientClouduseraccounts.anon.GroupName
import typingsSlinky.gapiClientClouduseraccounts.anon.Oauthtoken
import typingsSlinky.gapiClientClouduseraccounts.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupsResource extends js.Object {
  /** Adds users to the specified group. */
  def addMember(request: GroupName): Request[Operation] = js.native
  /** Deletes the specified Group resource. */
  def delete(request: GroupName): Request[Operation] = js.native
  /** Returns the specified Group resource. */
  def get(request: GroupName): Request[Group] = js.native
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: Oauthtoken): Request[Policy] = js.native
  /** Creates a Group resource in the specified project using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation] = js.native
  /** Retrieves the list of groups contained within the specified project. */
  def list(request: Fields): Request[GroupList] = js.native
  /** Removes users from the specified group. */
  def removeMember(request: GroupName): Request[Operation] = js.native
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: Oauthtoken): Request[Policy] = js.native
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: Oauthtoken): Request[TestPermissionsResponse] = js.native
}

object GroupsResource {
  @scala.inline
  def apply(
    addMember: GroupName => Request[Operation],
    delete: GroupName => Request[Operation],
    get: GroupName => Request[Group],
    getIamPolicy: Oauthtoken => Request[Policy],
    insert: PrettyPrint => Request[Operation],
    list: Fields => Request[GroupList],
    removeMember: GroupName => Request[Operation],
    setIamPolicy: Oauthtoken => Request[Policy],
    testIamPermissions: Oauthtoken => Request[TestPermissionsResponse]
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
    def withAddMember(value: GroupName => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMember")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: GroupName => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: GroupName => Request[Group]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIamPolicy(value: Oauthtoken => Request[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: PrettyPrint => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Fields => Request[GroupList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveMember(value: GroupName => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMember")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIamPolicy(value: Oauthtoken => Request[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestIamPermissions(value: Oauthtoken => Request[TestPermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIamPermissions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

