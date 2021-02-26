package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the DiagramCoordinates class.
  */
@js.native
trait ASPxClientDiagramCoordinates extends StObject {
  
  /**
    * Gets the value of the client-side axis instance. An ASPxClientAxisValue object that contains the information about the axis scale type and value.
    * @param axis An ASPxClientAxisBase class descendant, representing the axis that contains the requested value.
    */
  def GetAxisValue(axis: ASPxClientAxisBase): ASPxClientAxisValue = js.native
  
  /**
    * Checks whether the current object represents a point outside the diagram area.
    */
  def IsEmpty(): Boolean = js.native
  
  /**
    * Gets the type of the argument scale.
    */
  var argumentScaleType: String = js.native
  
  /**
    * Gets the X-axis of the diagram point.
    */
  var axisX: ASPxClientAxisBase = js.native
  
  /**
    * Gets the Y-axis of the diagram point.
    */
  var axisY: ASPxClientAxisBase = js.native
  
  /**
    * Gets the date-time representation of the data point's argument.
    */
  var dateTimeArgument: js.Date = js.native
  
  /**
    * Gets the date-time representation of the data point's value.
    */
  var dateTimeValue: js.Date = js.native
  
  /**
    * Gets the numerical representation of the data point's argument.
    */
  var numericalArgument: Double = js.native
  
  /**
    * Gets the numerical representation of the data point's value.
    */
  var numericalValue: Double = js.native
  
  /**
    * Gets the pane of the diagram point.
    */
  var pane: ASPxClientXYDiagramPane = js.native
  
  /**
    * Gets the argument of the data point as a text string.
    */
  var qualitativeArgument: String = js.native
  
  var timeSpanArgument: js.Any = js.native
  
  var timeSpanValue: js.Any = js.native
  
  /**
    * Gets the type of the value scale.
    */
  var valueScaleType: String = js.native
}
object ASPxClientDiagramCoordinates {
  
  @scala.inline
  def apply(
    GetAxisValue: ASPxClientAxisBase => ASPxClientAxisValue,
    IsEmpty: () => Boolean,
    argumentScaleType: String,
    axisX: ASPxClientAxisBase,
    axisY: ASPxClientAxisBase,
    dateTimeArgument: js.Date,
    dateTimeValue: js.Date,
    numericalArgument: Double,
    numericalValue: Double,
    pane: ASPxClientXYDiagramPane,
    qualitativeArgument: String,
    timeSpanArgument: js.Any,
    timeSpanValue: js.Any,
    valueScaleType: String
  ): ASPxClientDiagramCoordinates = {
    val __obj = js.Dynamic.literal(GetAxisValue = js.Any.fromFunction1(GetAxisValue), IsEmpty = js.Any.fromFunction0(IsEmpty), argumentScaleType = argumentScaleType.asInstanceOf[js.Any], axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], dateTimeArgument = dateTimeArgument.asInstanceOf[js.Any], dateTimeValue = dateTimeValue.asInstanceOf[js.Any], numericalArgument = numericalArgument.asInstanceOf[js.Any], numericalValue = numericalValue.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], qualitativeArgument = qualitativeArgument.asInstanceOf[js.Any], timeSpanArgument = timeSpanArgument.asInstanceOf[js.Any], timeSpanValue = timeSpanValue.asInstanceOf[js.Any], valueScaleType = valueScaleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramCoordinates]
  }
  
  @scala.inline
  implicit class ASPxClientDiagramCoordinatesMutableBuilder[Self <: ASPxClientDiagramCoordinates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgumentScaleType(value: String): Self = StObject.set(x, "argumentScaleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisX(value: ASPxClientAxisBase): Self = StObject.set(x, "axisX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisY(value: ASPxClientAxisBase): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeArgument(value: js.Date): Self = StObject.set(x, "dateTimeArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeValue(value: js.Date): Self = StObject.set(x, "dateTimeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAxisValue(value: ASPxClientAxisBase => ASPxClientAxisValue): Self = StObject.set(x, "GetAxisValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "IsEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNumericalArgument(value: Double): Self = StObject.set(x, "numericalArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericalValue(value: Double): Self = StObject.set(x, "numericalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPane(value: ASPxClientXYDiagramPane): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualitativeArgument(value: String): Self = StObject.set(x, "qualitativeArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSpanArgument(value: js.Any): Self = StObject.set(x, "timeSpanArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSpanValue(value: js.Any): Self = StObject.set(x, "timeSpanValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueScaleType(value: String): Self = StObject.set(x, "valueScaleType", value.asInstanceOf[js.Any])
  }
}
