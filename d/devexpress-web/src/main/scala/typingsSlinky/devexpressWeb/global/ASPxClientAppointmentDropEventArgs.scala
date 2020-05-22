package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentDrop event.
  */
@JSGlobal("ASPxClientAppointmentDropEventArgs")
@js.native
class ASPxClientAppointmentDropEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientAppointmentDropEventArgs {
  /**
    * Initializes a new instance of the ASPxClientAppointmentDropEventArgs class.
    * @param operation An ASPxClientAppointmentOperation object providing methods to perform or cancel the drag operation.
    * @param dragInformation An array of ASPxClientAppointmentDragInfo objects storing information about dropped appointments.
    */
  def this(
    operation: typingsSlinky.devexpressWeb.ASPxClientAppointmentOperation,
    dragInformation: js.Array[typingsSlinky.devexpressWeb.ASPxClientAppointmentDragInfo]
  ) = this()
  /**
    * Provides information about dropped appointments.
    */
  /* CompleteClass */
  override var dragInformation: js.Array[typingsSlinky.devexpressWeb.ASPxClientAppointmentDragInfo] = js.native
  /**
    * Gets or sets a value that specifies whether the event is handled, and the default processing is not required.
    */
  /* CompleteClass */
  override var handled: Boolean = js.native
  /**
    * Provides access to an object that enables you to choose an operation to perform.
    */
  /* CompleteClass */
  override var operation: typingsSlinky.devexpressWeb.ASPxClientAppointmentOperation = js.native
}

