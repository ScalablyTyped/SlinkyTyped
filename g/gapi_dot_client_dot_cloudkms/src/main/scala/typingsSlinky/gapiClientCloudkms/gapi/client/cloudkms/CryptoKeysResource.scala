package typingsSlinky.gapiClientCloudkms.gapi.client.cloudkms

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCloudkms.anon.Alt
import typingsSlinky.gapiClientCloudkms.anon.Bearertoken
import typingsSlinky.gapiClientCloudkms.anon.Callback
import typingsSlinky.gapiClientCloudkms.anon.CryptoKeyId
import typingsSlinky.gapiClientCloudkms.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptoKeysResource extends js.Object {
  var cryptoKeyVersions: CryptoKeyVersionsResource = js.native
  /**
    * Create a new CryptoKey within a KeyRing.
    *
    * CryptoKey.purpose is required.
    */
  def create(request: CryptoKeyId): Request[CryptoKey] = js.native
  /** Decrypts data that was protected by Encrypt. */
  def decrypt(request: Alt): Request[DecryptResponse] = js.native
  /** Encrypts data, so that it can only be recovered by a call to Decrypt. */
  def encrypt(request: Alt): Request[EncryptResponse] = js.native
  /**
    * Returns metadata for a given CryptoKey, as well as its
    * primary CryptoKeyVersion.
    */
  def get(request: Alt): Request[CryptoKey] = js.native
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Fields): Request[Policy] = js.native
  /** Lists CryptoKeys. */
  def list(request: Bearertoken): Request[ListCryptoKeysResponse] = js.native
  /** Update a CryptoKey. */
  def patch(request: Callback): Request[CryptoKey] = js.native
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
  /** Update the version of a CryptoKey that will be used in Encrypt */
  def updatePrimaryVersion(request: Alt): Request[CryptoKey] = js.native
}

object CryptoKeysResource {
  @scala.inline
  def apply(
    create: CryptoKeyId => Request[CryptoKey],
    cryptoKeyVersions: CryptoKeyVersionsResource,
    decrypt: Alt => Request[DecryptResponse],
    encrypt: Alt => Request[EncryptResponse],
    get: Alt => Request[CryptoKey],
    getIamPolicy: Fields => Request[Policy],
    list: Bearertoken => Request[ListCryptoKeysResponse],
    patch: Callback => Request[CryptoKey],
    setIamPolicy: Fields => Request[Policy],
    testIamPermissions: Fields => Request[TestIamPermissionsResponse],
    updatePrimaryVersion: Alt => Request[CryptoKey]
  ): CryptoKeysResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), cryptoKeyVersions = cryptoKeyVersions.asInstanceOf[js.Any], decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), updatePrimaryVersion = js.Any.fromFunction1(updatePrimaryVersion))
    __obj.asInstanceOf[CryptoKeysResource]
  }
  @scala.inline
  implicit class CryptoKeysResourceOps[Self <: CryptoKeysResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: CryptoKeyId => Request[CryptoKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCryptoKeyVersions(value: CryptoKeyVersionsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoKeyVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecrypt(value: Alt => Request[DecryptResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrypt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncrypt(value: Alt => Request[EncryptResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Alt => Request[CryptoKey]): Self = {
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
    def withList(value: Bearertoken => Request[ListCryptoKeysResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Callback => Request[CryptoKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
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
    @scala.inline
    def withUpdatePrimaryVersion(value: Alt => Request[CryptoKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePrimaryVersion")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

