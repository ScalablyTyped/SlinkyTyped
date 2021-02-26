package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.end
import typingsSlinky.plottable.plottableStrings.middle
import typingsSlinky.plottable.plottableStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Middle extends StObject {
  
  var end: typingsSlinky.plottable.plottableStrings.end = js.native
  
  var middle: typingsSlinky.plottable.plottableStrings.middle = js.native
  
  var start: typingsSlinky.plottable.plottableStrings.start = js.native
}
object Middle {
  
  @scala.inline
  def apply(end: end, middle: middle, start: start): Middle = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Middle]
  }
  
  @scala.inline
  implicit class MiddleMutableBuilder[Self <: Middle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: end): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddle(value: middle): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: start): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
