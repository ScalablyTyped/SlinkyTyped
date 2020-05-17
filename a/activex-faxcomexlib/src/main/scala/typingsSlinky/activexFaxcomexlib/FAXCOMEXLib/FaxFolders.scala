package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxFolders Class */
@js.native
trait FaxFolders extends js.Object {
  @JSName("FAXCOMEXLib.FaxFolders_typekey")
  var FAXCOMEXLibDotFaxFolders_typekey: FaxFolders = js.native
  /** Incoming archive */
  val IncomingArchive: FaxIncomingArchive = js.native
  /** Incoming queue */
  val IncomingQueue: FaxIncomingQueue = js.native
  /** Outgoing archive */
  val OutgoingArchive: FaxOutgoingArchive = js.native
  /** Outgoing queue */
  val OutgoingQueue: FaxOutgoingQueue = js.native
}

object FaxFolders {
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxFolders_typekey: FaxFolders,
    IncomingArchive: FaxIncomingArchive,
    IncomingQueue: FaxIncomingQueue,
    OutgoingArchive: FaxOutgoingArchive,
    OutgoingQueue: FaxOutgoingQueue
  ): FaxFolders = {
    val __obj = js.Dynamic.literal(IncomingArchive = IncomingArchive.asInstanceOf[js.Any], IncomingQueue = IncomingQueue.asInstanceOf[js.Any], OutgoingArchive = OutgoingArchive.asInstanceOf[js.Any], OutgoingQueue = OutgoingQueue.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxFolders_typekey")(FAXCOMEXLibDotFaxFolders_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxFolders]
  }
  @scala.inline
  implicit class FaxFoldersOps[Self <: FaxFolders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFAXCOMEXLibDotFaxFolders_typekey(value: FaxFolders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxFolders_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncomingArchive(value: FaxIncomingArchive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncomingArchive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncomingQueue(value: FaxIncomingQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncomingQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutgoingArchive(value: FaxOutgoingArchive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutgoingArchive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutgoingQueue(value: FaxOutgoingQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutgoingQueue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

