package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.end
import typingsSlinky.plottable.plottableStrings.middle
import typingsSlinky.plottable.plottableStrings.outside
import typingsSlinky.plottable.plottableStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait End extends StObject {
  
  var end: typingsSlinky.plottable.plottableStrings.end = js.native
  
  var middle: typingsSlinky.plottable.plottableStrings.middle = js.native
  
  var outside: typingsSlinky.plottable.plottableStrings.outside = js.native
  
  var start: typingsSlinky.plottable.plottableStrings.start = js.native
}
object End {
  
  @scala.inline
  def apply(end: end, middle: middle, outside: outside, start: start): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], outside = outside.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  
  @scala.inline
  implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: end): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddle(value: middle): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutside(value: outside): Self = StObject.set(x, "outside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: start): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
