package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapSchedulerAppointment extends js.Object {
  val appointmentId: String = js.native
  val appointmentType: BootstrapSchedulerAppointmentType = js.native
  val instance: js.Any = js.native
  val interval: BootstrapTimeInterval | Null = js.native
  val labelIndex: Double = js.native
  val resources: js.Array[String] = js.native
  val statusIndex: Double = js.native
  def addResource(resourceId: js.Object): Unit = js.native
  def getAllDay(): Boolean = js.native
  def getAppointmentType(): BootstrapSchedulerAppointmentType = js.native
  def getDescription(): String = js.native
  def getDuration(): Double = js.native
  def getEnd(): js.Date = js.native
  def getId(): js.Any = js.native
  def getLabelId(): Double = js.native
  def getLocation(): String = js.native
  def getRecurrenceInfo(): BootstrapSchedulerRecurrenceInfo | Null = js.native
  def getRecurrencePattern(): BootstrapSchedulerAppointment | Null = js.native
  def getResource(index: Double): js.Any = js.native
  def getStart(): js.Date = js.native
  def getStatusId(): Double = js.native
  def getSubject(): String = js.native
  def setAllDay(allDay: Boolean): Unit = js.native
  def setAppointmentType(`type`: BootstrapSchedulerAppointmentType): Unit = js.native
  def setDescription(description: String): Unit = js.native
  def setDuration(duration: Double): Unit = js.native
  def setEnd(end: js.Date): Unit = js.native
  def setId(id: js.Any): Unit = js.native
  def setLabelId(statusId: Double): Unit = js.native
  def setLocation(location: String): Unit = js.native
  def setRecurrenceInfo(recurrenceInfo: BootstrapSchedulerRecurrenceInfo): Unit = js.native
  def setStart(start: js.Date): Unit = js.native
  def setStatusId(statusId: Double): Unit = js.native
  def setSubject(subject: String): Unit = js.native
}

object BootstrapSchedulerAppointment {
  @scala.inline
  def apply(
    addResource: js.Object => Unit,
    appointmentId: String,
    appointmentType: BootstrapSchedulerAppointmentType,
    getAllDay: () => Boolean,
    getAppointmentType: () => BootstrapSchedulerAppointmentType,
    getDescription: () => String,
    getDuration: () => Double,
    getEnd: () => js.Date,
    getId: () => js.Any,
    getLabelId: () => Double,
    getLocation: () => String,
    getRecurrenceInfo: () => BootstrapSchedulerRecurrenceInfo | Null,
    getRecurrencePattern: () => BootstrapSchedulerAppointment | Null,
    getResource: Double => js.Any,
    getStart: () => js.Date,
    getStatusId: () => Double,
    getSubject: () => String,
    instance: js.Any,
    labelIndex: Double,
    resources: js.Array[String],
    setAllDay: Boolean => Unit,
    setAppointmentType: BootstrapSchedulerAppointmentType => Unit,
    setDescription: String => Unit,
    setDuration: Double => Unit,
    setEnd: js.Date => Unit,
    setId: js.Any => Unit,
    setLabelId: Double => Unit,
    setLocation: String => Unit,
    setRecurrenceInfo: BootstrapSchedulerRecurrenceInfo => Unit,
    setStart: js.Date => Unit,
    setStatusId: Double => Unit,
    setSubject: String => Unit,
    statusIndex: Double
  ): BootstrapSchedulerAppointment = {
    val __obj = js.Dynamic.literal(addResource = js.Any.fromFunction1(addResource), appointmentId = appointmentId.asInstanceOf[js.Any], appointmentType = appointmentType.asInstanceOf[js.Any], getAllDay = js.Any.fromFunction0(getAllDay), getAppointmentType = js.Any.fromFunction0(getAppointmentType), getDescription = js.Any.fromFunction0(getDescription), getDuration = js.Any.fromFunction0(getDuration), getEnd = js.Any.fromFunction0(getEnd), getId = js.Any.fromFunction0(getId), getLabelId = js.Any.fromFunction0(getLabelId), getLocation = js.Any.fromFunction0(getLocation), getRecurrenceInfo = js.Any.fromFunction0(getRecurrenceInfo), getRecurrencePattern = js.Any.fromFunction0(getRecurrencePattern), getResource = js.Any.fromFunction1(getResource), getStart = js.Any.fromFunction0(getStart), getStatusId = js.Any.fromFunction0(getStatusId), getSubject = js.Any.fromFunction0(getSubject), instance = instance.asInstanceOf[js.Any], labelIndex = labelIndex.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], setAllDay = js.Any.fromFunction1(setAllDay), setAppointmentType = js.Any.fromFunction1(setAppointmentType), setDescription = js.Any.fromFunction1(setDescription), setDuration = js.Any.fromFunction1(setDuration), setEnd = js.Any.fromFunction1(setEnd), setId = js.Any.fromFunction1(setId), setLabelId = js.Any.fromFunction1(setLabelId), setLocation = js.Any.fromFunction1(setLocation), setRecurrenceInfo = js.Any.fromFunction1(setRecurrenceInfo), setStart = js.Any.fromFunction1(setStart), setStatusId = js.Any.fromFunction1(setStatusId), setSubject = js.Any.fromFunction1(setSubject), statusIndex = statusIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapSchedulerAppointment]
  }
  @scala.inline
  implicit class BootstrapSchedulerAppointmentOps[Self <: BootstrapSchedulerAppointment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddResource(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addResource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAppointmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppointmentType(value: BootstrapSchedulerAppointmentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAllDay(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllDay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAppointmentType(value: () => BootstrapSchedulerAppointmentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAppointmentType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDescription(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDescription")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDuration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDuration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEnd(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLabelId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLocation(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRecurrenceInfo(value: () => BootstrapSchedulerRecurrenceInfo | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecurrenceInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRecurrencePattern(value: () => BootstrapSchedulerAppointment | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecurrencePattern")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetResource(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStart(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStatusId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatusId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSubject(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInstance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
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
    def withSetAllDay(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllDay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAppointmentType(value: BootstrapSchedulerAppointmentType => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAppointmentType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDescription(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDescription")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDuration(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDuration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetEnd(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetId(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLabelId(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabelId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLocation(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLocation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRecurrenceInfo(value: BootstrapSchedulerRecurrenceInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRecurrenceInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStart(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStatusId(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStatusId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSubject(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSubject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatusIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterval(value: BootstrapTimeInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntervalNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(null)
        ret
    }
  }
  
}

