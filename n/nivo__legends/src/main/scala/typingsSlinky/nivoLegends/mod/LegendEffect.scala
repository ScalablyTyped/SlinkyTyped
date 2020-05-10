package typingsSlinky.nivoLegends.mod

import typingsSlinky.nivoLegends.PartialitemTextColorstrin
import typingsSlinky.nivoLegends.nivoLegendsStrings.hover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendEffect extends js.Object {
  var on: hover = js.native
  var style: PartialitemTextColorstrin = js.native
}

object LegendEffect {
  @scala.inline
  def apply(on: hover, style: PartialitemTextColorstrin): LegendEffect = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendEffect]
  }
  @scala.inline
  implicit class LegendEffectOps[Self <: LegendEffect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOn(value: hover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: PartialitemTextColorstrin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

