package typingsSlinky.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the WorksheetCustomProperty object, for use in `worksheetCustomProperty.set({ ... })`. */
@js.native
trait WorksheetCustomPropertyUpdateData extends StObject {
  
  /**
    *
    * Gets or sets the value of the custom property.
    *
    * [Api set: ExcelApi 1.12]
    */
  var value: js.UndefOr[String] = js.native
}
object WorksheetCustomPropertyUpdateData {
  
  @scala.inline
  def apply(): WorksheetCustomPropertyUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetCustomPropertyUpdateData]
  }
  
  @scala.inline
  implicit class WorksheetCustomPropertyUpdateDataMutableBuilder[Self <: WorksheetCustomPropertyUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
