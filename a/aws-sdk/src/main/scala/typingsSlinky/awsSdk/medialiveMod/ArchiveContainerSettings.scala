package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArchiveContainerSettings extends StObject {
  
  var M2tsSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.M2tsSettings] = js.native
  
  var RawSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.RawSettings] = js.native
}
object ArchiveContainerSettings {
  
  @scala.inline
  def apply(): ArchiveContainerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchiveContainerSettings]
  }
  
  @scala.inline
  implicit class ArchiveContainerSettingsMutableBuilder[Self <: ArchiveContainerSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setM2tsSettings(value: M2tsSettings): Self = StObject.set(x, "M2tsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM2tsSettingsUndefined: Self = StObject.set(x, "M2tsSettings", js.undefined)
    
    @scala.inline
    def setRawSettings(value: RawSettings): Self = StObject.set(x, "RawSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawSettingsUndefined: Self = StObject.set(x, "RawSettings", js.undefined)
  }
}
