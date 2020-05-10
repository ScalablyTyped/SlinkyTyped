package typingsSlinky.canvaskitWasm

import typingsSlinky.canvaskitWasm.mod.SkStrokeCap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkStrokeCap, {  Butt  :canvaskit-wasm.canvaskit-wasm.SkStrokeCap,   Round  :canvaskit-wasm.canvaskit-wasm.SkStrokeCap,   Square  :canvaskit-wasm.canvaskit-wasm.SkStrokeCap}> */
@js.native
trait SkEnumSkStrokeCapButtSkSt extends js.Object {
  val Butt: SkStrokeCap = js.native
  val Round: SkStrokeCap = js.native
  val Square: SkStrokeCap = js.native
  val values: js.Array[SkStrokeCap] = js.native
}

object SkEnumSkStrokeCapButtSkSt {
  @scala.inline
  def apply(Butt: SkStrokeCap, Round: SkStrokeCap, Square: SkStrokeCap, values: js.Array[SkStrokeCap]): SkEnumSkStrokeCapButtSkSt = {
    val __obj = js.Dynamic.literal(Butt = Butt.asInstanceOf[js.Any], Round = Round.asInstanceOf[js.Any], Square = Square.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkStrokeCapButtSkSt]
  }
  @scala.inline
  implicit class SkEnumSkStrokeCapButtSkStOps[Self <: SkEnumSkStrokeCapButtSkSt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButt(value: SkStrokeCap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Butt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRound(value: SkStrokeCap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Round")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSquare(value: SkStrokeCap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Square")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[SkStrokeCap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

