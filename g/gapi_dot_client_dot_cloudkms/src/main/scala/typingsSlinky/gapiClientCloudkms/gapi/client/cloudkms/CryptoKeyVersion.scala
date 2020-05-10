package typingsSlinky.gapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptoKeyVersion extends js.Object {
  /** Output only. The time at which this CryptoKeyVersion was created. */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. The time this CryptoKeyVersion's key material was
    * destroyed. Only present if state is
    * DESTROYED.
    */
  var destroyEventTime: js.UndefOr[String] = js.native
  /**
    * Output only. The time this CryptoKeyVersion's key material is scheduled
    * for destruction. Only present if state is
    * DESTROY_SCHEDULED.
    */
  var destroyTime: js.UndefOr[String] = js.native
  /**
    * Output only. The resource name for this CryptoKeyVersion in the format
    * `projects/&#42;/locations/&#42;/keyRings/&#42;/cryptoKeys/&#42;/cryptoKeyVersions/&#42;`.
    */
  var name: js.UndefOr[String] = js.native
  /** The current state of the CryptoKeyVersion. */
  var state: js.UndefOr[String] = js.native
}

object CryptoKeyVersion {
  @scala.inline
  def apply(): CryptoKeyVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptoKeyVersion]
  }
  @scala.inline
  implicit class CryptoKeyVersionOps[Self <: CryptoKeyVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroyEventTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyEventTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroyEventTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyEventTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroyTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroyTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

