package typingsSlinky.ampMessage.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  def inspect(): String = js.native
  def pop(): js.UndefOr[Buffer] = js.native
  def push(items: Buffer*): Double = js.native
  def shift(): js.UndefOr[Buffer] = js.native
  def toBuffer(): Buffer = js.native
  def unshift(items: Buffer*): Double = js.native
}

object Message {
  @scala.inline
  def apply(
    inspect: () => String,
    pop: () => js.UndefOr[Buffer],
    push: /* repeated */ Buffer => Double,
    shift: () => js.UndefOr[Buffer],
    toBuffer: () => Buffer,
    unshift: /* repeated */ Buffer => Double
  ): Message = {
    val __obj = js.Dynamic.literal(inspect = js.Any.fromFunction0(inspect), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), shift = js.Any.fromFunction0(shift), toBuffer = js.Any.fromFunction0(toBuffer), unshift = js.Any.fromFunction1(unshift))
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInspect(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPop(value: () => js.UndefOr[Buffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPush(value: /* repeated */ Buffer => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShift(value: () => js.UndefOr[Buffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToBuffer(value: () => Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBuffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnshift(value: /* repeated */ Buffer => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unshift")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

