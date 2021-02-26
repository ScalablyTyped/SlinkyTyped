package typingsSlinky.azure.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expiry extends StObject {
  
  var Expiry: js.Date = js.native
  
  var Permission: js.UndefOr[String] = js.native
  
  var Start: js.UndefOr[js.Date] = js.native
}
object Expiry {
  
  @scala.inline
  def apply(Expiry: js.Date): Expiry = {
    val __obj = js.Dynamic.literal(Expiry = Expiry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expiry]
  }
  
  @scala.inline
  implicit class ExpiryMutableBuilder[Self <: Expiry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiry(value: js.Date): Self = StObject.set(x, "Expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermission(value: String): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "Permission", js.undefined)
    
    @scala.inline
    def setStart(value: js.Date): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
  }
}
