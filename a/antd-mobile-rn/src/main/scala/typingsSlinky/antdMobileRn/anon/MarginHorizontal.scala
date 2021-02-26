package typingsSlinky.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarginHorizontal extends StObject {
  
  var marginHorizontal: Double = js.native
  
  var marginVertical: Double = js.native
}
object MarginHorizontal {
  
  @scala.inline
  def apply(marginHorizontal: Double, marginVertical: Double): MarginHorizontal = {
    val __obj = js.Dynamic.literal(marginHorizontal = marginHorizontal.asInstanceOf[js.Any], marginVertical = marginVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginHorizontal]
  }
  
  @scala.inline
  implicit class MarginHorizontalMutableBuilder[Self <: MarginHorizontal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarginHorizontal(value: Double): Self = StObject.set(x, "marginHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginVertical(value: Double): Self = StObject.set(x, "marginVertical", value.asInstanceOf[js.Any])
  }
}
