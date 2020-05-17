package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Broadcast extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val AttendeeUrl: String = js.native
  val IsBroadcasting: Boolean = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Broadcast_typekey")
  var PowerPointDotBroadcast_typekey: Broadcast = js.native
  def End(): Unit = js.native
  def Start(serverUrl: String): Unit = js.native
}

object Broadcast {
  @scala.inline
  def apply(
    Application: Application,
    AttendeeUrl: String,
    End: () => Unit,
    IsBroadcasting: Boolean,
    Parent: js.Any,
    PowerPointDotBroadcast_typekey: Broadcast,
    Start: String => Unit
  ): Broadcast = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AttendeeUrl = AttendeeUrl.asInstanceOf[js.Any], End = js.Any.fromFunction0(End), IsBroadcasting = IsBroadcasting.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Start = js.Any.fromFunction1(Start))
    __obj.updateDynamic("PowerPoint.Broadcast_typekey")(PowerPointDotBroadcast_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Broadcast]
  }
  @scala.inline
  implicit class BroadcastOps[Self <: Broadcast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttendeeUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttendeeUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("End")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsBroadcasting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsBroadcasting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotBroadcast_typekey(value: Broadcast): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.Broadcast_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Start")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

