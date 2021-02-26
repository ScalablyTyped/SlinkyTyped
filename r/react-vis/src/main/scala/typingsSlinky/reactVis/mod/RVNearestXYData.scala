package typingsSlinky.reactVis.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RVNearestXYData[T /* <: AbstractSeriesPoint */] extends StObject {
  
  var event: SyntheticMouseEvent[HTMLElement] = js.native
  
  var index: Double = js.native
  
  var innerX: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any = js.native
  
  var innerY: /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any = js.native
}
object RVNearestXYData {
  
  @scala.inline
  def apply[T /* <: AbstractSeriesPoint */](
    event: SyntheticMouseEvent[HTMLElement],
    index: Double,
    innerX: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any,
    innerY: /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
  ): RVNearestXYData[T] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], innerX = innerX.asInstanceOf[js.Any], innerY = innerY.asInstanceOf[js.Any])
    __obj.asInstanceOf[RVNearestXYData[T]]
  }
  
  @scala.inline
  implicit class RVNearestXYDataMutableBuilder[Self <: RVNearestXYData[_], T /* <: AbstractSeriesPoint */] (val x: Self with RVNearestXYData[T]) extends AnyVal {
    
    @scala.inline
    def setEvent(value: SyntheticMouseEvent[HTMLElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerX(value: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any): Self = StObject.set(x, "innerX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerY(value: /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any): Self = StObject.set(x, "innerY", value.asInstanceOf[js.Any])
  }
}
