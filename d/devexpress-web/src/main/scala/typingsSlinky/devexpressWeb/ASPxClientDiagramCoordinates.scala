package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the DiagramCoordinates class.
  */
@js.native
trait ASPxClientDiagramCoordinates extends js.Object {
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
  /**
    * Gets the value of the client-side axis instance. An ASPxClientAxisValue object that contains the information about the axis scale type and value.
    * @param axis An ASPxClientAxisBase class descendant, representing the axis that contains the requested value.
    */
  def GetAxisValue(axis: ASPxClientAxisBase): ASPxClientAxisValue = js.native
  /**
    * Checks whether the current object represents a point outside the diagram area.
    */
  def IsEmpty(): Boolean = js.native
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
  implicit class ASPxClientDiagramCoordinatesOps[Self <: ASPxClientDiagramCoordinates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAxisValue(value: ASPxClientAxisBase => ASPxClientAxisValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAxisValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withArgumentScaleType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentScaleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisX(value: ASPxClientAxisBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisY(value: ASPxClientAxisBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateTimeArgument(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeArgument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateTimeValue(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumericalArgument(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericalArgument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumericalValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericalValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPane(value: ASPxClientXYDiagramPane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQualitativeArgument(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualitativeArgument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeSpanArgument(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSpanArgument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeSpanValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSpanValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueScaleType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueScaleType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

