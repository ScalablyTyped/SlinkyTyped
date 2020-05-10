package typingsSlinky.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsEncryption extends js.Object {
  /**
    * A constant initialization vector for encryption (optional).
  When not specified the initialization vector will be periodically rotated.
    */
  var ConstantInitializationVector: js.UndefOr[string] = js.native
  /**
    * The encryption method to use.
    */
  var EncryptionMethod: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.EncryptionMethod] = js.native
  /**
    * Interval (in seconds) between each encryption key rotation.
    */
  var KeyRotationIntervalSeconds: js.UndefOr[integer] = js.native
  /**
    * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
    */
  var RepeatExtXKey: js.UndefOr[boolean] = js.native
  var SpekeKeyProvider: typingsSlinky.awsSdk.mediapackageMod.SpekeKeyProvider = js.native
}

object HlsEncryption {
  @scala.inline
  def apply(SpekeKeyProvider: SpekeKeyProvider): HlsEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsEncryption]
  }
  @scala.inline
  implicit class HlsEncryptionOps[Self <: HlsEncryption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpekeKeyProvider(value: SpekeKeyProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpekeKeyProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstantInitializationVector(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstantInitializationVector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstantInitializationVector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstantInitializationVector")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionMethod(value: EncryptionMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyRotationIntervalSeconds(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyRotationIntervalSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyRotationIntervalSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyRotationIntervalSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeatExtXKey(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepeatExtXKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatExtXKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepeatExtXKey")(js.undefined)
        ret
    }
  }
  
}

