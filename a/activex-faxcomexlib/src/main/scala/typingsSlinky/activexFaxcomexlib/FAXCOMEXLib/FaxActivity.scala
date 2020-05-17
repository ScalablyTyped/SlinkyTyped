package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxActivity Class */
@js.native
trait FaxActivity extends js.Object {
  @JSName("FAXCOMEXLib.FaxActivity_typekey")
  var FAXCOMEXLibDotFaxActivity_typekey: FaxActivity = js.native
  /** Number of incoming messages */
  val IncomingMessages: Double = js.native
  /** Number of outgoing messages */
  val OutgoingMessages: Double = js.native
  /** Number of queued messages */
  val QueuedMessages: Double = js.native
  /** Number of routed incoming messages */
  val RoutingMessages: Double = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
}

object FaxActivity {
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxActivity_typekey: FaxActivity,
    IncomingMessages: Double,
    OutgoingMessages: Double,
    QueuedMessages: Double,
    Refresh: () => Unit,
    RoutingMessages: Double
  ): FaxActivity = {
    val __obj = js.Dynamic.literal(IncomingMessages = IncomingMessages.asInstanceOf[js.Any], OutgoingMessages = OutgoingMessages.asInstanceOf[js.Any], QueuedMessages = QueuedMessages.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), RoutingMessages = RoutingMessages.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxActivity_typekey")(FAXCOMEXLibDotFaxActivity_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxActivity]
  }
  @scala.inline
  implicit class FaxActivityOps[Self <: FaxActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFAXCOMEXLibDotFaxActivity_typekey(value: FaxActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxActivity_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncomingMessages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncomingMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutgoingMessages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutgoingMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueuedMessages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueuedMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Refresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRoutingMessages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoutingMessages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

