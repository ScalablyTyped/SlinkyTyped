package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesColumnpyramidDataDragDropGuideBoxOptions extends StObject {
  
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[DragDropGuideBoxOptionsObject] = js.native
}
object SeriesColumnpyramidDataDragDropGuideBoxOptions {
  
  @scala.inline
  def apply(): SeriesColumnpyramidDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesColumnpyramidDataDragDropGuideBoxOptions]
  }
  
  @scala.inline
  implicit class SeriesColumnpyramidDataDragDropGuideBoxOptionsMutableBuilder[Self <: SeriesColumnpyramidDataDragDropGuideBoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: DragDropGuideBoxOptionsObject): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
