package typingsSlinky.bip174.interfacesMod

import typingsSlinky.bip174.AnonInputCount
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  def addInput(objectArg: js.Any): Unit = js.native
  def addOutput(objectArg: js.Any): Unit = js.native
  def getInputOutputCounts(): AnonInputCount = js.native
  def toBuffer(): Buffer = js.native
}

object Transaction {
  @scala.inline
  def apply(
    addInput: js.Any => Unit,
    addOutput: js.Any => Unit,
    getInputOutputCounts: () => AnonInputCount,
    toBuffer: () => Buffer
  ): Transaction = {
    val __obj = js.Dynamic.literal(addInput = js.Any.fromFunction1(addInput), addOutput = js.Any.fromFunction1(addOutput), getInputOutputCounts = js.Any.fromFunction0(getInputOutputCounts), toBuffer = js.Any.fromFunction0(toBuffer))
    __obj.asInstanceOf[Transaction]
  }
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddInput(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddOutput(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOutput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetInputOutputCounts(value: () => AnonInputCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInputOutputCounts")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToBuffer(value: () => Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBuffer")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

