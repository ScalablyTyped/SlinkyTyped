package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsCdnSettings extends StObject {
  
  var HlsAkamaiSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.HlsAkamaiSettings] = js.native
  
  var HlsBasicPutSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.HlsBasicPutSettings] = js.native
  
  var HlsMediaStoreSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.HlsMediaStoreSettings] = js.native
  
  var HlsWebdavSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.HlsWebdavSettings] = js.native
}
object HlsCdnSettings {
  
  @scala.inline
  def apply(): HlsCdnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsCdnSettings]
  }
  
  @scala.inline
  implicit class HlsCdnSettingsMutableBuilder[Self <: HlsCdnSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHlsAkamaiSettings(value: HlsAkamaiSettings): Self = StObject.set(x, "HlsAkamaiSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlsAkamaiSettingsUndefined: Self = StObject.set(x, "HlsAkamaiSettings", js.undefined)
    
    @scala.inline
    def setHlsBasicPutSettings(value: HlsBasicPutSettings): Self = StObject.set(x, "HlsBasicPutSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlsBasicPutSettingsUndefined: Self = StObject.set(x, "HlsBasicPutSettings", js.undefined)
    
    @scala.inline
    def setHlsMediaStoreSettings(value: HlsMediaStoreSettings): Self = StObject.set(x, "HlsMediaStoreSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlsMediaStoreSettingsUndefined: Self = StObject.set(x, "HlsMediaStoreSettings", js.undefined)
    
    @scala.inline
    def setHlsWebdavSettings(value: HlsWebdavSettings): Self = StObject.set(x, "HlsWebdavSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlsWebdavSettingsUndefined: Self = StObject.set(x, "HlsWebdavSettings", js.undefined)
  }
}
