package typingsSlinky.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blue extends StObject {
  
  var blue: Double = js.native
  
  var green: Double = js.native
  
  var red: Double = js.native
}
object Blue {
  
  @scala.inline
  def apply(blue: Double, green: Double, red: Double): Blue = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blue]
  }
  
  @scala.inline
  implicit class BlueMutableBuilder[Self <: Blue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
  }
}
