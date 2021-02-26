package typingsSlinky.reactWindow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridOnItemsRenderedProps extends StObject {
  
  var overscanColumnStartIndex: Double = js.native
  
  var overscanColumnStopIndex: Double = js.native
  
  var overscanRowStartIndex: Double = js.native
  
  var overscanRowStopIndex: Double = js.native
  
  var visibleColumnStartIndex: Double = js.native
  
  var visibleColumnStopIndex: Double = js.native
  
  var visibleRowStartIndex: Double = js.native
  
  var visibleRowStopIndex: Double = js.native
}
object GridOnItemsRenderedProps {
  
  @scala.inline
  def apply(
    overscanColumnStartIndex: Double,
    overscanColumnStopIndex: Double,
    overscanRowStartIndex: Double,
    overscanRowStopIndex: Double,
    visibleColumnStartIndex: Double,
    visibleColumnStopIndex: Double,
    visibleRowStartIndex: Double,
    visibleRowStopIndex: Double
  ): GridOnItemsRenderedProps = {
    val __obj = js.Dynamic.literal(overscanColumnStartIndex = overscanColumnStartIndex.asInstanceOf[js.Any], overscanColumnStopIndex = overscanColumnStopIndex.asInstanceOf[js.Any], overscanRowStartIndex = overscanRowStartIndex.asInstanceOf[js.Any], overscanRowStopIndex = overscanRowStopIndex.asInstanceOf[js.Any], visibleColumnStartIndex = visibleColumnStartIndex.asInstanceOf[js.Any], visibleColumnStopIndex = visibleColumnStopIndex.asInstanceOf[js.Any], visibleRowStartIndex = visibleRowStartIndex.asInstanceOf[js.Any], visibleRowStopIndex = visibleRowStopIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOnItemsRenderedProps]
  }
  
  @scala.inline
  implicit class GridOnItemsRenderedPropsMutableBuilder[Self <: GridOnItemsRenderedProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverscanColumnStartIndex(value: Double): Self = StObject.set(x, "overscanColumnStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscanColumnStopIndex(value: Double): Self = StObject.set(x, "overscanColumnStopIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscanRowStartIndex(value: Double): Self = StObject.set(x, "overscanRowStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscanRowStopIndex(value: Double): Self = StObject.set(x, "overscanRowStopIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleColumnStartIndex(value: Double): Self = StObject.set(x, "visibleColumnStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleColumnStopIndex(value: Double): Self = StObject.set(x, "visibleColumnStopIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleRowStartIndex(value: Double): Self = StObject.set(x, "visibleRowStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleRowStopIndex(value: Double): Self = StObject.set(x, "visibleRowStopIndex", value.asInstanceOf[js.Any])
  }
}
