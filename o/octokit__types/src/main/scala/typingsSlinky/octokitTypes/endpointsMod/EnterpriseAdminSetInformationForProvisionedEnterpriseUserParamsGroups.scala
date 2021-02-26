package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminSetInformationForProvisionedEnterpriseUserParamsGroups extends StObject {
  
  var value: js.UndefOr[String] = js.native
}
object EnterpriseAdminSetInformationForProvisionedEnterpriseUserParamsGroups {
  
  @scala.inline
  def apply(): EnterpriseAdminSetInformationForProvisionedEnterpriseUserParamsGroups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterpriseAdminSetInformationForProvisionedEnterpriseUserParamsGroups]
  }
  
  @scala.inline
  implicit class EnterpriseAdminSetInformationForProvisionedEnterpriseUserParamsGroupsMutableBuilder[Self <: EnterpriseAdminSetInformationForProvisionedEnterpriseUserParamsGroups] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
