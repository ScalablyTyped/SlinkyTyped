package typingsSlinky.iobroker.anon

import typingsSlinky.iobroker.iobrokerBooleans.`true`
import typingsSlinky.iobroker.objectsMod.global.ioBroker.StringOrTranslated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<iobroker.iobroker/objects.<global>.ioBroker.DeviceCommon> */
@js.native
trait PartialDeviceCommon extends StObject {
  
  var custom: js.UndefOr[scala.Nothing] = js.native
  
  var dontDelete: js.UndefOr[`true`] = js.native
  
  var expert: js.UndefOr[`true`] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[StringOrTranslated] = js.native
  
  var role: js.UndefOr[String] = js.native
}
object PartialDeviceCommon {
  
  @scala.inline
  def apply(): PartialDeviceCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDeviceCommon]
  }
  
  @scala.inline
  implicit class PartialDeviceCommonMutableBuilder[Self <: PartialDeviceCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDontDelete(value: `true`): Self = StObject.set(x, "dontDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDontDeleteUndefined: Self = StObject.set(x, "dontDelete", js.undefined)
    
    @scala.inline
    def setExpert(value: `true`): Self = StObject.set(x, "expert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpertUndefined: Self = StObject.set(x, "expert", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setName(value: StringOrTranslated): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
