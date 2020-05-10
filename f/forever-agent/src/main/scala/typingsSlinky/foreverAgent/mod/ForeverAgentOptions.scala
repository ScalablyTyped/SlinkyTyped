package typingsSlinky.foreverAgent.mod

import typingsSlinky.node.httpMod.AgentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForeverAgentOptions extends AgentOptions {
  var minSockets: js.UndefOr[Double] = js.native
}

object ForeverAgentOptions {
  @scala.inline
  def apply(): ForeverAgentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForeverAgentOptions]
  }
  @scala.inline
  implicit class ForeverAgentOptionsOps[Self <: ForeverAgentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinSockets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSockets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSockets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSockets")(js.undefined)
        ret
    }
  }
  
}

