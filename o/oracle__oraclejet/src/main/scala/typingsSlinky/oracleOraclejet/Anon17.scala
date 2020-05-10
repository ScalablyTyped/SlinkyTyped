package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojsunburstMod.ojSunburst.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon17[K, D] extends js.Object {
  def renderer(context: TooltipContext[K, D]): AnonInsert | AnonPreventDefault = js.native
}

object Anon17 {
  @scala.inline
  def apply[K, D](renderer: TooltipContext[K, D] => AnonInsert | AnonPreventDefault): Anon17[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[Anon17[K, D]]
  }
  @scala.inline
  implicit class Anon17Ops[Self[k, d] <: Anon17[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withRenderer(value: TooltipContext[K, D] => AnonInsert | AnonPreventDefault): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

