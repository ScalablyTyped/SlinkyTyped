package typingsSlinky.activexFaxcomexlib.anon

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BIncomingQueueBlocked extends js.Object {
  val bIncomingQueueBlocked: Boolean = js.native
  val bOutgoingQueueBlocked: Boolean = js.native
  val bOutgoingQueuePaused: Boolean = js.native
  val pFaxServer: FaxServer = js.native
}

object BIncomingQueueBlocked {
  @scala.inline
  def apply(
    bIncomingQueueBlocked: Boolean,
    bOutgoingQueueBlocked: Boolean,
    bOutgoingQueuePaused: Boolean,
    pFaxServer: FaxServer
  ): BIncomingQueueBlocked = {
    val __obj = js.Dynamic.literal(bIncomingQueueBlocked = bIncomingQueueBlocked.asInstanceOf[js.Any], bOutgoingQueueBlocked = bOutgoingQueueBlocked.asInstanceOf[js.Any], bOutgoingQueuePaused = bOutgoingQueuePaused.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BIncomingQueueBlocked]
  }
  @scala.inline
  implicit class BIncomingQueueBlockedOps[Self <: BIncomingQueueBlocked] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBIncomingQueueBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bIncomingQueueBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBOutgoingQueueBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bOutgoingQueueBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBOutgoingQueuePaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bOutgoingQueuePaused")(value.asInstanceOf[js.Any])
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

