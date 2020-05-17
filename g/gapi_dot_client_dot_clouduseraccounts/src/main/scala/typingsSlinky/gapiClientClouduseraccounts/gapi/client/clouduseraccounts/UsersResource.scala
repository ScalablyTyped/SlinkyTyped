package typingsSlinky.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientClouduseraccounts.anon.Fields
import typingsSlinky.gapiClientClouduseraccounts.anon.Fingerprint
import typingsSlinky.gapiClientClouduseraccounts.anon.Oauthtoken
import typingsSlinky.gapiClientClouduseraccounts.anon.PrettyPrint
import typingsSlinky.gapiClientClouduseraccounts.anon.Project
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersResource extends js.Object {
  /** Adds a public key to the specified User resource with the data included in the request. */
  def addPublicKey(request: Project): Request[Operation] = js.native
  /** Deletes the specified User resource. */
  def delete(request: Project): Request[Operation] = js.native
  /** Returns the specified User resource. */
  def get(request: Project): Request[User] = js.native
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: Oauthtoken): Request[Policy] = js.native
  /** Creates a User resource in the specified project using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation] = js.native
  /** Retrieves a list of users contained within the specified project. */
  def list(request: Fields): Request[UserList] = js.native
  /** Removes the specified public key from the user. */
  def removePublicKey(request: Fingerprint): Request[Operation] = js.native
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: Oauthtoken): Request[Policy] = js.native
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: Oauthtoken): Request[TestPermissionsResponse] = js.native
}

object UsersResource {
  @scala.inline
  def apply(
    addPublicKey: Project => Request[Operation],
    delete: Project => Request[Operation],
    get: Project => Request[User],
    getIamPolicy: Oauthtoken => Request[Policy],
    insert: PrettyPrint => Request[Operation],
    list: Fields => Request[UserList],
    removePublicKey: Fingerprint => Request[Operation],
    setIamPolicy: Oauthtoken => Request[Policy],
    testIamPermissions: Oauthtoken => Request[TestPermissionsResponse]
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
    def withAddPublicKey(value: Project => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPublicKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Project => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Project => Request[User]): Self = {
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
    def withList(value: Fields => Request[UserList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemovePublicKey(value: Fingerprint => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePublicKey")(js.Any.fromFunction1(value))
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

