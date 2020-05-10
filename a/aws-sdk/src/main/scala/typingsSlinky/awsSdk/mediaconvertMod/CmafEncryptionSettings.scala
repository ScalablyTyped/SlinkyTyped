package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CmafEncryptionSettings extends js.Object {
  /**
    * This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not set then the Initialization Vector will follow the segment number by default.
    */
  var ConstantInitializationVector: js.UndefOr[stringMin32Max32Pattern09aFAF32] = js.native
  /**
    * Specify the encryption scheme that you want the service to use when encrypting your CMAF segments. Choose AES-CBC subsample (SAMPLE-AES) or AES_CTR (AES-CTR).
    */
  var EncryptionMethod: js.UndefOr[CmafEncryptionType] = js.native
  /**
    * When you use DRM with CMAF outputs, choose whether the service writes the 128-bit encryption initialization vector in the HLS and DASH manifests.
    */
  var InitializationVectorInManifest: js.UndefOr[CmafInitializationVectorInManifest] = js.native
  /**
    * If your output group type is CMAF, use these settings when doing DRM encryption with a SPEKE-compliant key provider. If your output group type is HLS, DASH, or Microsoft Smooth, use the SpekeKeyProvider settings instead.
    */
  var SpekeKeyProvider: js.UndefOr[SpekeKeyProviderCmaf] = js.native
  /**
    * Use these settings to set up encryption with a static key provider.
    */
  var StaticKeyProvider: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.StaticKeyProvider] = js.native
  /**
    * Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
    */
  var Type: js.UndefOr[CmafKeyProviderType] = js.native
}

object CmafEncryptionSettings {
  @scala.inline
  def apply(): CmafEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CmafEncryptionSettings]
  }
  @scala.inline
  implicit class CmafEncryptionSettingsOps[Self <: CmafEncryptionSettings] (val x: Self) extends AnyVal {
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
    def withEncryptionMethod(value: CmafEncryptionType): Self = {
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
    def withInitializationVectorInManifest(value: CmafInitializationVectorInManifest): Self = {
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
    def withSpekeKeyProvider(value: SpekeKeyProviderCmaf): Self = {
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
    def withType(value: CmafKeyProviderType): Self = {
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

