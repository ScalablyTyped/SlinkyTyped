package typingsSlinky.apolloEngineReporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object agentMod {
  type GenerateClientInfo[TContext] = js.Function1[
    /* requestContext */ typingsSlinky.apolloServerTypes.mod.GraphQLRequestContext[TContext], 
    typingsSlinky.apolloEngineReporting.agentMod.ClientInfo
  ]
}
