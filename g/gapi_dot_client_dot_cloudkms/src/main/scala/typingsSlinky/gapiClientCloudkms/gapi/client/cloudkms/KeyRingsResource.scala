package typingsSlinky.gapiClientCloudkms.gapi.client.cloudkms

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCloudkms.anon.Alt
import typingsSlinky.gapiClientCloudkms.anon.Bearertoken
import typingsSlinky.gapiClientCloudkms.anon.Fields
import typingsSlinky.gapiClientCloudkms.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyRingsResource extends js.Object {
  var cryptoKeys: CryptoKeysResource = js.native
  /** Create a new KeyRing in a given Project and Location. */
  def create(request: Key): Request[KeyRing] = js.native
  /** Returns metadata for a given KeyRing. */
  def get(request: Alt): Request[KeyRing] = js.native
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Fields): Request[Policy] = js.native
  /** Lists KeyRings. */
  def list(request: Bearertoken): Request[ListKeyRingsResponse] = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: Fields): Request[Policy] = js.native
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: Fields): Request[TestIamPermissionsResponse] = js.native
}

object KeyRingsResource {
  @scala.inline
  def apply(
    create: Key => Request[KeyRing],
    cryptoKeys: CryptoKeysResource,
    get: Alt => Request[KeyRing],
    getIamPolicy: Fields => Request[Policy],
    list: Bearertoken => Request[ListKeyRingsResponse],
    setIamPolicy: Fields => Request[Policy],
    testIamPermissions: Fields => Request[TestIamPermissionsResponse]
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
    def withCreate(value: Key => Request[KeyRing]): Self = {
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
    def withGet(value: Alt => Request[KeyRing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIamPolicy(value: Fields => Request[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Bearertoken => Request[ListKeyRingsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIamPolicy(value: Fields => Request[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestIamPermissions(value: Fields => Request[TestIamPermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIamPermissions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

