package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccountFolders Class */
@js.native
trait FaxAccountFolders extends js.Object {
  @JSName("FAXCOMEXLib.FaxAccountFolders_typekey")
  var FAXCOMEXLibDotFaxAccountFolders_typekey: FaxAccountFolders = js.native
  /** Incoming archive */
  val IncomingArchive: FaxAccountIncomingArchive = js.native
  /** Incoming queue */
  val IncomingQueue: FaxAccountIncomingQueue = js.native
  /** Outgoing archive */
  val OutgoingArchive: FaxAccountOutgoingArchive = js.native
  /** Outgoing queue */
  val OutgoingQueue: FaxAccountOutgoingQueue = js.native
}

object FaxAccountFolders {
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxAccountFolders_typekey: FaxAccountFolders,
    IncomingArchive: FaxAccountIncomingArchive,
    IncomingQueue: FaxAccountIncomingQueue,
    OutgoingArchive: FaxAccountOutgoingArchive,
    OutgoingQueue: FaxAccountOutgoingQueue
  ): FaxAccountFolders = {
    val __obj = js.Dynamic.literal(IncomingArchive = IncomingArchive.asInstanceOf[js.Any], IncomingQueue = IncomingQueue.asInstanceOf[js.Any], OutgoingArchive = OutgoingArchive.asInstanceOf[js.Any], OutgoingQueue = OutgoingQueue.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxAccountFolders_typekey")(FAXCOMEXLibDotFaxAccountFolders_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxAccountFolders]
  }
  @scala.inline
  implicit class FaxAccountFoldersOps[Self <: FaxAccountFolders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFAXCOMEXLibDotFaxAccountFolders_typekey(value: FaxAccountFolders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxAccountFolders_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncomingArchive(value: FaxAccountIncomingArchive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncomingArchive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncomingQueue(value: FaxAccountIncomingQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncomingQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutgoingArchive(value: FaxAccountOutgoingArchive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutgoingArchive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutgoingQueue(value: FaxAccountOutgoingQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutgoingQueue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

