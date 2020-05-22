package typingsSlinky.grpcGrpcJs.clientMod

import typingsSlinky.grpcGrpcJs.callMod.ServiceError
import typingsSlinky.grpcGrpcJs.callMod.SurfaceCall
import typingsSlinky.grpcGrpcJs.channelMod.Channel
import typingsSlinky.grpcGrpcJs.makeClientMod.ClientMethodDefinition
import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallProperties[RequestType, ResponseType] extends js.Object {
  var argument: js.UndefOr[RequestType] = js.undefined
  var call: SurfaceCall
  var callOptions: CallOptions
  var callback: js.UndefOr[UnaryCallback[ResponseType]] = js.undefined
  var channel: Channel
  var metadata: Metadata
  var methodDefinition: ClientMethodDefinition[RequestType, ResponseType]
}

object CallProperties {
  @scala.inline
  def apply[RequestType, ResponseType](
    call: SurfaceCall,
    callOptions: CallOptions,
    channel: Channel,
    metadata: Metadata,
    methodDefinition: ClientMethodDefinition[RequestType, ResponseType],
    argument: RequestType = null,
    callback: (/* err */ ServiceError | Null, /* value */ js.UndefOr[ResponseType]) => Unit = null
  ): CallProperties[RequestType, ResponseType] = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], callOptions = callOptions.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], methodDefinition = methodDefinition.asInstanceOf[js.Any])
    if (argument != null) __obj.updateDynamic("argument")(argument.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    __obj.asInstanceOf[CallProperties[RequestType, ResponseType]]
  }
}

