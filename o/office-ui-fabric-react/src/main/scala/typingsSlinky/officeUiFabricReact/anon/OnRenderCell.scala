package typingsSlinky.officeUiFabricReact.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnRenderCell extends StObject {
  
  def onRenderCell(item: js.Any, index: Double, containsFocus: Boolean): ReactElement = js.native
  
  var renderedWindowsAhead: Double = js.native
  
  var renderedWindowsBehind: Double = js.native
  
  var startIndex: Double = js.native
}
object OnRenderCell {
  
  @scala.inline
  def apply(
    onRenderCell: (js.Any, Double, Boolean) => ReactElement,
    renderedWindowsAhead: Double,
    renderedWindowsBehind: Double,
    startIndex: Double
  ): OnRenderCell = {
    val __obj = js.Dynamic.literal(onRenderCell = js.Any.fromFunction3(onRenderCell), renderedWindowsAhead = renderedWindowsAhead.asInstanceOf[js.Any], renderedWindowsBehind = renderedWindowsBehind.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRenderCell]
  }
  
  @scala.inline
  implicit class OnRenderCellMutableBuilder[Self <: OnRenderCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnRenderCell(value: (js.Any, Double, Boolean) => ReactElement): Self = StObject.set(x, "onRenderCell", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRenderedWindowsAhead(value: Double): Self = StObject.set(x, "renderedWindowsAhead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedWindowsBehind(value: Double): Self = StObject.set(x, "renderedWindowsBehind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
  }
}
