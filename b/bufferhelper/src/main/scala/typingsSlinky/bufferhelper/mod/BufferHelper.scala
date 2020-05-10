package typingsSlinky.bufferhelper.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferHelper extends js.Object {
  def concat(buffer: js.Any): BufferHelper = js.native
  def empty(): BufferHelper = js.native
  def load(stream: js.Any, callback: js.Function1[/* arg */ js.Any, _]): Unit = js.native
  def toBuffer(): Buffer = js.native
  def toString(encoding: encoding): String = js.native
}

object BufferHelper {
  @scala.inline
  def apply(
    concat: js.Any => BufferHelper,
    empty: () => BufferHelper,
    load: (js.Any, js.Function1[/* arg */ js.Any, _]) => Unit,
    toBuffer: () => Buffer,
    toString: encoding => String
  ): BufferHelper = {
    val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat), empty = js.Any.fromFunction0(empty), load = js.Any.fromFunction2(load), toBuffer = js.Any.fromFunction0(toBuffer), toString = js.Any.fromFunction1(toString))
    __obj.asInstanceOf[BufferHelper]
  }
  @scala.inline
  implicit class BufferHelperOps[Self <: BufferHelper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcat(value: js.Any => BufferHelper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmpty(value: () => BufferHelper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoad(value: (js.Any, js.Function1[/* arg */ js.Any, _]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToBuffer(value: () => Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBuffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToString(value: encoding => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

