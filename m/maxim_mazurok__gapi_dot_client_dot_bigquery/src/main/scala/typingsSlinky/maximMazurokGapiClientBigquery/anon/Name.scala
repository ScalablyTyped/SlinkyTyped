package typingsSlinky.maximMazurokGapiClientBigquery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name extends StObject {
  
  /** [Output-only] Reservation name or "unreserved" for on-demand resources usage. */
  var name: js.UndefOr[String] = js.native
  
  /** [Output-only] Slot-milliseconds the job spent in the given reservation. */
  var slotMs: js.UndefOr[String] = js.native
}
object Name {
  
  @scala.inline
  def apply(): Name = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSlotMs(value: String): Self = StObject.set(x, "slotMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotMsUndefined: Self = StObject.set(x, "slotMs", js.undefined)
  }
}
