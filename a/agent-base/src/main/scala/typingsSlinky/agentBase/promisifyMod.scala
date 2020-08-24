package typingsSlinky.agentBase

import typingsSlinky.agentBase.mod.AgentCallbackCallback
import typingsSlinky.agentBase.mod.AgentCallbackPromise
import typingsSlinky.agentBase.mod.ClientRequest
import typingsSlinky.agentBase.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agent-base/dist/src/promisify", JSImport.Namespace)
@js.native
object promisifyMod extends js.Object {
  def default(fn: LegacyCallback): AgentCallbackPromise = js.native
  type LegacyCallback = js.Function3[
    /* req */ ClientRequest, 
    /* opts */ RequestOptions, 
    /* fn */ AgentCallbackCallback, 
    Unit
  ]
}

