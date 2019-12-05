package typingsSlinky.apolloDashEngineDashReporting

import typingsSlinky.apolloDashEngineDashReporting.distAgentMod.EngineReportingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting", JSImport.Namespace)
@js.native
object apolloDashEngineDashReportingMod extends js.Object {
  @js.native
  class EngineFederatedTracingExtension[TContext] protected ()
    extends typingsSlinky.apolloDashEngineDashReporting.distFederatedExtensionMod.EngineFederatedTracingExtension[TContext] {
    def this(options: Anon_Err) = this()
  }
  
  @js.native
  class EngineReportingAgent[TContext] ()
    extends typingsSlinky.apolloDashEngineDashReporting.distAgentMod.EngineReportingAgent[TContext] {
    def this(options: EngineReportingOptions[TContext]) = this()
  }
  
}

