package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementHeight extends StObject {
  
  var element: org.scalajs.dom.raw.Element = js.native
  
  var height: Double = js.native
  
  var width: Double = js.native
}
object ElementHeight {
  
  @scala.inline
  def apply(element: org.scalajs.dom.raw.Element, height: Double, width: Double): ElementHeight = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementHeight]
  }
  
  @scala.inline
  implicit class ElementHeightMutableBuilder[Self <: ElementHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
