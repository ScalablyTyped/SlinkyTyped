package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoCodecSettings extends StObject {
  
  var FrameCaptureSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.FrameCaptureSettings] = js.native
  
  var H264Settings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.H264Settings] = js.native
  
  var H265Settings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.H265Settings] = js.native
  
  var Mpeg2Settings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Mpeg2Settings] = js.native
}
object VideoCodecSettings {
  
  @scala.inline
  def apply(): VideoCodecSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoCodecSettings]
  }
  
  @scala.inline
  implicit class VideoCodecSettingsMutableBuilder[Self <: VideoCodecSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameCaptureSettings(value: FrameCaptureSettings): Self = StObject.set(x, "FrameCaptureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameCaptureSettingsUndefined: Self = StObject.set(x, "FrameCaptureSettings", js.undefined)
    
    @scala.inline
    def setH264Settings(value: H264Settings): Self = StObject.set(x, "H264Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH264SettingsUndefined: Self = StObject.set(x, "H264Settings", js.undefined)
    
    @scala.inline
    def setH265Settings(value: H265Settings): Self = StObject.set(x, "H265Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH265SettingsUndefined: Self = StObject.set(x, "H265Settings", js.undefined)
    
    @scala.inline
    def setMpeg2Settings(value: Mpeg2Settings): Self = StObject.set(x, "Mpeg2Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpeg2SettingsUndefined: Self = StObject.set(x, "Mpeg2Settings", js.undefined)
  }
}
