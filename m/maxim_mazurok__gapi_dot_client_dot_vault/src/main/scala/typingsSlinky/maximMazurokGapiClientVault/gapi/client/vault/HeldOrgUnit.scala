package typingsSlinky.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeldOrgUnit extends StObject {
  
  /** When the org unit was put on hold. This property is immutable. */
  var holdTime: js.UndefOr[String] = js.native
  
  /** The org unit's immutable ID as provided by the Admin SDK. */
  var orgUnitId: js.UndefOr[String] = js.native
}
object HeldOrgUnit {
  
  @scala.inline
  def apply(): HeldOrgUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeldOrgUnit]
  }
  
  @scala.inline
  implicit class HeldOrgUnitMutableBuilder[Self <: HeldOrgUnit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHoldTime(value: String): Self = StObject.set(x, "holdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoldTimeUndefined: Self = StObject.set(x, "holdTime", js.undefined)
    
    @scala.inline
    def setOrgUnitId(value: String): Self = StObject.set(x, "orgUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgUnitIdUndefined: Self = StObject.set(x, "orgUnitId", js.undefined)
  }
}
