package typingsSlinky.kuromoji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViterbiLattice extends js.Object {
  def append(node: ViterbiNode): Unit = js.native
  def appendEos(): Unit = js.native
}

object ViterbiLattice {
  @scala.inline
  def apply(append: ViterbiNode => Unit, appendEos: () => Unit): ViterbiLattice = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), appendEos = js.Any.fromFunction0(appendEos))
    __obj.asInstanceOf[ViterbiLattice]
  }
  @scala.inline
  implicit class ViterbiLatticeOps[Self <: ViterbiLattice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppend(value: ViterbiNode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAppendEos(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendEos")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

