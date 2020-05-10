package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojthematicmapMod.ojThematicMap.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon25[K1, K2, K3, D1, D2, D3] extends js.Object {
  def renderer(context: TooltipContext[K1, K2, K3, D1, D2, D3]): AnonInsert | AnonPreventDefault = js.native
}

object Anon25 {
  @scala.inline
  def apply[K1, K2, K3, D1, D2, D3](renderer: TooltipContext[K1, K2, K3, D1, D2, D3] => AnonInsert | AnonPreventDefault): Anon25[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[Anon25[K1, K2, K3, D1, D2, D3]]
  }
  @scala.inline
  implicit class Anon25Ops[Self[k1, k2, k3, d1, d2, d3] <: Anon25[k1, k2, k3, d1, d2, d3], K1, K2, K3, D1, D2, D3] (val x: Self[K1, K2, K3, D1, D2, D3]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K1, K2, K3, D1, D2, D3] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K1, K2, K3, D1, D2, D3]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K1, K2, K3, D1, D2, D3]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K1, K2, K3, D1, D2, D3]) with Other]
    @scala.inline
    def withRenderer(value: TooltipContext[K1, K2, K3, D1, D2, D3] => AnonInsert | AnonPreventDefault): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

