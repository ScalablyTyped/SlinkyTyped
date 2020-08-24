package typingsSlinky.apolloEngineReporting.federatedPluginMod

import typingsSlinky.apolloEngineReporting.agentMod.EngineReportingOptions
import typingsSlinky.apolloEngineReporting.apolloEngineReportingStrings.rewriteError
import typingsSlinky.apolloServerPluginBase.mod.ApolloServerPlugin
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting/dist/federatedPlugin", JSImport.Default)
@js.native
object default_rewriteError extends js.Object {
  def apply[TContext](options: Pick[EngineReportingOptions[TContext], rewriteError]): ApolloServerPlugin[TContext] = js.native
}

