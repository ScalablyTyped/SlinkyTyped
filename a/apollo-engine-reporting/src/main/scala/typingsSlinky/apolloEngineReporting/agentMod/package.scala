package typingsSlinky.apolloEngineReporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object agentMod {
  type GenerateClientInfo[TContext] = js.Function1[
    /* requestContext */ typingsSlinky.apolloServerTypes.mod.GraphQLRequestContext[TContext], 
    typingsSlinky.apolloEngineReporting.agentMod.ClientInfo
  ]
  type ReportTimingOptions[TContext] = (js.Function1[
    /* request */ typingsSlinky.apolloServerTypes.mod.GraphQLRequestContextDidResolveOperation[TContext] | typingsSlinky.apolloServerTypes.mod.GraphQLRequestContextDidEncounterErrors[TContext], 
    js.Promise[scala.Boolean]
  ]) | scala.Boolean
}
