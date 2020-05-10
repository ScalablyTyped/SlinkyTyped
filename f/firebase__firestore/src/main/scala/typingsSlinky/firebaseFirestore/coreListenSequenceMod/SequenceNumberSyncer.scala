package typingsSlinky.firebaseFirestore.coreListenSequenceMod

import typingsSlinky.firebaseFirestore.coreTypesMod.ListenSequenceNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceNumberSyncer extends js.Object {
  var sequenceNumberHandler: (js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]) | Null = js.native
  def writeSequenceNumber(sequenceNumber: ListenSequenceNumber): Unit = js.native
}

object SequenceNumberSyncer {
  @scala.inline
  def apply(writeSequenceNumber: ListenSequenceNumber => Unit): SequenceNumberSyncer = {
    val __obj = js.Dynamic.literal(writeSequenceNumber = js.Any.fromFunction1(writeSequenceNumber))
    __obj.asInstanceOf[SequenceNumberSyncer]
  }
  @scala.inline
  implicit class SequenceNumberSyncerOps[Self <: SequenceNumberSyncer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWriteSequenceNumber(value: ListenSequenceNumber => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeSequenceNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSequenceNumberHandler(value: /* sequenceNumber */ ListenSequenceNumber => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceNumberHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSequenceNumberHandlerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceNumberHandler")(null)
        ret
    }
  }
  
}

