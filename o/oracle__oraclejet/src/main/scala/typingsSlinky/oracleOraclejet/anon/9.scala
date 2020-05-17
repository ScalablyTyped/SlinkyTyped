package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojgaugeMod.ojRatingGauge.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `9` extends js.Object {
  def renderer(context: TooltipContext): Insert | PreventDefault = js.native
}

object `9` {
  @scala.inline
  def apply(renderer: TooltipContext => Insert | PreventDefault): `9` = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`9`]
  }
  @scala.inline
  implicit class `9Ops`[Self <: `9`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderer(value: TooltipContext => Insert | PreventDefault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

