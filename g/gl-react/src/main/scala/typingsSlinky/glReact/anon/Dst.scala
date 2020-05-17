package typingsSlinky.glReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dst extends js.Object {
  def dst(): Unit = js.native
  def src(): Unit = js.native
}

object Dst {
  @scala.inline
  def apply(dst: () => Unit, src: () => Unit): Dst = {
    val __obj = js.Dynamic.literal(dst = js.Any.fromFunction0(dst), src = js.Any.fromFunction0(src))
    __obj.asInstanceOf[Dst]
  }
  @scala.inline
  implicit class DstOps[Self <: Dst] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDst(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dst")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSrc(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

