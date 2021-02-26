package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains the layout information of a {@link DataPilotField} . */
@js.native
trait DataPilotFieldLayoutInfo extends StObject {
  
  /** If `TRUE` , an empty row is inserted in the {@link DataPilotTable} result table after the data (including the subtotals) for each item of the field. */
  var AddEmptyLines: Boolean = js.native
  
  /**
    * specifies the layout mode.
    * @see com.sun.star.sheet.DataPilotFieldLayoutMode
    */
  var LayoutMode: Double = js.native
}
object DataPilotFieldLayoutInfo {
  
  @scala.inline
  def apply(AddEmptyLines: Boolean, LayoutMode: Double): DataPilotFieldLayoutInfo = {
    val __obj = js.Dynamic.literal(AddEmptyLines = AddEmptyLines.asInstanceOf[js.Any], LayoutMode = LayoutMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPilotFieldLayoutInfo]
  }
  
  @scala.inline
  implicit class DataPilotFieldLayoutInfoMutableBuilder[Self <: DataPilotFieldLayoutInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEmptyLines(value: Boolean): Self = StObject.set(x, "AddEmptyLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutMode(value: Double): Self = StObject.set(x, "LayoutMode", value.asInstanceOf[js.Any])
  }
}
