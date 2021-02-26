package typingsSlinky.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rows extends StObject {
  
  var first: Double = js.native
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
  
  var rows: Double = js.native
}
object Rows {
  
  @scala.inline
  def apply(first: Double, originalEvent: org.scalajs.dom.raw.Event, rows: Double): Rows = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rows]
  }
  
  @scala.inline
  implicit class RowsMutableBuilder[Self <: Rows] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
