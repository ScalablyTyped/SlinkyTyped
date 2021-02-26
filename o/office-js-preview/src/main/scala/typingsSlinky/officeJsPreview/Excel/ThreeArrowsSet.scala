package typingsSlinky.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreeArrowsSet extends /* index */ NumberDictionary[Icon] {
  
  var greenUpArrow: Icon = js.native
  
  var redDownArrow: Icon = js.native
  
  var yellowSideArrow: Icon = js.native
}
object ThreeArrowsSet {
  
  @scala.inline
  def apply(greenUpArrow: Icon, redDownArrow: Icon, yellowSideArrow: Icon): ThreeArrowsSet = {
    val __obj = js.Dynamic.literal(greenUpArrow = greenUpArrow.asInstanceOf[js.Any], redDownArrow = redDownArrow.asInstanceOf[js.Any], yellowSideArrow = yellowSideArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeArrowsSet]
  }
  
  @scala.inline
  implicit class ThreeArrowsSetMutableBuilder[Self <: ThreeArrowsSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGreenUpArrow(value: Icon): Self = StObject.set(x, "greenUpArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedDownArrow(value: Icon): Self = StObject.set(x, "redDownArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYellowSideArrow(value: Icon): Self = StObject.set(x, "yellowSideArrow", value.asInstanceOf[js.Any])
  }
}
