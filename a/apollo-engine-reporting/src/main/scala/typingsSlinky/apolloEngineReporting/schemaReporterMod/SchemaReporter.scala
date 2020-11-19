package typingsSlinky.apolloEngineReporting.schemaReporterMod

import typingsSlinky.apolloEngineReporting.reportingOperationTypesMod.EdgeServerInfo
import typingsSlinky.apolloServerTypes.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-engine-reporting/dist/schemaReporter", "SchemaReporter")
@js.native
class SchemaReporter protected () extends js.Object {
  def this(
    serverInfo: EdgeServerInfo,
    schemaSdl: String,
    apiKey: String,
    schemaReportingEndpoint: js.UndefOr[scala.Nothing],
    logger: Logger
  ) = this()
  def this(
    serverInfo: EdgeServerInfo,
    schemaSdl: String,
    apiKey: String,
    schemaReportingEndpoint: String,
    logger: Logger
  ) = this()
  
  val executableSchemaDocument: js.Any = js.native
  
  var graphManagerQuery: js.Any = js.native
  
  val headers: js.Any = js.native
  
  var isStopped: js.Any = js.native
  
  val logger: js.Any = js.native
  
  def reportServerInfo(withExecutableSchema: Boolean): js.Promise[ReportInfoResult] = js.native
  
  val serverInfo: js.Any = js.native
  
  def stop(): Unit = js.native
  
  def stopped(): Boolean = js.native
  
  val url: js.Any = js.native
}
