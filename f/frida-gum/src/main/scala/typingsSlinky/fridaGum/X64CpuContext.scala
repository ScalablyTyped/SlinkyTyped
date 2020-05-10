package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fridaGum.CpuContext because Already inherited */ @js.native
trait X64CpuContext extends PortableCpuContext {
  var r10: NativePointer = js.native
  var r11: NativePointer = js.native
  var r12: NativePointer = js.native
  var r13: NativePointer = js.native
  var r14: NativePointer = js.native
  var r15: NativePointer = js.native
  var r8: NativePointer = js.native
  var r9: NativePointer = js.native
  var rax: NativePointer = js.native
  var rbp: NativePointer = js.native
  var rbx: NativePointer = js.native
  var rcx: NativePointer = js.native
  var rdi: NativePointer = js.native
  var rdx: NativePointer = js.native
  var rip: NativePointer = js.native
  var rsi: NativePointer = js.native
  var rsp: NativePointer = js.native
}

object X64CpuContext {
  @scala.inline
  def apply(
    pc: NativePointer,
    r10: NativePointer,
    r11: NativePointer,
    r12: NativePointer,
    r13: NativePointer,
    r14: NativePointer,
    r15: NativePointer,
    r8: NativePointer,
    r9: NativePointer,
    rax: NativePointer,
    rbp: NativePointer,
    rbx: NativePointer,
    rcx: NativePointer,
    rdi: NativePointer,
    rdx: NativePointer,
    rip: NativePointer,
    rsi: NativePointer,
    rsp: NativePointer,
    sp: NativePointer
  ): X64CpuContext = {
    val __obj = js.Dynamic.literal(pc = pc.asInstanceOf[js.Any], r10 = r10.asInstanceOf[js.Any], r11 = r11.asInstanceOf[js.Any], r12 = r12.asInstanceOf[js.Any], r13 = r13.asInstanceOf[js.Any], r14 = r14.asInstanceOf[js.Any], r15 = r15.asInstanceOf[js.Any], r8 = r8.asInstanceOf[js.Any], r9 = r9.asInstanceOf[js.Any], rax = rax.asInstanceOf[js.Any], rbp = rbp.asInstanceOf[js.Any], rbx = rbx.asInstanceOf[js.Any], rcx = rcx.asInstanceOf[js.Any], rdi = rdi.asInstanceOf[js.Any], rdx = rdx.asInstanceOf[js.Any], rip = rip.asInstanceOf[js.Any], rsi = rsi.asInstanceOf[js.Any], rsp = rsp.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any])
    __obj.asInstanceOf[X64CpuContext]
  }
  @scala.inline
  implicit class X64CpuContextOps[Self <: X64CpuContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withR10(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r10")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR11(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r11")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR12(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r12")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR13(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r13")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR14(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r14")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR15(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r15")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR8(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR9(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r9")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRax(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRbp(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rbp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRbx(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rbx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRcx(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rcx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdi(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdx(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRip(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRsi(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rsi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRsp(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rsp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

