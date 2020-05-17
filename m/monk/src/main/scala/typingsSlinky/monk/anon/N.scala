package typingsSlinky.monk.anon

import typingsSlinky.monk.monkNumbers.`0`
import typingsSlinky.monk.monkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait N extends js.Object {
  var n: Double = js.native
  var ok: `1` | `0` = js.native
}

object N {
  @scala.inline
  def apply(n: Double, ok: `1` | `0`): N = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[N]
  }
  @scala.inline
  implicit class NOps[Self <: N] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOk(value: `1` | `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

