package typingsSlinky.apolloEngineReporting

import typingsSlinky.apolloEngineReporting.agentMod.AddTraceArgs
import typingsSlinky.apolloEngineReporting.agentMod.EngineReportingOptions
import typingsSlinky.apolloEngineReporting.agentMod.SendValuesBaseOptions
import typingsSlinky.apolloEngineReporting.agentMod.VariableValueOptions
import typingsSlinky.apolloEngineReporting.anon.ExecutableSchemaIdGenerator
import typingsSlinky.apolloEngineReportingProtobuf.mod.Trace.Details
import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.IHTTP
import typingsSlinky.apolloServerEnv.mod.Headers
import typingsSlinky.apolloServerPluginBase.mod.ApolloServerPlugin
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-engine-reporting/dist/plugin", JSImport.Namespace)
@js.native
object pluginMod extends js.Object {
  
  def makeHTTPRequestHeaders(http: IHTTP, headers: Headers): Unit = js.native
  def makeHTTPRequestHeaders(http: IHTTP, headers: Headers, sendHeaders: SendValuesBaseOptions): Unit = js.native
  
  def makeTraceDetails(variables: Record[String, _]): Details = js.native
  def makeTraceDetails(
    variables: Record[String, _],
    sendVariableValues: js.UndefOr[scala.Nothing],
    operationString: String
  ): Details = js.native
  def makeTraceDetails(variables: Record[String, _], sendVariableValues: VariableValueOptions): Details = js.native
  def makeTraceDetails(variables: Record[String, _], sendVariableValues: VariableValueOptions, operationString: String): Details = js.native
  
  def plugin[TContext](
    options: js.UndefOr[scala.Nothing],
    addTrace: js.Function1[/* args */ AddTraceArgs, js.Promise[Unit]],
    hasStartSchemaReportingExecutableSchemaIdGeneratorSchemaReport: ExecutableSchemaIdGenerator
  ): ApolloServerPlugin[TContext] = js.native
  def plugin[TContext](
    options: EngineReportingOptions[TContext],
    addTrace: js.Function1[/* args */ AddTraceArgs, js.Promise[Unit]],
    hasStartSchemaReportingExecutableSchemaIdGeneratorSchemaReport: ExecutableSchemaIdGenerator
  ): ApolloServerPlugin[TContext] = js.native
}
