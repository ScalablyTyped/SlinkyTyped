package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPivotViewDataSelectorOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * A function that will be called to determine if an item can be moved in or dropped on an area of the data selector.
    * paramType="string" The location where the item will be moved - igPivotGrid, igPivotDataSelector, filters, rows, columns or measures.
    * paramType="string" The type of the item - Hierarchy, Measure or MeasureList.
    * paramType="string" The unique name of the item.
    * returnType="bool"  The function must return true if the item should be accepted.
    */
  var customMoveValidation: js.UndefOr[js.Function] = js.native
  
  /**
    * Settings for the drag and drop functionality of the igPivotDataSelector.
    */
  var dragAndDropSettings: js.UndefOr[IgPivotViewDataSelectorOptionsDragAndDropSettings] = js.native
  
  /**
    * Specifies the parent for the drop downs.
    */
  var dropDownParent: js.UndefOr[js.Any] = js.native
}
object IgPivotViewDataSelectorOptions {
  
  @scala.inline
  def apply(): IgPivotViewDataSelectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotViewDataSelectorOptions]
  }
  
  @scala.inline
  implicit class IgPivotViewDataSelectorOptionsMutableBuilder[Self <: IgPivotViewDataSelectorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomMoveValidation(value: js.Function): Self = StObject.set(x, "customMoveValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMoveValidationUndefined: Self = StObject.set(x, "customMoveValidation", js.undefined)
    
    @scala.inline
    def setDragAndDropSettings(value: IgPivotViewDataSelectorOptionsDragAndDropSettings): Self = StObject.set(x, "dragAndDropSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragAndDropSettingsUndefined: Self = StObject.set(x, "dragAndDropSettings", js.undefined)
    
    @scala.inline
    def setDropDownParent(value: js.Any): Self = StObject.set(x, "dropDownParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownParentUndefined: Self = StObject.set(x, "dropDownParent", js.undefined)
  }
}
