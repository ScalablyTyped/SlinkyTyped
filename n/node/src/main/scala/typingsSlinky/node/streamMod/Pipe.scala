package typingsSlinky.node.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pipe extends js.Object {
  def close(): Unit = js.native
  def hasRef(): Boolean = js.native
  def ref(): Unit = js.native
  def unref(): Unit = js.native
}

object Pipe {
  @scala.inline
  def apply(close: () => Unit, hasRef: () => Boolean, ref: () => Unit, unref: () => Unit): Pipe = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), hasRef = js.Any.fromFunction0(hasRef), ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
    __obj.asInstanceOf[Pipe]
  }
  @scala.inline
  implicit class PipeOps[Self <: Pipe] (val x: Self) extends AnyVal {
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
    def withHasRef(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRef")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRef(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnref(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unref")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

