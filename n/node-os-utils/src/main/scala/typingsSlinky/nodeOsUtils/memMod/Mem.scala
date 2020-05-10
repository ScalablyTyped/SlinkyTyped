package typingsSlinky.nodeOsUtils.memMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mem extends js.Object {
  def free(): js.Promise[MemFreeInfo] = js.native
  def info(): js.Promise[MemInfo] = js.native
  def totalMem(): Double = js.native
  def used(): js.Promise[MemUsedInfo] = js.native
}

object Mem {
  @scala.inline
  def apply(
    free: () => js.Promise[MemFreeInfo],
    info: () => js.Promise[MemInfo],
    totalMem: () => Double,
    used: () => js.Promise[MemUsedInfo]
  ): Mem = {
    val __obj = js.Dynamic.literal(free = js.Any.fromFunction0(free), info = js.Any.fromFunction0(info), totalMem = js.Any.fromFunction0(totalMem), used = js.Any.fromFunction0(used))
    __obj.asInstanceOf[Mem]
  }
  @scala.inline
  implicit class MemOps[Self <: Mem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFree(value: () => js.Promise[MemFreeInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("free")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInfo(value: () => js.Promise[MemInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTotalMem(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalMem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUsed(value: () => js.Promise[MemUsedInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("used")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

