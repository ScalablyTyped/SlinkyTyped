package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure contains information on a cell within a DataPilot table.
  *
  * This structure contains information on a particular cell within a DataPilot table, and is used to retrieve its metadata. The {@link PositionType}
  * member specifies in which sub-area of the table the cell is positioned, which in turn determines the type of metadata contained in the {@link
  * PositionData} member.
  * @see com.sun.star.sheet.DataPilotTablePositionType
  * @see com.sun.star.sheet.DataPiotTableResultData
  * @see com.sun.star.sheet.DataPiotTableHeaderData
  * @since OOo 3.0
  */
@js.native
trait DataPilotTablePositionData extends js.Object {
  
  /**
    * This member contains a structure of different types depending on the position type specified in {@link PositionType} member.
    *
    * When the value of {@link PositionType} is {@link DataPilotTablePositionType.RESULT} , {@link DataPilotTablePositionData.PositionData} contains an
    * instance of type {@link DataPilotTableResultData} , whereas when the value of {@link DataPilotTablePositionData.PositionType} is either {@link
    * DataPilotTablePositionType.ROW_HEADER} or {@link DataPilotTablePositionType.COLUMN_HEADER} , then the {@link PositionData} member contains an instance
    * of type {@link DataPilotTableHeaderData} .
    * @see com.sun.star.sheet.DataPiotTableResultData
    * @see com.sun.star.sheet.DataPiotTableHeaderData
    */
  var PositionData: js.Any = js.native
  
  /**
    * This parameter specifies which sub-area of a DataPilot table a given cell is positioned. See {@link DataPilotTablePositionType} for how to interpret
    * the value of this parameter.
    * @see com.sun.star.sheet.DataPilotTablePositionType
    */
  var PositionType: Double = js.native
}
object DataPilotTablePositionData {
  
  @scala.inline
  def apply(PositionData: js.Any, PositionType: Double): DataPilotTablePositionData = {
    val __obj = js.Dynamic.literal(PositionData = PositionData.asInstanceOf[js.Any], PositionType = PositionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPilotTablePositionData]
  }
  
  @scala.inline
  implicit class DataPilotTablePositionDataOps[Self <: DataPilotTablePositionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPositionData(value: js.Any): Self = this.set("PositionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionType(value: Double): Self = this.set("PositionType", value.asInstanceOf[js.Any])
  }
}
