package typingsSlinky.jquerymobile

import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectMenuEvents extends StObject {
  
  var create: js.UndefOr[JQueryMobileEvent] = js.native
}
object SelectMenuEvents {
  
  @scala.inline
  def apply(): SelectMenuEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectMenuEvents]
  }
  
  @scala.inline
  implicit class SelectMenuEventsMutableBuilder[Self <: SelectMenuEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
  }
}
