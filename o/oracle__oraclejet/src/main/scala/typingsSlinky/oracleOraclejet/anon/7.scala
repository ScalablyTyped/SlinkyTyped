package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojganttMod.ojGantt.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `7`[K2, D2] extends js.Object {
  def renderer(context: TooltipContext[K2, D2]): Insert | PreventDefault = js.native
}

object `7` {
  @scala.inline
  def apply[K2, D2](renderer: TooltipContext[K2, D2] => Insert | PreventDefault): `7`[K2, D2] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`7`[K2, D2]]
  }
  @scala.inline
  implicit class `7Ops`[Self[k2, d2] <: `7`[k2, d2], K2, D2] (val x: Self[K2, D2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K2, D2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K2, D2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K2, D2]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K2, D2]) with Other]
    @scala.inline
    def withRenderer(value: TooltipContext[K2, D2] => Insert | PreventDefault): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

