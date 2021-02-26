package typingsSlinky.reactVirtualized.esGridMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridState extends StObject {
  
  var isScrolling: Boolean = js.native
  
  var scrollDirectionHorizontal: ScrollDirection = js.native
  
  var scrollDirectionVertical: ScrollDirection = js.native
  
  var scrollLeft: Double = js.native
  
  var scrollTop: Double = js.native
}
object GridState {
  
  @scala.inline
  def apply(
    isScrolling: Boolean,
    scrollDirectionHorizontal: ScrollDirection,
    scrollDirectionVertical: ScrollDirection,
    scrollLeft: Double,
    scrollTop: Double
  ): GridState = {
    val __obj = js.Dynamic.literal(isScrolling = isScrolling.asInstanceOf[js.Any], scrollDirectionHorizontal = scrollDirectionHorizontal.asInstanceOf[js.Any], scrollDirectionVertical = scrollDirectionVertical.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridState]
  }
  
  @scala.inline
  implicit class GridStateMutableBuilder[Self <: GridState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollDirectionHorizontal(value: ScrollDirection): Self = StObject.set(x, "scrollDirectionHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollDirectionVertical(value: ScrollDirection): Self = StObject.set(x, "scrollDirectionVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
