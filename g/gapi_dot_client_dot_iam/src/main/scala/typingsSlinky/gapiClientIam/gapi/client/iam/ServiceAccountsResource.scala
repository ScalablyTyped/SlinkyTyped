package typingsSlinky.gapiClientIam.gapi.client.iam

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientIam.AnonBearertoken
import typingsSlinky.gapiClientIam.AnonPageSize
import typingsSlinky.gapiClientIam.AnonPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceAccountsResource extends js.Object {
  var keys: KeysResource = js.native
  /**
    * Creates a ServiceAccount
    * and returns it.
    */
  def create(request: AnonBearertoken): Request_[ServiceAccount] = js.native
  /** Deletes a ServiceAccount. */
  def delete(request: AnonBearertoken): Request_[js.Object] = js.native
  /** Gets a ServiceAccount. */
  def get(request: AnonBearertoken): Request_[ServiceAccount] = js.native
  /**
    * Returns the IAM access control policy for a
    * ServiceAccount.
    */
  def getIamPolicy(request: AnonPp): Request_[Policy] = js.native
  /** Lists ServiceAccounts for a project. */
  def list(request: AnonPageSize): Request_[ListServiceAccountsResponse] = js.native
  /**
    * Sets the IAM access control policy for a
    * ServiceAccount.
    */
  def setIamPolicy(request: AnonPp): Request_[Policy] = js.native
  /** Signs a blob using a service account's system-managed private key. */
  def signBlob(request: AnonBearertoken): Request_[SignBlobResponse] = js.native
  /**
    * Signs a JWT using a service account's system-managed private key.
    *
    * If no expiry time (`exp`) is provided in the `SignJwtRequest`, IAM sets an
    * an expiry time of one hour by default. If you request an expiry time of
    * more than one hour, the request will fail.
    */
  def signJwt(request: AnonBearertoken): Request_[SignJwtResponse] = js.native
  /**
    * Tests the specified permissions against the IAM access control policy
    * for a ServiceAccount.
    */
  def testIamPermissions(request: AnonPp): Request_[TestIamPermissionsResponse] = js.native
  /**
    * Updates a ServiceAccount.
    *
    * Currently, only the following fields are updatable:
    * `display_name` .
    * The `etag` is mandatory.
    */
  def update(request: AnonBearertoken): Request_[ServiceAccount] = js.native
}

object ServiceAccountsResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => Request_[ServiceAccount],
    delete: AnonBearertoken => Request_[js.Object],
    get: AnonBearertoken => Request_[ServiceAccount],
    getIamPolicy: AnonPp => Request_[Policy],
    keys: KeysResource,
    list: AnonPageSize => Request_[ListServiceAccountsResponse],
    setIamPolicy: AnonPp => Request_[Policy],
    signBlob: AnonBearertoken => Request_[SignBlobResponse],
    signJwt: AnonBearertoken => Request_[SignJwtResponse],
    testIamPermissions: AnonPp => Request_[TestIamPermissionsResponse],
    update: AnonBearertoken => Request_[ServiceAccount]
  ): ServiceAccountsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), keys = keys.asInstanceOf[js.Any], list = js.Any.fromFunction1(list), setIamPolicy = js.Any.fromFunction1(setIamPolicy), signBlob = js.Any.fromFunction1(signBlob), signJwt = js.Any.fromFunction1(signJwt), testIamPermissions = js.Any.fromFunction1(testIamPermissions), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ServiceAccountsResource]
  }
  @scala.inline
  implicit class ServiceAccountsResourceOps[Self <: ServiceAccountsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonBearertoken => Request_[ServiceAccount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonBearertoken => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonBearertoken => Request_[ServiceAccount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIamPolicy(value: AnonPp => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeys(value: KeysResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: AnonPageSize => Request_[ListServiceAccountsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIamPolicy(value: AnonPp => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSignBlob(value: AnonBearertoken => Request_[SignBlobResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signBlob")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSignJwt(value: AnonBearertoken => Request_[SignJwtResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signJwt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestIamPermissions(value: AnonPp => Request_[TestIamPermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIamPermissions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonBearertoken => Request_[ServiceAccount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

