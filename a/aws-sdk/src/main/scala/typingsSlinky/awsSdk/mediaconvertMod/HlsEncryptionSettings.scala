package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsEncryptionSettings extends js.Object {
  /**
    * This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not set then the Initialization Vector will follow the segment number by default.
    */
  var ConstantInitializationVector: js.UndefOr[stringMin32Max32Pattern09aFAF32] = js.native
  /**
    * Encrypts the segments with the given encryption scheme. Leave blank to disable. Selecting 'Disabled' in the web interface also disables encryption.
    */
  var EncryptionMethod: js.UndefOr[HlsEncryptionType] = js.native
  /**
    * The Initialization Vector is a 128-bit number used in conjunction with the key for encrypting blocks. If set to INCLUDE, Initialization Vector is listed in the manifest. Otherwise Initialization Vector is not in the manifest.
    */
  var InitializationVectorInManifest: js.UndefOr[HlsInitializationVectorInManifest] = js.native
  /**
    * Enable this setting to insert the EXT-X-SESSION-KEY element into the master playlist. This allows for offline Apple HLS FairPlay content protection.
    */
  var OfflineEncrypted: js.UndefOr[HlsOfflineEncrypted] = js.native
  /**
    * If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption with a SPEKE-compliant key provider.  If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
    */
  var SpekeKeyProvider: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.SpekeKeyProvider] = js.native
  /**
    * Use these settings to set up encryption with a static key provider.
    */
  var StaticKeyProvider: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.StaticKeyProvider] = js.native
  /**
    * Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
    */
  var Type: js.UndefOr[HlsKeyProviderType] = js.native
}

object HlsEncryptionSettings {
  @scala.inline
  def apply(): HlsEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsEncryptionSettings]
  }
  @scala.inline
  implicit class HlsEncryptionSettingsOps[Self <: HlsEncryptionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstantInitializationVector(value: stringMin32Max32Pattern09aFAF32): Self = {
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
    def withEncryptionMethod(value: HlsEncryptionType): Self = {
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
    def withInitializationVectorInManifest(value: HlsInitializationVectorInManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitializationVectorInManifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitializationVectorInManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitializationVectorInManifest")(js.undefined)
        ret
    }
    @scala.inline
    def withOfflineEncrypted(value: HlsOfflineEncrypted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfflineEncrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfflineEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfflineEncrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withSpekeKeyProvider(value: SpekeKeyProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpekeKeyProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpekeKeyProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpekeKeyProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticKeyProvider(value: StaticKeyProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaticKeyProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticKeyProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaticKeyProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: HlsKeyProviderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

