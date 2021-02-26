package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.CellColor
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.FontColor
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Normal
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.TextAsNumber
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a condition in a sorting operation.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait SortField extends StObject {
  
  /**
    *
    * Specifies if the sorting is done in an ascending fashion.
    *
    * [Api set: ExcelApi 1.2]
    */
  var ascending: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies the color that is the target of the condition if the sorting is on font or cell color.
    *
    * [Api set: ExcelApi 1.2]
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    *
    * Represents additional sorting options for this field.
    *
    * [Api set: ExcelApi 1.2]
    */
  var dataOption: js.UndefOr[SortDataOption | Normal | TextAsNumber] = js.native
  
  /**
    *
    * Specifies the icon that is the target of the condition if the sorting is on the cell's icon.
    *
    * [Api set: ExcelApi 1.2]
    */
  var icon: js.UndefOr[Icon] = js.native
  
  /**
    *
    * Specifies the column (or row, depending on the sort orientation) that the condition is on. Represented as an offset from the first column (or row).
    *
    * [Api set: ExcelApi 1.2]
    */
  var key: Double = js.native
  
  /**
    *
    * Specifies the type of sorting of this condition.
    *
    * [Api set: ExcelApi 1.2]
    */
  var sortOn: js.UndefOr[
    SortOn | Value | CellColor | FontColor | typingsSlinky.officeJsPreview.officeJsPreviewStrings.Icon
  ] = js.native
  
  /**
    *
    * Specifies the subfield that is the target property name of a rich value to sort on.
    *
    * [Api set: ExcelApi 1.9]
    */
  var subField: js.UndefOr[String] = js.native
}
object SortField {
  
  @scala.inline
  def apply(key: Double): SortField = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortField]
  }
  
  @scala.inline
  implicit class SortFieldMutableBuilder[Self <: SortField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDataOption(value: SortDataOption | Normal | TextAsNumber): Self = StObject.set(x, "dataOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataOptionUndefined: Self = StObject.set(x, "dataOption", js.undefined)
    
    @scala.inline
    def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOn(
      value: SortOn | Value | CellColor | FontColor | typingsSlinky.officeJsPreview.officeJsPreviewStrings.Icon
    ): Self = StObject.set(x, "sortOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOnUndefined: Self = StObject.set(x, "sortOn", js.undefined)
    
    @scala.inline
    def setSubField(value: String): Self = StObject.set(x, "subField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubFieldUndefined: Self = StObject.set(x, "subField", js.undefined)
  }
}
