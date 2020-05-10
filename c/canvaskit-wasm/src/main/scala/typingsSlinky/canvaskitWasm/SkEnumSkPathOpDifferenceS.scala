package typingsSlinky.canvaskitWasm

import typingsSlinky.canvaskitWasm.mod.SkPathOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkPathOp, {  Difference  :canvaskit-wasm.canvaskit-wasm.SkPathOp,   Intersect  :canvaskit-wasm.canvaskit-wasm.SkPathOp,   ReverseDifference  :canvaskit-wasm.canvaskit-wasm.SkPathOp,   Union  :canvaskit-wasm.canvaskit-wasm.SkPathOp,   XOR  :canvaskit-wasm.canvaskit-wasm.SkPathOp}> */
@js.native
trait SkEnumSkPathOpDifferenceS extends js.Object {
  val Difference: SkPathOp = js.native
  val Intersect: SkPathOp = js.native
  val ReverseDifference: SkPathOp = js.native
  val Union: SkPathOp = js.native
  val XOR: SkPathOp = js.native
  val values: js.Array[SkPathOp] = js.native
}

object SkEnumSkPathOpDifferenceS {
  @scala.inline
  def apply(
    Difference: SkPathOp,
    Intersect: SkPathOp,
    ReverseDifference: SkPathOp,
    Union: SkPathOp,
    XOR: SkPathOp,
    values: js.Array[SkPathOp]
  ): SkEnumSkPathOpDifferenceS = {
    val __obj = js.Dynamic.literal(Difference = Difference.asInstanceOf[js.Any], Intersect = Intersect.asInstanceOf[js.Any], ReverseDifference = ReverseDifference.asInstanceOf[js.Any], Union = Union.asInstanceOf[js.Any], XOR = XOR.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkPathOpDifferenceS]
  }
  @scala.inline
  implicit class SkEnumSkPathOpDifferenceSOps[Self <: SkEnumSkPathOpDifferenceS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDifference(value: SkPathOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Difference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntersect(value: SkPathOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Intersect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReverseDifference(value: SkPathOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReverseDifference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnion(value: SkPathOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Union")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXOR(value: SkPathOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[SkPathOp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

