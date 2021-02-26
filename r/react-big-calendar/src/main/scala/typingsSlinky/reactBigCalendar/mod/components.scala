package typingsSlinky.reactBigCalendar.mod

import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait components extends StObject {
  
  var dateCellWrapper: ReactComponentClass[js.Object] = js.native
  
  var eventWrapper: ReactComponentClass[Event] = js.native
}
object components {
  
  @scala.inline
  def apply(dateCellWrapper: ReactComponentClass[js.Object], eventWrapper: ReactComponentClass[Event]): components = {
    val __obj = js.Dynamic.literal(dateCellWrapper = dateCellWrapper.asInstanceOf[js.Any], eventWrapper = eventWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[components]
  }
  
  @scala.inline
  implicit class componentsMutableBuilder[Self <: components] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateCellWrapper(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "dateCellWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventWrapper(value: ReactComponentClass[Event]): Self = StObject.set(x, "eventWrapper", value.asInstanceOf[js.Any])
  }
}
