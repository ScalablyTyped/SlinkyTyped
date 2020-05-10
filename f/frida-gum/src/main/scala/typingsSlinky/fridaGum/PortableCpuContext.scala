package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortableCpuContext extends CpuContext {
  var pc: NativePointer = js.native
  var sp: NativePointer = js.native
}

object PortableCpuContext {
  @scala.inline
  def apply(pc: NativePointer, sp: NativePointer): PortableCpuContext = {
    val __obj = js.Dynamic.literal(pc = pc.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortableCpuContext]
  }
  @scala.inline
  implicit class PortableCpuContextOps[Self <: PortableCpuContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPc(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSp(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

