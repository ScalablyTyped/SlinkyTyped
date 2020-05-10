package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojdiagramMod.ojDiagram.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon5[K1, K2, D1, D2] extends js.Object {
  def renderer(context: TooltipContext[K1, K2, D1, D2]): AnonInsert | AnonPreventDefault = js.native
}

object Anon5 {
  @scala.inline
  def apply[K1, K2, D1, D2](renderer: TooltipContext[K1, K2, D1, D2] => AnonInsert | AnonPreventDefault): Anon5[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[Anon5[K1, K2, D1, D2]]
  }
  @scala.inline
  implicit class Anon5Ops[Self[k1, k2, d1, d2] <: Anon5[k1, k2, d1, d2], K1, K2, D1, D2] (val x: Self[K1, K2, D1, D2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K1, K2, D1, D2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K1, K2, D1, D2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K1, K2, D1, D2]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K1, K2, D1, D2]) with Other]
    @scala.inline
    def withRenderer(value: TooltipContext[K1, K2, D1, D2] => AnonInsert | AnonPreventDefault): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

