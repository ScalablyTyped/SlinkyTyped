package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartXAxisItemNotes extends StObject {
  
  var data: js.UndefOr[js.Array[ChartXAxisItemNotesDataItem]] = js.native
  
  var icon: js.UndefOr[ChartXAxisItemNotesIcon] = js.native
  
  var label: js.UndefOr[ChartXAxisItemNotesLabel] = js.native
  
  var line: js.UndefOr[ChartXAxisItemNotesLine] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var visual: js.UndefOr[js.Function] = js.native
}
object ChartXAxisItemNotes {
  
  @scala.inline
  def apply(): ChartXAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartXAxisItemNotes]
  }
  
  @scala.inline
  implicit class ChartXAxisItemNotesMutableBuilder[Self <: ChartXAxisItemNotes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[ChartXAxisItemNotesDataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: ChartXAxisItemNotesDataItem*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setIcon(value: ChartXAxisItemNotesIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLabel(value: ChartXAxisItemNotesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLine(value: ChartXAxisItemNotesLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setVisual(value: js.Function): Self = StObject.set(x, "visual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualUndefined: Self = StObject.set(x, "visual", js.undefined)
  }
}
