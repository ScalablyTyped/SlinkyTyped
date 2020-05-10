package typingsSlinky.gapiClientCloudkms.gapi.client.cloudkms

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCloudkms.AnonAccesstoken
import typingsSlinky.gapiClientCloudkms.AnonAlt
import typingsSlinky.gapiClientCloudkms.AnonBearertoken
import typingsSlinky.gapiClientCloudkms.AnonCallback
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
  def create(request: AnonAccesstoken): Request_[CryptoKeyVersion] = js.native
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
  def destroy(request: AnonAlt): Request_[CryptoKeyVersion] = js.native
  /** Returns metadata for a given CryptoKeyVersion. */
  def get(request: AnonAlt): Request_[CryptoKeyVersion] = js.native
  /** Lists CryptoKeyVersions. */
  def list(request: AnonBearertoken): Request_[ListCryptoKeyVersionsResponse] = js.native
  /**
    * Update a CryptoKeyVersion's metadata.
    *
    * state may be changed between
    * ENABLED and
    * DISABLED using this
    * method. See DestroyCryptoKeyVersion and RestoreCryptoKeyVersion to
    * move between other states.
    */
  def patch(request: AnonCallback): Request_[CryptoKeyVersion] = js.native
  /**
    * Restore a CryptoKeyVersion in the
    * DESTROY_SCHEDULED,
    * state.
    *
    * Upon restoration of the CryptoKeyVersion, state
    * will be set to DISABLED,
    * and destroy_time will be cleared.
    */
  def restore(request: AnonAlt): Request_[CryptoKeyVersion] = js.native
}

object CryptoKeyVersionsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[CryptoKeyVersion],
    destroy: AnonAlt => Request_[CryptoKeyVersion],
    get: AnonAlt => Request_[CryptoKeyVersion],
    list: AnonBearertoken => Request_[ListCryptoKeyVersionsResponse],
    patch: AnonCallback => Request_[CryptoKeyVersion],
    restore: AnonAlt => Request_[CryptoKeyVersion]
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
    def withCreate(value: AnonAccesstoken => Request_[CryptoKeyVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: AnonAlt => Request_[CryptoKeyVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAlt => Request_[CryptoKeyVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonBearertoken => Request_[ListCryptoKeyVersionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonCallback => Request_[CryptoKeyVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRestore(value: AnonAlt => Request_[CryptoKeyVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

