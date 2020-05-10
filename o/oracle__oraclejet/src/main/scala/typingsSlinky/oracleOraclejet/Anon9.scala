package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojgaugeMod.ojRatingGauge.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon9 extends js.Object {
  def renderer(context: TooltipContext): AnonInsert | AnonPreventDefault = js.native
}

object Anon9 {
  @scala.inline
  def apply(renderer: TooltipContext => AnonInsert | AnonPreventDefault): Anon9 = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[Anon9]
  }
  @scala.inline
  implicit class Anon9Ops[Self <: Anon9] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderer(value: TooltipContext => AnonInsert | AnonPreventDefault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

