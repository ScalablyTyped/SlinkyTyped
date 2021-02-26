package typingsSlinky.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FourRedToBlackSet extends /* index */ NumberDictionary[Icon] {
  
  var blackCircle: Icon = js.native
  
  var grayCircle: Icon = js.native
  
  var pinkCircle: Icon = js.native
  
  var redCircle: Icon = js.native
}
object FourRedToBlackSet {
  
  @scala.inline
  def apply(blackCircle: Icon, grayCircle: Icon, pinkCircle: Icon, redCircle: Icon): FourRedToBlackSet = {
    val __obj = js.Dynamic.literal(blackCircle = blackCircle.asInstanceOf[js.Any], grayCircle = grayCircle.asInstanceOf[js.Any], pinkCircle = pinkCircle.asInstanceOf[js.Any], redCircle = redCircle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FourRedToBlackSet]
  }
  
  @scala.inline
  implicit class FourRedToBlackSetMutableBuilder[Self <: FourRedToBlackSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlackCircle(value: Icon): Self = StObject.set(x, "blackCircle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrayCircle(value: Icon): Self = StObject.set(x, "grayCircle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinkCircle(value: Icon): Self = StObject.set(x, "pinkCircle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedCircle(value: Icon): Self = StObject.set(x, "redCircle", value.asInstanceOf[js.Any])
  }
}
