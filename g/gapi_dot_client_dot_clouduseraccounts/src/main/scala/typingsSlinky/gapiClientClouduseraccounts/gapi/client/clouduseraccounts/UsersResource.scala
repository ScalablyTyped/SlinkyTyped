package typingsSlinky.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientClouduseraccounts.AnonFields
import typingsSlinky.gapiClientClouduseraccounts.AnonFingerprint
import typingsSlinky.gapiClientClouduseraccounts.AnonOauthtoken
import typingsSlinky.gapiClientClouduseraccounts.AnonPrettyPrint
import typingsSlinky.gapiClientClouduseraccounts.AnonProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersResource extends js.Object {
  /** Adds a public key to the specified User resource with the data included in the request. */
  def addPublicKey(request: AnonProject): Request_[Operation] = js.native
  /** Deletes the specified User resource. */
  def delete(request: AnonProject): Request_[Operation] = js.native
  /** Returns the specified User resource. */
  def get(request: AnonProject): Request_[User] = js.native
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: AnonOauthtoken): Request_[Policy] = js.native
  /** Creates a User resource in the specified project using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation] = js.native
  /** Retrieves a list of users contained within the specified project. */
  def list(request: AnonFields): Request_[UserList] = js.native
  /** Removes the specified public key from the user. */
  def removePublicKey(request: AnonFingerprint): Request_[Operation] = js.native
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: AnonOauthtoken): Request_[Policy] = js.native
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: AnonOauthtoken): Request_[TestPermissionsResponse] = js.native
}

object UsersResource {
  @scala.inline
  def apply(
    addPublicKey: AnonProject => Request_[Operation],
    delete: AnonProject => Request_[Operation],
    get: AnonProject => Request_[User],
    getIamPolicy: AnonOauthtoken => Request_[Policy],
    insert: AnonPrettyPrint => Request_[Operation],
    list: AnonFields => Request_[UserList],
    removePublicKey: AnonFingerprint => Request_[Operation],
    setIamPolicy: AnonOauthtoken => Request_[Policy],
    testIamPermissions: AnonOauthtoken => Request_[TestPermissionsResponse]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(addPublicKey = js.Any.fromFunction1(addPublicKey), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), removePublicKey = js.Any.fromFunction1(removePublicKey), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
    __obj.asInstanceOf[UsersResource]
  }
  @scala.inline
  implicit class UsersResourceOps[Self <: UsersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddPublicKey(value: AnonProject => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPublicKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonProject => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonProject => Request_[User]): Self = {
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
    def withList(value: AnonFields => Request_[UserList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemovePublicKey(value: AnonFingerprint => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePublicKey")(js.Any.fromFunction1(value))
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

