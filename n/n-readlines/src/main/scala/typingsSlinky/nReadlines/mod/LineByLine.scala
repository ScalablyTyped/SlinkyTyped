package typingsSlinky.nReadlines.mod

import typingsSlinky.nReadlines.nReadlinesBooleans.`false`
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineByLine extends js.Object {
  def close(): Unit = js.native
  def next(): Buffer | `false` = js.native
  def reset(): Unit = js.native
}

object LineByLine {
  @scala.inline
  def apply(close: () => Unit, next: () => Buffer | `false`, reset: () => Unit): LineByLine = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), next = js.Any.fromFunction0(next), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[LineByLine]
  }
  @scala.inline
  implicit class LineByLineOps[Self <: LineByLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNext(value: () => Buffer | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

