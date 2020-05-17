package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojtagcloudMod.ojTagCloud.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `24`[K] extends js.Object {
  def renderer(context: TooltipContext[K]): Insert | PreventDefault = js.native
}

object `24` {
  @scala.inline
  def apply[K](renderer: TooltipContext[K] => Insert | PreventDefault): `24`[K] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`24`[K]]
  }
  @scala.inline
  implicit class `24Ops`[Self[k] <: `24`[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withRenderer(value: TooltipContext[K] => Insert | PreventDefault): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

