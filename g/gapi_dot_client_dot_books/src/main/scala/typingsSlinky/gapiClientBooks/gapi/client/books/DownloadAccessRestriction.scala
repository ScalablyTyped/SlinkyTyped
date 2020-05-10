package typingsSlinky.gapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadAccessRestriction extends js.Object {
  /** If restricted, whether access is granted for this (user, device, volume). */
  var deviceAllowed: js.UndefOr[Boolean] = js.native
  /** If restricted, the number of content download licenses already acquired (including the requesting client, if licensed). */
  var downloadsAcquired: js.UndefOr[Double] = js.native
  /** If deviceAllowed, whether access was just acquired with this request. */
  var justAcquired: js.UndefOr[Boolean] = js.native
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  /** If restricted, the maximum number of content download licenses for this volume. */
  var maxDownloadDevices: js.UndefOr[Double] = js.native
  /** Error/warning message. */
  var message: js.UndefOr[String] = js.native
  /** Client nonce for verification. Download access and client-validation only. */
  var nonce: js.UndefOr[String] = js.native
  /**
    * Error/warning reason code. Additional codes may be added in the future. 0 OK 100 ACCESS_DENIED_PUBLISHER_LIMIT 101 ACCESS_DENIED_LIMIT 200
    * WARNING_USED_LAST_ACCESS
    */
  var reasonCode: js.UndefOr[String] = js.native
  /** Whether this volume has any download access restrictions. */
  var restricted: js.UndefOr[Boolean] = js.native
  /** Response signature. */
  var signature: js.UndefOr[String] = js.native
  /** Client app identifier for verification. Download access and client-validation only. */
  var source: js.UndefOr[String] = js.native
  /** Identifies the volume for which this entry applies. */
  var volumeId: js.UndefOr[String] = js.native
}

object DownloadAccessRestriction {
  @scala.inline
  def apply(): DownloadAccessRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadAccessRestriction]
  }
  @scala.inline
  implicit class DownloadAccessRestrictionOps[Self <: DownloadAccessRestriction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadsAcquired(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadsAcquired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadsAcquired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadsAcquired")(js.undefined)
        ret
    }
    @scala.inline
    def withJustAcquired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justAcquired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustAcquired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justAcquired")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDownloadDevices(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDownloadDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDownloadDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDownloadDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonCode")(js.undefined)
        ret
    }
    @scala.inline
    def withRestricted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restricted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestricted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restricted")(js.undefined)
        ret
    }
    @scala.inline
    def withSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeId")(js.undefined)
        ret
    }
  }
  
}

