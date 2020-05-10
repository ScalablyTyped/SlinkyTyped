package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojnboxMod.ojNBox.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon13[K] extends js.Object {
  var renderer: (js.Function1[/* context */ TooltipContext[K], AnonInsert | AnonPreventDefault]) | Null = js.native
}

object Anon13 {
  @scala.inline
  def apply[K](): Anon13[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anon13[K]]
  }
  @scala.inline
  implicit class Anon13Ops[Self[k] <: Anon13[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withRenderer(value: /* context */ TooltipContext[K] => AnonInsert | AnonPreventDefault): Self[K] = {
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

