package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the measure metadata.
  */
@js.native
trait ASPxClientDashboardItemDataMeasure extends StObject {
  
  /**
    * Gets the data member that identifies the data source list used to provide data for the current measure.
    */
  var DataMember: String = js.native
  
  /**
    * Formats the specified value using format settings of the current measure. A String that represents the formatted value.
    * @param value A value to be formatted.
    */
  def Format(value: js.Any): String = js.native
  
  /**
    * Gets the measure identifier.
    */
  var Id: String = js.native
  
  /**
    * Gets the name of the measure.
    */
  var Name: String = js.native
  
  /**
    * Gets the type of summary function calculated against the current measure.
    */
  var SummaryType: String = js.native
}
object ASPxClientDashboardItemDataMeasure {
  
  @scala.inline
  def apply(DataMember: String, Format: js.Any => String, Id: String, Name: String, SummaryType: String): ASPxClientDashboardItemDataMeasure = {
    val __obj = js.Dynamic.literal(DataMember = DataMember.asInstanceOf[js.Any], Format = js.Any.fromFunction1(Format), Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SummaryType = SummaryType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemDataMeasure]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardItemDataMeasureMutableBuilder[Self <: ASPxClientDashboardItemDataMeasure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataMember(value: String): Self = StObject.set(x, "DataMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: js.Any => String): Self = StObject.set(x, "Format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryType(value: String): Self = StObject.set(x, "SummaryType", value.asInstanceOf[js.Any])
  }
}
