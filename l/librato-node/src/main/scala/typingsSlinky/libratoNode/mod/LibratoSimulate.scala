package typingsSlinky.libratoNode.mod

import typingsSlinky.libratoNode.libratoNodeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LibratoSimulate extends js.Object {
  var simulate: `true` = js.native
}

object LibratoSimulate {
  @scala.inline
  def apply(simulate: `true`): LibratoSimulate = {
    val __obj = js.Dynamic.literal(simulate = simulate.asInstanceOf[js.Any])
    __obj.asInstanceOf[LibratoSimulate]
  }
  @scala.inline
  implicit class LibratoSimulateOps[Self <: LibratoSimulate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSimulate(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

