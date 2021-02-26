package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServiceSettingResult extends StObject {
  
  /**
    * The query result of the current service setting.
    */
  var ServiceSetting: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ServiceSetting] = js.native
}
object GetServiceSettingResult {
  
  @scala.inline
  def apply(): GetServiceSettingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceSettingResult]
  }
  
  @scala.inline
  implicit class GetServiceSettingResultMutableBuilder[Self <: GetServiceSettingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceSetting(value: ServiceSetting): Self = StObject.set(x, "ServiceSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceSettingUndefined: Self = StObject.set(x, "ServiceSetting", js.undefined)
  }
}
