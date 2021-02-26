package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesXrangeDataDragDropGuideBoxOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) Style options for the guide box default
    * state.
    */
  var default: js.UndefOr[DragDropGuideBoxOptionsObject] = js.native
}
object SeriesXrangeDataDragDropGuideBoxOptions {
  
  @scala.inline
  def apply(): SeriesXrangeDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesXrangeDataDragDropGuideBoxOptions]
  }
  
  @scala.inline
  implicit class SeriesXrangeDataDragDropGuideBoxOptionsMutableBuilder[Self <: SeriesXrangeDataDragDropGuideBoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: DragDropGuideBoxOptionsObject): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
