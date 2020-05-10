package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fridaGum.CpuContext because Already inherited */ @js.native
trait Arm64CpuContext extends PortableCpuContext {
  var fp: NativePointer = js.native
  var lr: NativePointer = js.native
  var x0: NativePointer = js.native
  var x1: NativePointer = js.native
  var x10: NativePointer = js.native
  var x11: NativePointer = js.native
  var x12: NativePointer = js.native
  var x13: NativePointer = js.native
  var x14: NativePointer = js.native
  var x15: NativePointer = js.native
  var x16: NativePointer = js.native
  var x17: NativePointer = js.native
  var x18: NativePointer = js.native
  var x19: NativePointer = js.native
  var x2: NativePointer = js.native
  var x20: NativePointer = js.native
  var x21: NativePointer = js.native
  var x22: NativePointer = js.native
  var x23: NativePointer = js.native
  var x24: NativePointer = js.native
  var x25: NativePointer = js.native
  var x26: NativePointer = js.native
  var x27: NativePointer = js.native
  var x28: NativePointer = js.native
  var x3: NativePointer = js.native
  var x4: NativePointer = js.native
  var x5: NativePointer = js.native
  var x6: NativePointer = js.native
  var x7: NativePointer = js.native
  var x8: NativePointer = js.native
  var x9: NativePointer = js.native
}

object Arm64CpuContext {
  @scala.inline
  def apply(
    fp: NativePointer,
    lr: NativePointer,
    pc: NativePointer,
    sp: NativePointer,
    x0: NativePointer,
    x1: NativePointer,
    x10: NativePointer,
    x11: NativePointer,
    x12: NativePointer,
    x13: NativePointer,
    x14: NativePointer,
    x15: NativePointer,
    x16: NativePointer,
    x17: NativePointer,
    x18: NativePointer,
    x19: NativePointer,
    x2: NativePointer,
    x20: NativePointer,
    x21: NativePointer,
    x22: NativePointer,
    x23: NativePointer,
    x24: NativePointer,
    x25: NativePointer,
    x26: NativePointer,
    x27: NativePointer,
    x28: NativePointer,
    x3: NativePointer,
    x4: NativePointer,
    x5: NativePointer,
    x6: NativePointer,
    x7: NativePointer,
    x8: NativePointer,
    x9: NativePointer
  ): Arm64CpuContext = {
    val __obj = js.Dynamic.literal(fp = fp.asInstanceOf[js.Any], lr = lr.asInstanceOf[js.Any], pc = pc.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x10 = x10.asInstanceOf[js.Any], x11 = x11.asInstanceOf[js.Any], x12 = x12.asInstanceOf[js.Any], x13 = x13.asInstanceOf[js.Any], x14 = x14.asInstanceOf[js.Any], x15 = x15.asInstanceOf[js.Any], x16 = x16.asInstanceOf[js.Any], x17 = x17.asInstanceOf[js.Any], x18 = x18.asInstanceOf[js.Any], x19 = x19.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], x20 = x20.asInstanceOf[js.Any], x21 = x21.asInstanceOf[js.Any], x22 = x22.asInstanceOf[js.Any], x23 = x23.asInstanceOf[js.Any], x24 = x24.asInstanceOf[js.Any], x25 = x25.asInstanceOf[js.Any], x26 = x26.asInstanceOf[js.Any], x27 = x27.asInstanceOf[js.Any], x28 = x28.asInstanceOf[js.Any], x3 = x3.asInstanceOf[js.Any], x4 = x4.asInstanceOf[js.Any], x5 = x5.asInstanceOf[js.Any], x6 = x6.asInstanceOf[js.Any], x7 = x7.asInstanceOf[js.Any], x8 = x8.asInstanceOf[js.Any], x9 = x9.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64CpuContext]
  }
  @scala.inline
  implicit class Arm64CpuContextOps[Self <: Arm64CpuContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFp(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLr(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX0(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX1(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX10(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x10")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX11(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x11")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX12(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x12")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX13(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x13")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX14(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x14")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX15(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x15")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX16(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x16")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX17(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x17")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX18(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x18")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX19(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x19")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX2(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX20(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x20")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX21(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x21")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX22(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x22")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX23(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x23")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX24(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x24")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX25(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x25")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX26(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x26")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX27(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x27")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX28(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x28")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX3(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX4(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX5(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX6(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX7(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX8(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX9(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x9")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

