package typingsSlinky.overlayscrollbars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverflowAmountChangedArgs extends StObject {
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object OverflowAmountChangedArgs {
  
  @scala.inline
  def apply(x: Double, y: Double): OverflowAmountChangedArgs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverflowAmountChangedArgs]
  }
  
  @scala.inline
  implicit class OverflowAmountChangedArgsMutableBuilder[Self <: OverflowAmountChangedArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
