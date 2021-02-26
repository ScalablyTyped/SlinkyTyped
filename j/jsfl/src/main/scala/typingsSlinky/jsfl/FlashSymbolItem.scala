package typingsSlinky.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashSymbolItem extends StObject {
  
  def convertToCompiledClip(): Unit = js.native
  
  def exportSWC(outputURI: String): Unit = js.native
  
  def exportSWF(outputURI: String): Unit = js.native
  
  var scalingGrid: Boolean = js.native
  
  var scalingGridRect: FlashRectangle = js.native
  
  var sourceAutoUpdate: Boolean = js.native
  
  var sourceFilePath: String = js.native
  
  var sourceLibraryName: String = js.native
  
  var symbolType: String = js.native
  
  var timeline: FlashTimeline = js.native
}
object FlashSymbolItem {
  
  @scala.inline
  def apply(
    convertToCompiledClip: () => Unit,
    exportSWC: String => Unit,
    exportSWF: String => Unit,
    scalingGrid: Boolean,
    scalingGridRect: FlashRectangle,
    sourceAutoUpdate: Boolean,
    sourceFilePath: String,
    sourceLibraryName: String,
    symbolType: String,
    timeline: FlashTimeline
  ): FlashSymbolItem = {
    val __obj = js.Dynamic.literal(convertToCompiledClip = js.Any.fromFunction0(convertToCompiledClip), exportSWC = js.Any.fromFunction1(exportSWC), exportSWF = js.Any.fromFunction1(exportSWF), scalingGrid = scalingGrid.asInstanceOf[js.Any], scalingGridRect = scalingGridRect.asInstanceOf[js.Any], sourceAutoUpdate = sourceAutoUpdate.asInstanceOf[js.Any], sourceFilePath = sourceFilePath.asInstanceOf[js.Any], sourceLibraryName = sourceLibraryName.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashSymbolItem]
  }
  
  @scala.inline
  implicit class FlashSymbolItemMutableBuilder[Self <: FlashSymbolItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvertToCompiledClip(value: () => Unit): Self = StObject.set(x, "convertToCompiledClip", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExportSWC(value: String => Unit): Self = StObject.set(x, "exportSWC", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExportSWF(value: String => Unit): Self = StObject.set(x, "exportSWF", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScalingGrid(value: Boolean): Self = StObject.set(x, "scalingGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingGridRect(value: FlashRectangle): Self = StObject.set(x, "scalingGridRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAutoUpdate(value: Boolean): Self = StObject.set(x, "sourceAutoUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFilePath(value: String): Self = StObject.set(x, "sourceFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLibraryName(value: String): Self = StObject.set(x, "sourceLibraryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolType(value: String): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeline(value: FlashTimeline): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
  }
}
