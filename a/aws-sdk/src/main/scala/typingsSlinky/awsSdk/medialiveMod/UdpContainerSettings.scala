package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UdpContainerSettings extends StObject {
  
  var M2tsSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.M2tsSettings] = js.native
}
object UdpContainerSettings {
  
  @scala.inline
  def apply(): UdpContainerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UdpContainerSettings]
  }
  
  @scala.inline
  implicit class UdpContainerSettingsMutableBuilder[Self <: UdpContainerSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setM2tsSettings(value: M2tsSettings): Self = StObject.set(x, "M2tsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM2tsSettingsUndefined: Self = StObject.set(x, "M2tsSettings", js.undefined)
  }
}
