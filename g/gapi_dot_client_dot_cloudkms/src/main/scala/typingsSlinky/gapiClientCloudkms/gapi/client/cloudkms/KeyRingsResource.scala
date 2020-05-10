package typingsSlinky.gapiClientCloudkms.gapi.client.cloudkms

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCloudkms.AnonAlt
import typingsSlinky.gapiClientCloudkms.AnonBearertoken
import typingsSlinky.gapiClientCloudkms.AnonFields
import typingsSlinky.gapiClientCloudkms.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyRingsResource extends js.Object {
  var cryptoKeys: CryptoKeysResource = js.native
  /** Create a new KeyRing in a given Project and Location. */
  def create(request: AnonKey): Request_[KeyRing] = js.native
  /** Returns metadata for a given KeyRing. */
  def get(request: AnonAlt): Request_[KeyRing] = js.native
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonFields): Request_[Policy] = js.native
  /** Lists KeyRings. */
  def list(request: AnonBearertoken): Request_[ListKeyRingsResponse] = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: AnonFields): Request_[Policy] = js.native
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: AnonFields): Request_[TestIamPermissionsResponse] = js.native
}

object KeyRingsResource {
  @scala.inline
  def apply(
    create: AnonKey => Request_[KeyRing],
    cryptoKeys: CryptoKeysResource,
    get: AnonAlt => Request_[KeyRing],
    getIamPolicy: AnonFields => Request_[Policy],
    list: AnonBearertoken => Request_[ListKeyRingsResponse],
    setIamPolicy: AnonFields => Request_[Policy],
    testIamPermissions: AnonFields => Request_[TestIamPermissionsResponse]
  ): KeyRingsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), cryptoKeys = cryptoKeys.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
    __obj.asInstanceOf[KeyRingsResource]
  }
  @scala.inline
  implicit class KeyRingsResourceOps[Self <: KeyRingsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonKey => Request_[KeyRing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCryptoKeys(value: CryptoKeysResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: AnonAlt => Request_[KeyRing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIamPolicy(value: AnonFields => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonBearertoken => Request_[ListKeyRingsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIamPolicy(value: AnonFields => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestIamPermissions(value: AnonFields => Request_[TestIamPermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIamPermissions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

