package typingsSlinky.octokitRest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Agent extends js.Object {
  var agent: js.UndefOr[typingsSlinky.node.httpMod.Agent] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Agent {
  @scala.inline
  def apply(agent: typingsSlinky.node.httpMod.Agent = null, timeout: js.UndefOr[Double] = js.undefined): Agent = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Agent]
  }
}

