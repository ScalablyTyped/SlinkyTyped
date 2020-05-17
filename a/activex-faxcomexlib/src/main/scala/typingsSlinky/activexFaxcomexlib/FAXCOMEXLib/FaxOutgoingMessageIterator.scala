package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutgoingMessageIterator Class */
@js.native
trait FaxOutgoingMessageIterator extends js.Object {
  /** End of archive marker */
  val AtEOF: Boolean = js.native
  @JSName("FAXCOMEXLib.FaxOutgoingMessageIterator_typekey")
  var FAXCOMEXLibDotFaxOutgoingMessageIterator_typekey: FaxOutgoingMessageIterator = js.native
  /** Current message */
  val Message: IFaxOutgoingMessage = js.native
  /** Size of prefetch buffer */
  var PrefetchSize: Double = js.native
  /** Move to the first message */
  def MoveFirst(): Unit = js.native
  /** Move to the next message */
  def MoveNext(): Unit = js.native
}

object FaxOutgoingMessageIterator {
  @scala.inline
  def apply(
    AtEOF: Boolean,
    FAXCOMEXLibDotFaxOutgoingMessageIterator_typekey: FaxOutgoingMessageIterator,
    Message: IFaxOutgoingMessage,
    MoveFirst: () => Unit,
    MoveNext: () => Unit,
    PrefetchSize: Double
  ): FaxOutgoingMessageIterator = {
    val __obj = js.Dynamic.literal(AtEOF = AtEOF.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], MoveFirst = js.Any.fromFunction0(MoveFirst), MoveNext = js.Any.fromFunction0(MoveNext), PrefetchSize = PrefetchSize.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxOutgoingMessageIterator_typekey")(FAXCOMEXLibDotFaxOutgoingMessageIterator_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxOutgoingMessageIterator]
  }
  @scala.inline
  implicit class FaxOutgoingMessageIteratorOps[Self <: FaxOutgoingMessageIterator] (val x: Self) extends AnyVal {
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
    def withFAXCOMEXLibDotFaxOutgoingMessageIterator_typekey(value: FaxOutgoingMessageIterator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxOutgoingMessageIterator_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: IFaxOutgoingMessage): Self = {
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

