package typingsSlinky.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinNumber extends StObject {
  
  var max: Double = js.native
  
  var min: Double = js.native
}
object MinNumber {
  
  @scala.inline
  def apply(max: Double, min: Double): MinNumber = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinNumber]
  }
  
  @scala.inline
  implicit class MinNumberMutableBuilder[Self <: MinNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
