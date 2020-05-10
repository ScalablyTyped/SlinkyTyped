package typingsSlinky.readableStream.mod

import typingsSlinky.safeBuffer.mod.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferList[D /* <: Buffer */] extends js.Object {
  var head: Entry[D] = js.native
  var length: Double = js.native
  var tail: Entry[D] = js.native
  def clear(): Unit = js.native
  def concat(n: Double): D = js.native
  def join(s: js.Any): String = js.native
  def push(v: D): Unit = js.native
  def shift(): D = js.native
  def unshift(v: D): Unit = js.native
}

object BufferList {
  @scala.inline
  def apply[D](
    clear: () => Unit,
    concat: Double => D,
    head: Entry[D],
    join: js.Any => String,
    length: Double,
    push: D => Unit,
    shift: () => D,
    tail: Entry[D],
    unshift: D => Unit
  ): BufferList[D] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), concat = js.Any.fromFunction1(concat), head = head.asInstanceOf[js.Any], join = js.Any.fromFunction1(join), length = length.asInstanceOf[js.Any], push = js.Any.fromFunction1(push), shift = js.Any.fromFunction0(shift), tail = tail.asInstanceOf[js.Any], unshift = js.Any.fromFunction1(unshift))
    __obj.asInstanceOf[BufferList[D]]
  }
  @scala.inline
  implicit class BufferListOps[Self[d] <: BufferList[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withClear(value: () => Unit): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConcat(value: Double => D): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHead(value: Entry[D]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJoin(value: js.Any => String): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPush(value: D => Unit): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShift(value: () => D): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTail(value: Entry[D]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnshift(value: D => Unit): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unshift")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

