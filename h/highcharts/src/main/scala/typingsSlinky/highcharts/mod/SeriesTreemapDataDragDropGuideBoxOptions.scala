package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesTreemapDataDragDropGuideBoxOptions extends StObject {
  
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[DragDropGuideBoxOptionsObject] = js.native
}
object SeriesTreemapDataDragDropGuideBoxOptions {
  
  @scala.inline
  def apply(): SeriesTreemapDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesTreemapDataDragDropGuideBoxOptions]
  }
  
  @scala.inline
  implicit class SeriesTreemapDataDragDropGuideBoxOptionsMutableBuilder[Self <: SeriesTreemapDataDragDropGuideBoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: DragDropGuideBoxOptionsObject): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
