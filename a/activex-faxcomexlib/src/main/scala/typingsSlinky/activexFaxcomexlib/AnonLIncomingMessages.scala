package typingsSlinky.activexFaxcomexlib

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLIncomingMessages extends js.Object {
  val lIncomingMessages: Double = js.native
  val lOutgoingMessages: Double = js.native
  val lQueuedMessages: Double = js.native
  val lRoutingMessages: Double = js.native
  val pFaxServer: FaxServer = js.native
}

object AnonLIncomingMessages {
  @scala.inline
  def apply(
    lIncomingMessages: Double,
    lOutgoingMessages: Double,
    lQueuedMessages: Double,
    lRoutingMessages: Double,
    pFaxServer: FaxServer
  ): AnonLIncomingMessages = {
    val __obj = js.Dynamic.literal(lIncomingMessages = lIncomingMessages.asInstanceOf[js.Any], lOutgoingMessages = lOutgoingMessages.asInstanceOf[js.Any], lQueuedMessages = lQueuedMessages.asInstanceOf[js.Any], lRoutingMessages = lRoutingMessages.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLIncomingMessages]
  }
  @scala.inline
  implicit class AnonLIncomingMessagesOps[Self <: AnonLIncomingMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLIncomingMessages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lIncomingMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLOutgoingMessages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lOutgoingMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLQueuedMessages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lQueuedMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLRoutingMessages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lRoutingMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPFaxServer(value: FaxServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pFaxServer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

