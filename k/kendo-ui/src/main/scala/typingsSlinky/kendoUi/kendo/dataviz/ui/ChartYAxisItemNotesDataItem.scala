package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartYAxisItemNotesDataItem extends StObject {
  
  var icon: js.UndefOr[ChartYAxisItemNotesDataItemIcon] = js.native
  
  var label: js.UndefOr[ChartYAxisItemNotesDataItemLabel] = js.native
  
  var line: js.UndefOr[ChartYAxisItemNotesDataItemLine] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object ChartYAxisItemNotesDataItem {
  
  @scala.inline
  def apply(): ChartYAxisItemNotesDataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartYAxisItemNotesDataItem]
  }
  
  @scala.inline
  implicit class ChartYAxisItemNotesDataItemMutableBuilder[Self <: ChartYAxisItemNotesDataItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: ChartYAxisItemNotesDataItemIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLabel(value: ChartYAxisItemNotesDataItemLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLine(value: ChartYAxisItemNotesDataItemLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
