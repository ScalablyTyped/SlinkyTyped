package typingsSlinky.apolloDashEngineDashReporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distAgentMod {
  import typingsSlinky.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLRequestContext

  type GenerateClientInfo[TContext] = js.Function1[/* requestContext */ GraphQLRequestContext[TContext], ClientInfo]
}
