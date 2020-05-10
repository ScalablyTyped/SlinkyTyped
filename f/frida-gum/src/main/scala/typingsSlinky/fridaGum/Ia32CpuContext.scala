package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fridaGum.CpuContext because Already inherited */ @js.native
trait Ia32CpuContext extends PortableCpuContext {
  var eax: NativePointer = js.native
  var ebp: NativePointer = js.native
  var ebx: NativePointer = js.native
  var ecx: NativePointer = js.native
  var edi: NativePointer = js.native
  var edx: NativePointer = js.native
  var eip: NativePointer = js.native
  var esi: NativePointer = js.native
  var esp: NativePointer = js.native
}

object Ia32CpuContext {
  @scala.inline
  def apply(
    eax: NativePointer,
    ebp: NativePointer,
    ebx: NativePointer,
    ecx: NativePointer,
    edi: NativePointer,
    edx: NativePointer,
    eip: NativePointer,
    esi: NativePointer,
    esp: NativePointer,
    pc: NativePointer,
    sp: NativePointer
  ): Ia32CpuContext = {
    val __obj = js.Dynamic.literal(eax = eax.asInstanceOf[js.Any], ebp = ebp.asInstanceOf[js.Any], ebx = ebx.asInstanceOf[js.Any], ecx = ecx.asInstanceOf[js.Any], edi = edi.asInstanceOf[js.Any], edx = edx.asInstanceOf[js.Any], eip = eip.asInstanceOf[js.Any], esi = esi.asInstanceOf[js.Any], esp = esp.asInstanceOf[js.Any], pc = pc.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ia32CpuContext]
  }
  @scala.inline
  implicit class Ia32CpuContextOps[Self <: Ia32CpuContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEax(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEbp(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEbx(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEcx(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdi(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdx(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEip(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEsi(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEsp(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

