package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.between
import typingsSlinky.plottable.plottableStrings.center
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Between extends StObject {
  
  var between: typingsSlinky.plottable.plottableStrings.between = js.native
  
  var center: typingsSlinky.plottable.plottableStrings.center = js.native
}
object Between {
  
  @scala.inline
  def apply(between: between, center: center): Between = {
    val __obj = js.Dynamic.literal(between = between.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any])
    __obj.asInstanceOf[Between]
  }
  
  @scala.inline
  implicit class BetweenMutableBuilder[Self <: Between] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBetween(value: between): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: center): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
  }
}
