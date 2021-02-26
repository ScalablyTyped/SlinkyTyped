package typingsSlinky.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgUnitInfo extends StObject {
  
  /** Org unit to search, as provided by the Admin SDK Directory API. */
  var orgUnitId: js.UndefOr[String] = js.native
}
object OrgUnitInfo {
  
  @scala.inline
  def apply(): OrgUnitInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgUnitInfo]
  }
  
  @scala.inline
  implicit class OrgUnitInfoMutableBuilder[Self <: OrgUnitInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrgUnitId(value: String): Self = StObject.set(x, "orgUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgUnitIdUndefined: Self = StObject.set(x, "orgUnitId", js.undefined)
  }
}
