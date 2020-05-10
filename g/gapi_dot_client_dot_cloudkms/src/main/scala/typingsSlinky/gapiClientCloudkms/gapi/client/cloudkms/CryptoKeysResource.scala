package typingsSlinky.gapiClientCloudkms.gapi.client.cloudkms

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCloudkms.AnonAlt
import typingsSlinky.gapiClientCloudkms.AnonBearertoken
import typingsSlinky.gapiClientCloudkms.AnonCallback
import typingsSlinky.gapiClientCloudkms.AnonCryptoKeyId
import typingsSlinky.gapiClientCloudkms.AnonFields
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
  def create(request: AnonCryptoKeyId): Request_[CryptoKey] = js.native
  /** Decrypts data that was protected by Encrypt. */
  def decrypt(request: AnonAlt): Request_[DecryptResponse] = js.native
  /** Encrypts data, so that it can only be recovered by a call to Decrypt. */
  def encrypt(request: AnonAlt): Request_[EncryptResponse] = js.native
  /**
    * Returns metadata for a given CryptoKey, as well as its
    * primary CryptoKeyVersion.
    */
  def get(request: AnonAlt): Request_[CryptoKey] = js.native
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonFields): Request_[Policy] = js.native
  /** Lists CryptoKeys. */
  def list(request: AnonBearertoken): Request_[ListCryptoKeysResponse] = js.native
  /** Update a CryptoKey. */
  def patch(request: AnonCallback): Request_[CryptoKey] = js.native
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
  /** Update the version of a CryptoKey that will be used in Encrypt */
  def updatePrimaryVersion(request: AnonAlt): Request_[CryptoKey] = js.native
}

object CryptoKeysResource {
  @scala.inline
  def apply(
    create: AnonCryptoKeyId => Request_[CryptoKey],
    cryptoKeyVersions: CryptoKeyVersionsResource,
    decrypt: AnonAlt => Request_[DecryptResponse],
    encrypt: AnonAlt => Request_[EncryptResponse],
    get: AnonAlt => Request_[CryptoKey],
    getIamPolicy: AnonFields => Request_[Policy],
    list: AnonBearertoken => Request_[ListCryptoKeysResponse],
    patch: AnonCallback => Request_[CryptoKey],
    setIamPolicy: AnonFields => Request_[Policy],
    testIamPermissions: AnonFields => Request_[TestIamPermissionsResponse],
    updatePrimaryVersion: AnonAlt => Request_[CryptoKey]
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
    def withCreate(value: AnonCryptoKeyId => Request_[CryptoKey]): Self = {
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
    def withDecrypt(value: AnonAlt => Request_[DecryptResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrypt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncrypt(value: AnonAlt => Request_[EncryptResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAlt => Request_[CryptoKey]): Self = {
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
    def withList(value: AnonBearertoken => Request_[ListCryptoKeysResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonCallback => Request_[CryptoKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
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
    @scala.inline
    def withUpdatePrimaryVersion(value: AnonAlt => Request_[CryptoKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePrimaryVersion")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

