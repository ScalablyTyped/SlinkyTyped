package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Appointment class.
  */
@js.native
trait ASPxClientAppointment extends js.Object {
  /**
    * Returns the client appointment ID.
    */
  var appointmentId: String = js.native
  /**
    * Gets the appointment type.
    */
  var appointmentType: ASPxAppointmentType = js.native
  /**
    * Gets or sets the time interval of the time cells covered by the current appointment.
    */
  var interval: ASPxClientTimeInterval = js.native
  /**
    * Returns the label's index.
    */
  var labelIndex: Double = js.native
  /**
    * Gets resources associated with the appointment.
    */
  var resources: js.Array[String] = js.native
  /**
    * Gets the status index.
    */
  var statusIndex: Double = js.native
  /**
    * Adds a resource to the collection of resources associated with the client appointment.
    * @param resourceId An object, representing the resource id.
    */
  def AddResource(resourceId: String): Unit = js.native
  /**
    * Returns a value specifying whether the current appointment lasts the entire day.
    */
  def GetAllDay(): Boolean = js.native
  /**
    * Returns the appointment type.
    */
  def GetAppointmentType(): ASPxAppointmentType = js.native
  /**
    * Gets the description of the appointment.
    */
  def GetDescription(): String = js.native
  /**
    * Returns the duration of the appointment.
    */
  def GetDuration(): Double = js.native
  /**
    * Gets the end date and time of the appointment.
    */
  def GetEnd(): js.Date = js.native
  /**
    * Gets the ID of the client appointment.
    */
  def GetId(): String = js.native
  /**
    * Gets or sets the integer identifier of the label object associated with the appointment.
    */
  def GetLabelId(): Double = js.native
  /**
    * Gets or sets the text that specifies a place where the appointment is scheduled.
    */
  def GetLocation(): String = js.native
  /**
    * Gets the property value of the client appointment corresponding to the Appointment.RecurrenceInfo appointment property.
    */
  def GetRecurrenceInfo(): ASPxClientRecurrenceInfo = js.native
  /**
    * Gets the appointment that is the Appointment.RecurrencePattern for the current appointment.
    */
  def GetRecurrencePattern(): ASPxClientAppointment = js.native
  /**
    * Gets the resource associated with the client-side appointment by its index. An identifier of the specified resource (IPersistentObject.Id)
    * @param index An integer, representing an index of a resource in a resource collection associated with the current appointment.
    */
  def GetResource(index: Double): String = js.native
  /**
    * Gets the start date and time of the appointment.
    */
  def GetStart(): js.Date = js.native
  /**
    * Gets or sets the integer identifier of the status object associated with the appointment.
    */
  def GetStatusId(): Double = js.native
  /**
    * Gets or sets the appointment's subject text.
    */
  def GetSubject(): String = js.native
  /**
    * Specifies the property value of the client appointment corresponding to the Appointment.AllDay appointment property.
    * @param allDay true to indicate the all-day appointment; otherwise, false.
    */
  def SetAllDay(allDay: Boolean): Unit = js.native
  /**
    * Specifies the type of the current client appointment.
    * @param type An ASPxAppointmentType enumeration value indicating the appointment type.
    */
  def SetAppointmentType(`type`: ASPxAppointmentType): Unit = js.native
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Description appointment property.
    * @param description A string representing the appointment description.
    */
  def SetDescription(description: String): Unit = js.native
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Duration appointment property.
    * @param duration A TimeSpan object representing the appointment duration.
    */
  def SetDuration(duration: js.Any): Unit = js.native
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.End appointment property.
    * @param end A JavaScript Date object representing the end of the appointment.
    */
  def SetEnd(end: js.Date): Unit = js.native
  /**
    * Sets the ID of the client appointment.
    * @param id An string value representing the appointment identifier.
    */
  def SetId(id: String): Unit = js.native
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.LabelId appointment property.
    * @param statusId An integer representing the index of the label in the AppointmentStorage.Labels label collection.
    */
  def SetLabelId(statusId: Double): Unit = js.native
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Location appointment property.
    * @param location A string representing the appointment location.
    */
  def SetLocation(location: String): Unit = js.native
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.RecurrenceInfo appointment property.
    * @param recurrenceInfo An ASPxClientRecurrenceInfo object representing the recurrence information.
    */
  def SetRecurrenceInfo(recurrenceInfo: ASPxClientRecurrenceInfo): Unit = js.native
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Start appointment property.
    * @param start A JavaScript Date object representing the appointment start.
    */
  def SetStart(start: js.Date): Unit = js.native
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.StatusId appointment property.
    * @param statusId An integer representing the index in the AppointmentStatusCollection.
    */
  def SetStatusId(statusId: Double): Unit = js.native
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Subject appointment property.
    * @param subject A string containing the appointment subject.
    */
  def SetSubject(subject: String): Unit = js.native
}

object ASPxClientAppointment {
  @scala.inline
  def apply(
    AddResource: String => Unit,
    GetAllDay: () => Boolean,
    GetAppointmentType: () => ASPxAppointmentType,
    GetDescription: () => String,
    GetDuration: () => Double,
    GetEnd: () => js.Date,
    GetId: () => String,
    GetLabelId: () => Double,
    GetLocation: () => String,
    GetRecurrenceInfo: () => ASPxClientRecurrenceInfo,
    GetRecurrencePattern: () => ASPxClientAppointment,
    GetResource: Double => String,
    GetStart: () => js.Date,
    GetStatusId: () => Double,
    GetSubject: () => String,
    SetAllDay: Boolean => Unit,
    SetAppointmentType: ASPxAppointmentType => Unit,
    SetDescription: String => Unit,
    SetDuration: js.Any => Unit,
    SetEnd: js.Date => Unit,
    SetId: String => Unit,
    SetLabelId: Double => Unit,
    SetLocation: String => Unit,
    SetRecurrenceInfo: ASPxClientRecurrenceInfo => Unit,
    SetStart: js.Date => Unit,
    SetStatusId: Double => Unit,
    SetSubject: String => Unit,
    appointmentId: String,
    appointmentType: ASPxAppointmentType,
    interval: ASPxClientTimeInterval,
    labelIndex: Double,
    resources: js.Array[String],
    statusIndex: Double
  ): ASPxClientAppointment = {
    val __obj = js.Dynamic.literal(AddResource = js.Any.fromFunction1(AddResource), GetAllDay = js.Any.fromFunction0(GetAllDay), GetAppointmentType = js.Any.fromFunction0(GetAppointmentType), GetDescription = js.Any.fromFunction0(GetDescription), GetDuration = js.Any.fromFunction0(GetDuration), GetEnd = js.Any.fromFunction0(GetEnd), GetId = js.Any.fromFunction0(GetId), GetLabelId = js.Any.fromFunction0(GetLabelId), GetLocation = js.Any.fromFunction0(GetLocation), GetRecurrenceInfo = js.Any.fromFunction0(GetRecurrenceInfo), GetRecurrencePattern = js.Any.fromFunction0(GetRecurrencePattern), GetResource = js.Any.fromFunction1(GetResource), GetStart = js.Any.fromFunction0(GetStart), GetStatusId = js.Any.fromFunction0(GetStatusId), GetSubject = js.Any.fromFunction0(GetSubject), SetAllDay = js.Any.fromFunction1(SetAllDay), SetAppointmentType = js.Any.fromFunction1(SetAppointmentType), SetDescription = js.Any.fromFunction1(SetDescription), SetDuration = js.Any.fromFunction1(SetDuration), SetEnd = js.Any.fromFunction1(SetEnd), SetId = js.Any.fromFunction1(SetId), SetLabelId = js.Any.fromFunction1(SetLabelId), SetLocation = js.Any.fromFunction1(SetLocation), SetRecurrenceInfo = js.Any.fromFunction1(SetRecurrenceInfo), SetStart = js.Any.fromFunction1(SetStart), SetStatusId = js.Any.fromFunction1(SetStatusId), SetSubject = js.Any.fromFunction1(SetSubject), appointmentId = appointmentId.asInstanceOf[js.Any], appointmentType = appointmentType.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], labelIndex = labelIndex.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], statusIndex = statusIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointment]
  }
  @scala.inline
  implicit class ASPxClientAppointmentOps[Self <: ASPxClientAppointment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddResource(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddResource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAllDay(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAllDay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAppointmentType(value: () => ASPxAppointmentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAppointmentType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDescription(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetDescription")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDuration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetDuration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEnd(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLabelId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLabelId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLocation(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLocation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRecurrenceInfo(value: () => ASPxClientRecurrenceInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetRecurrenceInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRecurrencePattern(value: () => ASPxClientAppointment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetRecurrencePattern")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetResource(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetResource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStart(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStatusId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetStatusId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSubject(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetSubject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAllDay(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetAllDay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAppointmentType(value: ASPxAppointmentType => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetAppointmentType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDescription(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDescription")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDuration(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDuration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetEnd(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetId(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLabelId(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetLabelId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLocation(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetLocation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRecurrenceInfo(value: ASPxClientRecurrenceInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetRecurrenceInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStart(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStatusId(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetStatusId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSubject(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetSubject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAppointmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppointmentType(value: ASPxAppointmentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterval(value: ASPxClientTimeInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

