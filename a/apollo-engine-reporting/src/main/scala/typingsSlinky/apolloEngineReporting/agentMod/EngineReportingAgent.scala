package typingsSlinky.apolloEngineReporting.agentMod

import typingsSlinky.apolloEngineReporting.anon.ExecutableSchema
import typingsSlinky.apolloServerPluginBase.mod.ApolloServerPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-engine-reporting/dist/agent", "EngineReportingAgent")
@js.native
class EngineReportingAgent[TContext] () extends js.Object {
  def this(options: EngineReportingOptions[TContext]) = this()
  
  def addTrace(hasTraceQueryHashDocumentOperationNameSourceExecutableSchemaIdLogger: AddTraceArgs): js.Promise[Unit] = js.native
  
  val apiKey: js.Any = js.native
  
  val bootId: js.Any = js.native
  
  var currentSchemaReporter: js.Any = js.native
  
  var executableSchemaIdGenerator: js.Any = js.native
  
  var getReportData: js.Any = js.native
  
  var getTraceSignature: js.Any = js.native
  
  val graphVariant: js.Any = js.native
  
  var lastSeenExecutableSchemaToId: js.Any = js.native
  
  val logger: js.Any = js.native
  
  def newPlugin(): ApolloServerPlugin[TContext] = js.native
  
  val options: js.Any = js.native
  
  val reportDataByExecutableSchemaId: js.Any = js.native
  
  var reportTimer: js.Any = js.native
  
  val schemaReport: Boolean = js.native
  
  def sendAllReports(): js.Promise[Unit] = js.native
  
  var sendAllReportsAndReportErrors: js.Any = js.native
  
  def sendReport(executableSchemaId: String): js.Promise[Unit] = js.native
  
  var sendReportAndReportErrors: js.Any = js.native
  
  val sendReportsImmediately: js.Any = js.native
  
  var signalHandlers: js.Any = js.native
  
  var signatureCache: js.Any = js.native
  
  def startSchemaReporting(hasExecutableSchemaIdExecutableSchema: ExecutableSchema): Unit = js.native
  
  def stop(): Unit = js.native
  
  var stopped: js.Any = js.native
  
  val tracesEndpointUrl: js.Any = js.native
}
