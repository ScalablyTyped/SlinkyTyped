package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a client tooltip.
  */
@js.native
trait ASPxClientSchedulerToolTipData extends js.Object {
  /**
    * Returns the client appointment for which the tooltip is displayed.
    */
  def GetAppointment(): ASPxClientAppointment = js.native
  /**
    * Returns the client time interval for which the tooltip is displayed.
    */
  def GetInterval(): ASPxClientTimeInterval = js.native
  /**
    * Returns the resources associated with the appointment for which the tooltip is displayed.
    */
  def GetResources(): js.Array[String] = js.native
}

object ASPxClientSchedulerToolTipData {
  @scala.inline
  def apply(
    GetAppointment: () => ASPxClientAppointment,
    GetInterval: () => ASPxClientTimeInterval,
    GetResources: () => js.Array[String]
  ): ASPxClientSchedulerToolTipData = {
    val __obj = js.Dynamic.literal(GetAppointment = js.Any.fromFunction0(GetAppointment), GetInterval = js.Any.fromFunction0(GetInterval), GetResources = js.Any.fromFunction0(GetResources))
    __obj.asInstanceOf[ASPxClientSchedulerToolTipData]
  }
  @scala.inline
  implicit class ASPxClientSchedulerToolTipDataOps[Self <: ASPxClientSchedulerToolTipData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAppointment(value: () => ASPxClientAppointment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAppointment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInterval(value: () => ASPxClientTimeInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetInterval")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetResources(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetResources")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

