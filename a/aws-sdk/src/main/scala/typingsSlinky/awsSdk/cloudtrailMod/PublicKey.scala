package typingsSlinky.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKey extends js.Object {
  /**
    * The fingerprint of the public key.
    */
  var Fingerprint: js.UndefOr[String] = js.native
  /**
    * The ending time of validity of the public key.
    */
  var ValidityEndTime: js.UndefOr[js.Date] = js.native
  /**
    * The starting time of validity of the public key.
    */
  var ValidityStartTime: js.UndefOr[js.Date] = js.native
  /**
    * The DER encoded public key value in PKCS#1 format.
    */
  var Value: js.UndefOr[ByteBuffer] = js.native
}

object PublicKey {
  @scala.inline
  def apply(): PublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicKey]
  }
  @scala.inline
  implicit class PublicKeyOps[Self <: PublicKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withValidityEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidityEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidityEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidityEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withValidityStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidityStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidityStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidityStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withValueUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: ByteBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

