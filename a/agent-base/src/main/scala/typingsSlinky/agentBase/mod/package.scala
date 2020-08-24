package typingsSlinky.agentBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AgentCallbackCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* socket */ js.UndefOr[typingsSlinky.agentBase.mod.AgentCallbackReturn], 
    scala.Unit
  ]
  type AgentCallbackPromise = js.Function2[
    /* req */ typingsSlinky.agentBase.mod.ClientRequest, 
    /* opts */ typingsSlinky.agentBase.mod.RequestOptions, 
    typingsSlinky.agentBase.mod.AgentCallbackReturn | js.Promise[typingsSlinky.agentBase.mod.AgentCallbackReturn]
  ]
  type AgentCallbackReturn = typingsSlinky.node.streamMod.Duplex | typingsSlinky.agentBase.mod.AgentLike
  type AgentLike = typingsSlinky.agentBase.anon.PickAgentaddRequest | typingsSlinky.node.httpMod.Agent
}
