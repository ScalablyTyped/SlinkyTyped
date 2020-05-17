package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojpictochartMod.ojPictoChart.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `14`[K] extends js.Object {
  var renderer: (js.Function1[/* context */ TooltipContext[K], Insert | PreventDefault]) | Null = js.native
}

object `14` {
  @scala.inline
  def apply[K](): `14`[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`14`[K]]
  }
  @scala.inline
  implicit class `14Ops`[Self[k] <: `14`[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withRenderer(value: /* context */ TooltipContext[K] => Insert | PreventDefault): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRendererNull: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(null)
        ret
    }
  }
  
}

