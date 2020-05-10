package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidenterprise.AnonEmail
import typingsSlinky.gapiClientAndroidenterprise.AnonEnterpriseId
import typingsSlinky.gapiClientAndroidenterprise.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersResource extends js.Object {
  /** Deleted an EMM-managed user. */
  def delete(request: AnonEnterpriseId): Request_[Unit] = js.native
  /**
    * Generates an authentication token which the device policy client can use to provision the given EMM-managed user account on a device. The generated
    * token is single-use and expires after a few minutes.
    *
    * This call only works with EMM-managed accounts.
    */
  def generateAuthenticationToken(request: AnonEnterpriseId): Request_[AuthenticationToken] = js.native
  /**
    * Generates a token (activation code) to allow this user to configure their managed account in the Android Setup Wizard. Revokes any previously generated
    * token.
    *
    * This call only works with Google managed accounts.
    */
  def generateToken(request: AnonEnterpriseId): Request_[UserToken] = js.native
  /** Retrieves a user's details. */
  def get(request: AnonEnterpriseId): Request_[User] = js.native
  /** Retrieves the set of products a user is entitled to access. */
  def getAvailableProductSet(request: AnonEnterpriseId): Request_[ProductSet] = js.native
  /**
    * Creates a new EMM-managed user.
    *
    * The Users resource passed in the body of the request should include an accountIdentifier and an accountType.
    * If a corresponding user already exists with the same account identifier, the user will be updated with the resource. In this case only the displayName
    * field can be changed.
    */
  def insert(request: AnonKey): Request_[User] = js.native
  /**
    * Looks up a user by primary email address. This is only supported for Google-managed users. Lookup of the id is not needed for EMM-managed users because
    * the id is already returned in the result of the Users.insert call.
    */
  def list(request: AnonEmail): Request_[UsersListResponse] = js.native
  /**
    * Updates the details of an EMM-managed user.
    *
    * Can be used with EMM-managed users only (not Google managed users). Pass the new details in the Users resource in the request body. Only the
    * displayName field can be changed. Other fields must either be unset or have the currently active value. This method supports patch semantics.
    */
  def patch(request: AnonEnterpriseId): Request_[User] = js.native
  /** Revokes a previously generated token (activation code) for the user. */
  def revokeToken(request: AnonEnterpriseId): Request_[Unit] = js.native
  /**
    * Modifies the set of products that a user is entitled to access (referred to as whitelisted products). Only products that are approved or products that
    * were previously approved (products with revoked approval) can be whitelisted.
    */
  def setAvailableProductSet(request: AnonEnterpriseId): Request_[ProductSet] = js.native
  /**
    * Updates the details of an EMM-managed user.
    *
    * Can be used with EMM-managed users only (not Google managed users). Pass the new details in the Users resource in the request body. Only the
    * displayName field can be changed. Other fields must either be unset or have the currently active value.
    */
  def update(request: AnonEnterpriseId): Request_[User] = js.native
}

object UsersResource {
  @scala.inline
  def apply(
    delete: AnonEnterpriseId => Request_[Unit],
    generateAuthenticationToken: AnonEnterpriseId => Request_[AuthenticationToken],
    generateToken: AnonEnterpriseId => Request_[UserToken],
    get: AnonEnterpriseId => Request_[User],
    getAvailableProductSet: AnonEnterpriseId => Request_[ProductSet],
    insert: AnonKey => Request_[User],
    list: AnonEmail => Request_[UsersListResponse],
    patch: AnonEnterpriseId => Request_[User],
    revokeToken: AnonEnterpriseId => Request_[Unit],
    setAvailableProductSet: AnonEnterpriseId => Request_[ProductSet],
    update: AnonEnterpriseId => Request_[User]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), generateAuthenticationToken = js.Any.fromFunction1(generateAuthenticationToken), generateToken = js.Any.fromFunction1(generateToken), get = js.Any.fromFunction1(get), getAvailableProductSet = js.Any.fromFunction1(getAvailableProductSet), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), revokeToken = js.Any.fromFunction1(revokeToken), setAvailableProductSet = js.Any.fromFunction1(setAvailableProductSet), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[UsersResource]
  }
  @scala.inline
  implicit class UsersResourceOps[Self <: UsersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonEnterpriseId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGenerateAuthenticationToken(value: AnonEnterpriseId => Request_[AuthenticationToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateAuthenticationToken")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGenerateToken(value: AnonEnterpriseId => Request_[UserToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateToken")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonEnterpriseId => Request_[User]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAvailableProductSet(value: AnonEnterpriseId => Request_[ProductSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAvailableProductSet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonKey => Request_[User]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonEmail => Request_[UsersListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonEnterpriseId => Request_[User]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRevokeToken(value: AnonEnterpriseId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokeToken")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAvailableProductSet(value: AnonEnterpriseId => Request_[ProductSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAvailableProductSet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonEnterpriseId => Request_[User]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

