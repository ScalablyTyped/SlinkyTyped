package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fridaGum.CpuContext because Already inherited */ @js.native
trait MipsCpuContext extends PortableCpuContext {
  var a0: NativePointer = js.native
  var a1: NativePointer = js.native
  var a2: NativePointer = js.native
  var a3: NativePointer = js.native
  var at: NativePointer = js.native
  var fp: NativePointer = js.native
  var gp: NativePointer = js.native
  var hi: NativePointer = js.native
  var k0: NativePointer = js.native
  var k1: NativePointer = js.native
  var lo: NativePointer = js.native
  var ra: NativePointer = js.native
  var s0: NativePointer = js.native
  var s1: NativePointer = js.native
  var s2: NativePointer = js.native
  var s3: NativePointer = js.native
  var s4: NativePointer = js.native
  var s5: NativePointer = js.native
  var s6: NativePointer = js.native
  var s7: NativePointer = js.native
  var t0: NativePointer = js.native
  var t1: NativePointer = js.native
  var t2: NativePointer = js.native
  var t3: NativePointer = js.native
  var t4: NativePointer = js.native
  var t5: NativePointer = js.native
  var t6: NativePointer = js.native
  var t7: NativePointer = js.native
  var t8: NativePointer = js.native
  var t9: NativePointer = js.native
  var v0: NativePointer = js.native
  var v1: NativePointer = js.native
}

object MipsCpuContext {
  @scala.inline
  def apply(
    a0: NativePointer,
    a1: NativePointer,
    a2: NativePointer,
    a3: NativePointer,
    at: NativePointer,
    fp: NativePointer,
    gp: NativePointer,
    hi: NativePointer,
    k0: NativePointer,
    k1: NativePointer,
    lo: NativePointer,
    pc: NativePointer,
    ra: NativePointer,
    s0: NativePointer,
    s1: NativePointer,
    s2: NativePointer,
    s3: NativePointer,
    s4: NativePointer,
    s5: NativePointer,
    s6: NativePointer,
    s7: NativePointer,
    sp: NativePointer,
    t0: NativePointer,
    t1: NativePointer,
    t2: NativePointer,
    t3: NativePointer,
    t4: NativePointer,
    t5: NativePointer,
    t6: NativePointer,
    t7: NativePointer,
    t8: NativePointer,
    t9: NativePointer,
    v0: NativePointer,
    v1: NativePointer
  ): MipsCpuContext = {
    val __obj = js.Dynamic.literal(a0 = a0.asInstanceOf[js.Any], a1 = a1.asInstanceOf[js.Any], a2 = a2.asInstanceOf[js.Any], a3 = a3.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], fp = fp.asInstanceOf[js.Any], gp = gp.asInstanceOf[js.Any], hi = hi.asInstanceOf[js.Any], k0 = k0.asInstanceOf[js.Any], k1 = k1.asInstanceOf[js.Any], lo = lo.asInstanceOf[js.Any], pc = pc.asInstanceOf[js.Any], ra = ra.asInstanceOf[js.Any], s0 = s0.asInstanceOf[js.Any], s1 = s1.asInstanceOf[js.Any], s2 = s2.asInstanceOf[js.Any], s3 = s3.asInstanceOf[js.Any], s4 = s4.asInstanceOf[js.Any], s5 = s5.asInstanceOf[js.Any], s6 = s6.asInstanceOf[js.Any], s7 = s7.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any], t0 = t0.asInstanceOf[js.Any], t1 = t1.asInstanceOf[js.Any], t2 = t2.asInstanceOf[js.Any], t3 = t3.asInstanceOf[js.Any], t4 = t4.asInstanceOf[js.Any], t5 = t5.asInstanceOf[js.Any], t6 = t6.asInstanceOf[js.Any], t7 = t7.asInstanceOf[js.Any], t8 = t8.asInstanceOf[js.Any], t9 = t9.asInstanceOf[js.Any], v0 = v0.asInstanceOf[js.Any], v1 = v1.asInstanceOf[js.Any])
    __obj.asInstanceOf[MipsCpuContext]
  }
  @scala.inline
  implicit class MipsCpuContextOps[Self <: MipsCpuContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA0(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withA1(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withA2(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withA3(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAt(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFp(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGp(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHi(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withK0(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withK1(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLo(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRa(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS0(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS1(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS2(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS4(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS5(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS6(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS7(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT0(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT1(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT2(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT3(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT4(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT5(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT6(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT7(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT8(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT9(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t9")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withV0(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withV1(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v1")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

