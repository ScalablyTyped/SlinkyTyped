package typingsSlinky.canvaskitWasm.anon

import typingsSlinky.canvaskitWasm.mod.SkStrokeJoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkStrokeJoin, {  Bevel  :canvaskit-wasm.canvaskit-wasm.SkStrokeJoin,   Miter  :canvaskit-wasm.canvaskit-wasm.SkStrokeJoin,   Round  :canvaskit-wasm.canvaskit-wasm.SkStrokeJoin}> */
@js.native
trait SkEnumSkStrokeJoinBevelSk extends js.Object {
  val Bevel: SkStrokeJoin = js.native
  val Miter: SkStrokeJoin = js.native
  val Round: SkStrokeJoin = js.native
  val values: js.Array[SkStrokeJoin] = js.native
}

object SkEnumSkStrokeJoinBevelSk {
  @scala.inline
  def apply(Bevel: SkStrokeJoin, Miter: SkStrokeJoin, Round: SkStrokeJoin, values: js.Array[SkStrokeJoin]): SkEnumSkStrokeJoinBevelSk = {
    val __obj = js.Dynamic.literal(Bevel = Bevel.asInstanceOf[js.Any], Miter = Miter.asInstanceOf[js.Any], Round = Round.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkStrokeJoinBevelSk]
  }
  @scala.inline
  implicit class SkEnumSkStrokeJoinBevelSkOps[Self <: SkEnumSkStrokeJoinBevelSk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBevel(value: SkStrokeJoin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiter(value: SkStrokeJoin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Miter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRound(value: SkStrokeJoin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Round")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[SkStrokeJoin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

