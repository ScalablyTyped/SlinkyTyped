package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojgaugeMod.ojLedGauge.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `8` extends js.Object {
  def renderer(context: TooltipContext): Insert | PreventDefault = js.native
}

object `8` {
  @scala.inline
  def apply(renderer: TooltipContext => Insert | PreventDefault): `8` = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`8`]
  }
  @scala.inline
  implicit class `8Ops`[Self <: `8`] (val x: Self) extends AnyVal {
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

