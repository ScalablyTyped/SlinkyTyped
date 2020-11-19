package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConstantInitializationVector(value: stringMin32Max32Pattern09aFAF32): Self = this.set("ConstantInitializationVector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstantInitializationVector: Self = this.set("ConstantInitializationVector", js.undefined)
    
    @scala.inline
    def setEncryptionMethod(value: HlsEncryptionType): Self = this.set("EncryptionMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionMethod: Self = this.set("EncryptionMethod", js.undefined)
    
    @scala.inline
    def setInitializationVectorInManifest(value: HlsInitializationVectorInManifest): Self = this.set("InitializationVectorInManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitializationVectorInManifest: Self = this.set("InitializationVectorInManifest", js.undefined)
    
    @scala.inline
    def setOfflineEncrypted(value: HlsOfflineEncrypted): Self = this.set("OfflineEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfflineEncrypted: Self = this.set("OfflineEncrypted", js.undefined)
    
    @scala.inline
    def setSpekeKeyProvider(value: SpekeKeyProvider): Self = this.set("SpekeKeyProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpekeKeyProvider: Self = this.set("SpekeKeyProvider", js.undefined)
    
    @scala.inline
    def setStaticKeyProvider(value: StaticKeyProvider): Self = this.set("StaticKeyProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticKeyProvider: Self = this.set("StaticKeyProvider", js.undefined)
    
    @scala.inline
    def setType(value: HlsKeyProviderType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
