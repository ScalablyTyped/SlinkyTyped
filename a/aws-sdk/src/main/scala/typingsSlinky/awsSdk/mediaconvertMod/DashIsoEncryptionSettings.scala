package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashIsoEncryptionSettings extends StObject {
  
  /**
    * This setting can improve the compatibility of your output with video players on obsolete devices. It applies only to DASH H.264 outputs with DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to correct problems with playback on older devices. Otherwise, keep the default setting CENC v1 (CENC_V1). If you choose Unencrypted SEI, for that output, the service will exclude the access unit delimiter and will leave the SEI NAL units unencrypted.
    */
  var PlaybackDeviceCompatibility: js.UndefOr[DashIsoPlaybackDeviceCompatibility] = js.native
  
  /**
    * If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption with a SPEKE-compliant key provider.  If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
    */
  var SpekeKeyProvider: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.SpekeKeyProvider] = js.native
}
object DashIsoEncryptionSettings {
  
  @scala.inline
  def apply(): DashIsoEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashIsoEncryptionSettings]
  }
  
  @scala.inline
  implicit class DashIsoEncryptionSettingsMutableBuilder[Self <: DashIsoEncryptionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaybackDeviceCompatibility(value: DashIsoPlaybackDeviceCompatibility): Self = StObject.set(x, "PlaybackDeviceCompatibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackDeviceCompatibilityUndefined: Self = StObject.set(x, "PlaybackDeviceCompatibility", js.undefined)
    
    @scala.inline
    def setSpekeKeyProvider(value: SpekeKeyProvider): Self = StObject.set(x, "SpekeKeyProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpekeKeyProviderUndefined: Self = StObject.set(x, "SpekeKeyProvider", js.undefined)
  }
}
