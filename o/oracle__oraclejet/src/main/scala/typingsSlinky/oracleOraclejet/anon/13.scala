package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojnboxMod.ojNBox.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `13`[K] extends js.Object {
  var renderer: (js.Function1[/* context */ TooltipContext[K], Insert | PreventDefault]) | Null = js.native
}

object `13` {
  @scala.inline
  def apply[K](): `13`[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`13`[K]]
  }
  @scala.inline
  implicit class `13Ops`[Self[k] <: `13`[k], K] (val x: Self[K]) extends AnyVal {
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

