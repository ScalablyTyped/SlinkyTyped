package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxIncomingMessageIterator Class */
@js.native
trait FaxIncomingMessageIterator extends js.Object {
  /** End of archive marker */
  val AtEOF: Boolean = js.native
  @JSName("FAXCOMEXLib.FaxIncomingMessageIterator_typekey")
  var FAXCOMEXLibDotFaxIncomingMessageIterator_typekey: FaxIncomingMessageIterator = js.native
  /** The current message */
  val Message: IFaxIncomingMessage = js.native
  /** Size of the prefetch buffer */
  var PrefetchSize: Double = js.native
  /** Move to the first message in the archive */
  def MoveFirst(): Unit = js.native
  /** Move to the next message in the archive */
  def MoveNext(): Unit = js.native
}

object FaxIncomingMessageIterator {
  @scala.inline
  def apply(
    AtEOF: Boolean,
    FAXCOMEXLibDotFaxIncomingMessageIterator_typekey: FaxIncomingMessageIterator,
    Message: IFaxIncomingMessage,
    MoveFirst: () => Unit,
    MoveNext: () => Unit,
    PrefetchSize: Double
  ): FaxIncomingMessageIterator = {
    val __obj = js.Dynamic.literal(AtEOF = AtEOF.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], MoveFirst = js.Any.fromFunction0(MoveFirst), MoveNext = js.Any.fromFunction0(MoveNext), PrefetchSize = PrefetchSize.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxIncomingMessageIterator_typekey")(FAXCOMEXLibDotFaxIncomingMessageIterator_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxIncomingMessageIterator]
  }
  @scala.inline
  implicit class FaxIncomingMessageIteratorOps[Self <: FaxIncomingMessageIterator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtEOF(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AtEOF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFAXCOMEXLibDotFaxIncomingMessageIterator_typekey(value: FaxIncomingMessageIterator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxIncomingMessageIterator_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: IFaxIncomingMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveFirst(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoveFirst")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoveNext(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoveNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrefetchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrefetchSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

