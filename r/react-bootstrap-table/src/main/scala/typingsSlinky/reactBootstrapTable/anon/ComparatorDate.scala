package typingsSlinky.reactBootstrapTable.anon

import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComparatorDate extends StObject {
  
  var comparator: CSSProperties = js.native
  
  var date: CSSProperties = js.native
}
object ComparatorDate {
  
  @scala.inline
  def apply(comparator: CSSProperties, date: CSSProperties): ComparatorDate = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComparatorDate]
  }
  
  @scala.inline
  implicit class ComparatorDateMutableBuilder[Self <: ComparatorDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparator(value: CSSProperties): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: CSSProperties): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
