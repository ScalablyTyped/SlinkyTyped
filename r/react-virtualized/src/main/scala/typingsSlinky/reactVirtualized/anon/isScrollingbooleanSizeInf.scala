package typingsSlinky.reactVirtualized.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  isScrolling :boolean} & react-virtualized.react-virtualized.SizeInfo */
@js.native
trait isScrollingbooleanSizeInf extends StObject {
  
  var height: Double = js.native
  
  var isScrolling: Boolean = js.native
  
  var width: Double = js.native
}
object isScrollingbooleanSizeInf {
  
  @scala.inline
  def apply(height: Double, isScrolling: Boolean, width: Double): isScrollingbooleanSizeInf = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[isScrollingbooleanSizeInf]
  }
  
  @scala.inline
  implicit class isScrollingbooleanSizeInfMutableBuilder[Self <: isScrollingbooleanSizeInf] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
