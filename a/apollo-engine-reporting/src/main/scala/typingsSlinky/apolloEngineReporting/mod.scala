package typingsSlinky.apolloEngineReporting

import typingsSlinky.apolloEngineReporting.agentMod.EngineReportingOptions
import typingsSlinky.apolloEngineReporting.apolloEngineReportingStrings.rewriteError
import typingsSlinky.apolloServerPluginBase.mod.ApolloServerPlugin
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class EngineReportingAgent[TContext] ()
    extends typingsSlinky.apolloEngineReporting.agentMod.EngineReportingAgent[TContext] {
    def this(options: EngineReportingOptions[TContext]) = this()
  }
  
  def federatedPlugin[TContext](): ApolloServerPlugin[TContext] = js.native
  @JSName("federatedPlugin")
  def federatedPlugin_rewriteError[TContext](options: Pick[EngineReportingOptions[TContext], rewriteError]): ApolloServerPlugin[TContext] = js.native
}

