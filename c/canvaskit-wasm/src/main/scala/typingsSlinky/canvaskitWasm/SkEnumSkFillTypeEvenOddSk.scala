package typingsSlinky.canvaskitWasm

import typingsSlinky.canvaskitWasm.mod.SkFillType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkFillType, {  EvenOdd  :canvaskit-wasm.canvaskit-wasm.SkFillType,   InverseEvenOdd  :canvaskit-wasm.canvaskit-wasm.SkFillType,   InverseWinding  :canvaskit-wasm.canvaskit-wasm.SkFillType,   Winding  :canvaskit-wasm.canvaskit-wasm.SkFillType}> */
@js.native
trait SkEnumSkFillTypeEvenOddSk extends js.Object {
  val EvenOdd: SkFillType = js.native
  val InverseEvenOdd: SkFillType = js.native
  val InverseWinding: SkFillType = js.native
  val Winding: SkFillType = js.native
  val values: js.Array[SkFillType] = js.native
}

object SkEnumSkFillTypeEvenOddSk {
  @scala.inline
  def apply(
    EvenOdd: SkFillType,
    InverseEvenOdd: SkFillType,
    InverseWinding: SkFillType,
    Winding: SkFillType,
    values: js.Array[SkFillType]
  ): SkEnumSkFillTypeEvenOddSk = {
    val __obj = js.Dynamic.literal(EvenOdd = EvenOdd.asInstanceOf[js.Any], InverseEvenOdd = InverseEvenOdd.asInstanceOf[js.Any], InverseWinding = InverseWinding.asInstanceOf[js.Any], Winding = Winding.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkFillTypeEvenOddSk]
  }
  @scala.inline
  implicit class SkEnumSkFillTypeEvenOddSkOps[Self <: SkEnumSkFillTypeEvenOddSk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvenOdd(value: SkFillType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvenOdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInverseEvenOdd(value: SkFillType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InverseEvenOdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInverseWinding(value: SkFillType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InverseWinding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWinding(value: SkFillType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Winding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[SkFillType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

