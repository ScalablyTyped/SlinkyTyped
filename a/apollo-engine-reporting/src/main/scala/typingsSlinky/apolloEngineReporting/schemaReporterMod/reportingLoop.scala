package typingsSlinky.apolloEngineReporting.schemaReporterMod

import typingsSlinky.apolloServerTypes.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-engine-reporting/dist/schemaReporter", "reportingLoop")
@js.native
object reportingLoop extends js.Object {
  
  def apply(
    schemaReporter: SchemaReporter,
    logger: Logger,
    sendNextWithExecutableSchema: Boolean,
    fallbackReportingDelayInMs: Double
  ): Unit = js.native
}
