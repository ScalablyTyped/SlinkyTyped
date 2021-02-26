package typingsSlinky.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightProps extends AbstractSeriesProps[LineMarkSeriesPoint] {
  
  var drag: js.UndefOr[Boolean] = js.native
  
  var enableX: js.UndefOr[Boolean] = js.native
  
  var enableY: js.UndefOr[Boolean] = js.native
  
  var highlightHeight: js.UndefOr[Double] = js.native
  
  var highlightWidth: js.UndefOr[Double] = js.native
  
  var highlightX: js.UndefOr[String | Double] = js.native
  
  var highlightY: js.UndefOr[String | Double] = js.native
  
  var onBrush: js.UndefOr[js.Function1[/* area */ HighlightArea | Null, Unit]] = js.native
  
  var onBrushEnd: js.UndefOr[js.Function1[/* area */ HighlightArea | Null, Unit]] = js.native
  
  var onBrushStart: js.UndefOr[js.Function1[/* area */ HighlightArea | Null, Unit]] = js.native
  
  var onDrag: js.UndefOr[js.Function1[/* area */ HighlightArea | Null, Unit]] = js.native
  
  var onDragEnd: js.UndefOr[js.Function1[/* area */ HighlightArea | Null, Unit]] = js.native
  
  var onDragStart: js.UndefOr[js.Function1[/* area */ HighlightArea | Null, Unit]] = js.native
}
object HighlightProps {
  
  @scala.inline
  def apply(): HighlightProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightProps]
  }
  
  @scala.inline
  implicit class HighlightPropsMutableBuilder[Self <: HighlightProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrag(value: Boolean): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setEnableX(value: Boolean): Self = StObject.set(x, "enableX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableXUndefined: Self = StObject.set(x, "enableX", js.undefined)
    
    @scala.inline
    def setEnableY(value: Boolean): Self = StObject.set(x, "enableY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableYUndefined: Self = StObject.set(x, "enableY", js.undefined)
    
    @scala.inline
    def setHighlightHeight(value: Double): Self = StObject.set(x, "highlightHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightHeightUndefined: Self = StObject.set(x, "highlightHeight", js.undefined)
    
    @scala.inline
    def setHighlightWidth(value: Double): Self = StObject.set(x, "highlightWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightWidthUndefined: Self = StObject.set(x, "highlightWidth", js.undefined)
    
    @scala.inline
    def setHighlightX(value: String | Double): Self = StObject.set(x, "highlightX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightXUndefined: Self = StObject.set(x, "highlightX", js.undefined)
    
    @scala.inline
    def setHighlightY(value: String | Double): Self = StObject.set(x, "highlightY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightYUndefined: Self = StObject.set(x, "highlightY", js.undefined)
    
    @scala.inline
    def setOnBrush(value: /* area */ HighlightArea | Null => Unit): Self = StObject.set(x, "onBrush", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBrushEnd(value: /* area */ HighlightArea | Null => Unit): Self = StObject.set(x, "onBrushEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBrushEndUndefined: Self = StObject.set(x, "onBrushEnd", js.undefined)
    
    @scala.inline
    def setOnBrushStart(value: /* area */ HighlightArea | Null => Unit): Self = StObject.set(x, "onBrushStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBrushStartUndefined: Self = StObject.set(x, "onBrushStart", js.undefined)
    
    @scala.inline
    def setOnBrushUndefined: Self = StObject.set(x, "onBrush", js.undefined)
    
    @scala.inline
    def setOnDrag(value: /* area */ HighlightArea | Null => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEnd(value: /* area */ HighlightArea | Null => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: /* area */ HighlightArea | Null => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    @scala.inline
    def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
  }
}
