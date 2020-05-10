package typingsSlinky.canvaskitWasm

import typingsSlinky.canvaskitWasm.mod.SkAlphaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkAlphaType, {  Opaque  :canvaskit-wasm.canvaskit-wasm.SkAlphaType,   Premul  :canvaskit-wasm.canvaskit-wasm.SkAlphaType,   Unpremul  :canvaskit-wasm.canvaskit-wasm.SkAlphaType}> */
@js.native
trait SkEnumSkAlphaTypeOpaqueSk extends js.Object {
  val Opaque: SkAlphaType = js.native
  val Premul: SkAlphaType = js.native
  val Unpremul: SkAlphaType = js.native
  val values: js.Array[SkAlphaType] = js.native
}

object SkEnumSkAlphaTypeOpaqueSk {
  @scala.inline
  def apply(Opaque: SkAlphaType, Premul: SkAlphaType, Unpremul: SkAlphaType, values: js.Array[SkAlphaType]): SkEnumSkAlphaTypeOpaqueSk = {
    val __obj = js.Dynamic.literal(Opaque = Opaque.asInstanceOf[js.Any], Premul = Premul.asInstanceOf[js.Any], Unpremul = Unpremul.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkAlphaTypeOpaqueSk]
  }
  @scala.inline
  implicit class SkEnumSkAlphaTypeOpaqueSkOps[Self <: SkEnumSkAlphaTypeOpaqueSk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpaque(value: SkAlphaType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Opaque")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPremul(value: SkAlphaType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Premul")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnpremul(value: SkAlphaType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unpremul")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[SkAlphaType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

