package typingsSlinky.algoliaTransporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def CallEnum: typingsSlinky.std.Record[java.lang.String, typingsSlinky.algoliaTransporter.mod.CallType] = typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("CallEnum").asInstanceOf[typingsSlinky.std.Record[java.lang.String, typingsSlinky.algoliaTransporter.mod.CallType]]
  
  type Headers = typingsSlinky.std.Record[java.lang.String, java.lang.String]
  
  type HostOptions = java.lang.String | typingsSlinky.algoliaTransporter.anon.Accept
  
  @scala.inline
  def HostStatusEnum: typingsSlinky.std.Record[java.lang.String, typingsSlinky.algoliaTransporter.mod.HostStatusType] = typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HostStatusEnum").asInstanceOf[typingsSlinky.std.Record[java.lang.String, typingsSlinky.algoliaTransporter.mod.HostStatusType]]
  
  type QueryParameters = typingsSlinky.std.Record[java.lang.String, java.lang.String]
  
  @scala.inline
  def createApiError(
    message: java.lang.String,
    status: scala.Double,
    transporterStackTrace: js.Array[typingsSlinky.algoliaTransporter.mod.StackFrame]
  ): typingsSlinky.algoliaTransporter.mod.ApiError = (typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createApiError")(message.asInstanceOf[js.Any], status.asInstanceOf[js.Any], transporterStackTrace.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.algoliaTransporter.mod.ApiError]
  
  @scala.inline
  def createDeserializationError(message: java.lang.String, response: typingsSlinky.algoliaRequesterCommon.mod.Response): typingsSlinky.algoliaTransporter.mod.DeserializationError = (typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createDeserializationError")(message.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.algoliaTransporter.mod.DeserializationError]
  
  @scala.inline
  def createMappedRequestOptions(): typingsSlinky.algoliaTransporter.mod.MappedRequestOptions = typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMappedRequestOptions")().asInstanceOf[typingsSlinky.algoliaTransporter.mod.MappedRequestOptions]
  @scala.inline
  def createMappedRequestOptions(requestOptions: js.UndefOr[scala.Nothing], timeout: scala.Double): typingsSlinky.algoliaTransporter.mod.MappedRequestOptions = (typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMappedRequestOptions")(requestOptions.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.algoliaTransporter.mod.MappedRequestOptions]
  @scala.inline
  def createMappedRequestOptions(requestOptions: typingsSlinky.algoliaTransporter.mod.RequestOptions): typingsSlinky.algoliaTransporter.mod.MappedRequestOptions = typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMappedRequestOptions")(requestOptions.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.algoliaTransporter.mod.MappedRequestOptions]
  @scala.inline
  def createMappedRequestOptions(requestOptions: typingsSlinky.algoliaTransporter.mod.RequestOptions, timeout: scala.Double): typingsSlinky.algoliaTransporter.mod.MappedRequestOptions = (typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMappedRequestOptions")(requestOptions.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.algoliaTransporter.mod.MappedRequestOptions]
  
  @scala.inline
  def createRetryError(transporterStackTrace: js.Array[typingsSlinky.algoliaTransporter.mod.StackFrame]): typingsSlinky.algoliaTransporter.mod.RetryError = typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createRetryError")(transporterStackTrace.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.algoliaTransporter.mod.RetryError]
  
  @scala.inline
  def createStatefulHost(host: typingsSlinky.algoliaTransporter.mod.StatelessHost): typingsSlinky.algoliaTransporter.mod.StatefulHost = typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createStatefulHost")(host.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.algoliaTransporter.mod.StatefulHost]
  @scala.inline
  def createStatefulHost(
    host: typingsSlinky.algoliaTransporter.mod.StatelessHost,
    status: typingsSlinky.algoliaTransporter.mod.HostStatusType
  ): typingsSlinky.algoliaTransporter.mod.StatefulHost = (typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createStatefulHost")(host.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.algoliaTransporter.mod.StatefulHost]
  
  @scala.inline
  def createStatelessHost(options: typingsSlinky.algoliaTransporter.mod.HostOptions): typingsSlinky.algoliaTransporter.mod.StatelessHost = typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createStatelessHost")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.algoliaTransporter.mod.StatelessHost]
  
  @scala.inline
  def createTransporter(options: typingsSlinky.algoliaTransporter.mod.TransporterOptions): typingsSlinky.algoliaTransporter.mod.Transporter = typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTransporter")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.algoliaTransporter.mod.Transporter]
  
  @scala.inline
  def createUserAgent(version: java.lang.String): typingsSlinky.algoliaTransporter.mod.UserAgent = typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createUserAgent")(version.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.algoliaTransporter.mod.UserAgent]
  
  @scala.inline
  def deserializeFailure(
    hasContentStatus: typingsSlinky.algoliaRequesterCommon.mod.Response,
    stackFrame: js.Array[typingsSlinky.algoliaTransporter.mod.StackFrame]
  ): js.Error = (typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deserializeFailure")(hasContentStatus.asInstanceOf[js.Any], stackFrame.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  @scala.inline
  def deserializeSuccess[TObject](response: typingsSlinky.algoliaRequesterCommon.mod.Response): TObject = typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deserializeSuccess")(response.asInstanceOf[js.Any]).asInstanceOf[TObject]
  
  @scala.inline
  def isStatefulHostTimeouted(host: typingsSlinky.algoliaTransporter.mod.StatefulHost): scala.Boolean = typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isStatefulHostTimeouted")(host.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isStatefulHostUp(host: typingsSlinky.algoliaTransporter.mod.StatefulHost): scala.Boolean = typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isStatefulHostUp")(host.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def serializeData(
    request: typingsSlinky.algoliaTransporter.mod.Request,
    requestOptions: typingsSlinky.algoliaTransporter.mod.RequestOptions
  ): js.UndefOr[java.lang.String] = (typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("serializeData")(request.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
  
  @scala.inline
  def serializeHeaders(
    transporter: typingsSlinky.algoliaTransporter.mod.Transporter,
    requestOptions: typingsSlinky.algoliaTransporter.mod.RequestOptions
  ): typingsSlinky.algoliaTransporter.mod.Headers = (typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("serializeHeaders")(transporter.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.algoliaTransporter.mod.Headers]
  
  @scala.inline
  def serializeQueryParameters(parameters: typingsSlinky.std.Record[java.lang.String, _]): java.lang.String = typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("serializeQueryParameters")(parameters.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def serializeUrl(
    host: typingsSlinky.algoliaTransporter.mod.StatelessHost,
    path: java.lang.String,
    queryParameters: typingsSlinky.std.Record[java.lang.String, java.lang.String]
  ): java.lang.String = (typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("serializeUrl")(host.asInstanceOf[js.Any], path.asInstanceOf[js.Any], queryParameters.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def stackFrameWithoutCredentials(stackFrame: typingsSlinky.algoliaTransporter.mod.StackFrame): typingsSlinky.algoliaTransporter.mod.StackFrame = typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stackFrameWithoutCredentials")(stackFrame.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.algoliaTransporter.mod.StackFrame]
  
  @scala.inline
  def stackTraceWithoutCredentials(stackTrace: js.Array[typingsSlinky.algoliaTransporter.mod.StackFrame]): js.Array[typingsSlinky.algoliaTransporter.mod.StackFrame] = typingsSlinky.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stackTraceWithoutCredentials")(stackTrace.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.algoliaTransporter.mod.StackFrame]]
}
