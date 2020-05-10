package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArmWriterOptions extends js.Object {
  /**
    * Specifies the initial program counter, which is useful when
    * generating code to a scratch buffer. This is essential when using
    * `Memory.patchCode()` on iOS, which may provide you with a
    * temporary location that later gets mapped into memory at the
    * intended memory location.
    */
  var pc: js.UndefOr[NativePointer] = js.native
}

object ArmWriterOptions {
  @scala.inline
  def apply(): ArmWriterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArmWriterOptions]
  }
  @scala.inline
  implicit class ArmWriterOptionsOps[Self <: ArmWriterOptions] (val x: Self) extends AnyVal {
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
    def withoutPc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pc")(js.undefined)
        ret
    }
  }
  
}

