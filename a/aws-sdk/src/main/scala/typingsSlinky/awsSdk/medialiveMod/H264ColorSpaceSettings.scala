package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait H264ColorSpaceSettings extends StObject {
  
  var ColorSpacePassthroughSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.ColorSpacePassthroughSettings] = js.native
  
  var Rec601Settings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Rec601Settings] = js.native
  
  var Rec709Settings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Rec709Settings] = js.native
}
object H264ColorSpaceSettings {
  
  @scala.inline
  def apply(): H264ColorSpaceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[H264ColorSpaceSettings]
  }
  
  @scala.inline
  implicit class H264ColorSpaceSettingsMutableBuilder[Self <: H264ColorSpaceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorSpacePassthroughSettings(value: ColorSpacePassthroughSettings): Self = StObject.set(x, "ColorSpacePassthroughSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSpacePassthroughSettingsUndefined: Self = StObject.set(x, "ColorSpacePassthroughSettings", js.undefined)
    
    @scala.inline
    def setRec601Settings(value: Rec601Settings): Self = StObject.set(x, "Rec601Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRec601SettingsUndefined: Self = StObject.set(x, "Rec601Settings", js.undefined)
    
    @scala.inline
    def setRec709Settings(value: Rec709Settings): Self = StObject.set(x, "Rec709Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRec709SettingsUndefined: Self = StObject.set(x, "Rec709Settings", js.undefined)
  }
}
