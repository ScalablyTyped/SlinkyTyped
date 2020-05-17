package typingsSlinky.gapiClientCloudkms.gapi.client.cloudkms

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCloudkms.anon.Accesstoken
import typingsSlinky.gapiClientCloudkms.anon.Alt
import typingsSlinky.gapiClientCloudkms.anon.Bearertoken
import typingsSlinky.gapiClientCloudkms.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptoKeyVersionsResource extends js.Object {
  /**
    * Create a new CryptoKeyVersion in a CryptoKey.
    *
    * The server will assign the next sequential id. If unset,
    * state will be set to
    * ENABLED.
    */
  def create(request: Accesstoken): Request[CryptoKeyVersion] = js.native
  /**
    * Schedule a CryptoKeyVersion for destruction.
    *
    * Upon calling this method, CryptoKeyVersion.state will be set to
    * DESTROY_SCHEDULED
    * and destroy_time will be set to a time 24
    * hours in the future, at which point the state
    * will be changed to
    * DESTROYED, and the key
    * material will be irrevocably destroyed.
    *
    * Before the destroy_time is reached,
    * RestoreCryptoKeyVersion may be called to reverse the process.
    */
  def destroy(request: Alt): Request[CryptoKeyVersion] = js.native
  /** Returns metadata for a given CryptoKeyVersion. */
  def get(request: Alt): Request[CryptoKeyVersion] = js.native
  /** Lists CryptoKeyVersions. */
  def list(request: Bearertoken): Request[ListCryptoKeyVersionsResponse] = js.native
  /**
    * Update a CryptoKeyVersion's metadata.
    *
    * state may be changed between
    * ENABLED and
    * DISABLED using this
    * method. See DestroyCryptoKeyVersion and RestoreCryptoKeyVersion to
    * move between other states.
    */
  def patch(request: Callback): Request[CryptoKeyVersion] = js.native
  /**
    * Restore a CryptoKeyVersion in the
    * DESTROY_SCHEDULED,
    * state.
    *
    * Upon restoration of the CryptoKeyVersion, state
    * will be set to DISABLED,
    * and destroy_time will be cleared.
    */
  def restore(request: Alt): Request[CryptoKeyVersion] = js.native
}

object CryptoKeyVersionsResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[CryptoKeyVersion],
    destroy: Alt => Request[CryptoKeyVersion],
    get: Alt => Request[CryptoKeyVersion],
    list: Bearertoken => Request[ListCryptoKeyVersionsResponse],
    patch: Callback => Request[CryptoKeyVersion],
    restore: Alt => Request[CryptoKeyVersion]
  ): CryptoKeyVersionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), destroy = js.Any.fromFunction1(destroy), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), restore = js.Any.fromFunction1(restore))
    __obj.asInstanceOf[CryptoKeyVersionsResource]
  }
  @scala.inline
  implicit class CryptoKeyVersionsResourceOps[Self <: CryptoKeyVersionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: Accesstoken => Request[CryptoKeyVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: Alt => Request[CryptoKeyVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Alt => Request[CryptoKeyVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Bearertoken => Request[ListCryptoKeyVersionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Callback => Request[CryptoKeyVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRestore(value: Alt => Request[CryptoKeyVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

