package typingsSlinky.firebaseMessaging

import typingsSlinky.std.ClientTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientQueryOptions extends StObject {
  
  var includeReserved: js.UndefOr[Boolean] = js.native
  
  var includeUncontrolled: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[ClientTypes] = js.native
}
object ClientQueryOptions {
  
  @scala.inline
  def apply(): ClientQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientQueryOptions]
  }
  
  @scala.inline
  implicit class ClientQueryOptionsMutableBuilder[Self <: ClientQueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeReserved(value: Boolean): Self = StObject.set(x, "includeReserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeReservedUndefined: Self = StObject.set(x, "includeReserved", js.undefined)
    
    @scala.inline
    def setIncludeUncontrolled(value: Boolean): Self = StObject.set(x, "includeUncontrolled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUncontrolledUndefined: Self = StObject.set(x, "includeUncontrolled", js.undefined)
    
    @scala.inline
    def setType(value: ClientTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
