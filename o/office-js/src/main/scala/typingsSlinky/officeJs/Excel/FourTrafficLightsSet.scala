package typingsSlinky.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FourTrafficLightsSet extends /* index */ NumberDictionary[Icon] {
  
  var blackCircleWithBorder: Icon = js.native
  
  var greenCircle: Icon = js.native
  
  var redCircleWithBorder: Icon = js.native
  
  var yellowCircle: Icon = js.native
}
object FourTrafficLightsSet {
  
  @scala.inline
  def apply(blackCircleWithBorder: Icon, greenCircle: Icon, redCircleWithBorder: Icon, yellowCircle: Icon): FourTrafficLightsSet = {
    val __obj = js.Dynamic.literal(blackCircleWithBorder = blackCircleWithBorder.asInstanceOf[js.Any], greenCircle = greenCircle.asInstanceOf[js.Any], redCircleWithBorder = redCircleWithBorder.asInstanceOf[js.Any], yellowCircle = yellowCircle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FourTrafficLightsSet]
  }
  
  @scala.inline
  implicit class FourTrafficLightsSetMutableBuilder[Self <: FourTrafficLightsSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlackCircleWithBorder(value: Icon): Self = StObject.set(x, "blackCircleWithBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreenCircle(value: Icon): Self = StObject.set(x, "greenCircle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedCircleWithBorder(value: Icon): Self = StObject.set(x, "redCircleWithBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYellowCircle(value: Icon): Self = StObject.set(x, "yellowCircle", value.asInstanceOf[js.Any])
  }
}
