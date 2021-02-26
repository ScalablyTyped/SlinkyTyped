package typingsSlinky.reactBeautifulDnd.mod

import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TryGetLockOptions extends StObject {
  
  var sourceEvent: js.UndefOr[Event] = js.native
}
object TryGetLockOptions {
  
  @scala.inline
  def apply(): TryGetLockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TryGetLockOptions]
  }
  
  @scala.inline
  implicit class TryGetLockOptionsMutableBuilder[Self <: TryGetLockOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceEvent(value: Event): Self = StObject.set(x, "sourceEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceEventUndefined: Self = StObject.set(x, "sourceEvent", js.undefined)
  }
}
