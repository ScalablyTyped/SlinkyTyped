package typingsSlinky.grpcGrpcJs.anon

import typingsSlinky.grpcGrpcJs.callStreamMod.StatusObject
import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.InterceptingListener> */
trait PartialInterceptingListen extends js.Object {
  var onReceiveMessage: js.UndefOr[js.Function1[/* message */ js.Any, Unit]] = js.undefined
  var onReceiveMetadata: js.UndefOr[js.Function1[/* metadata */ Metadata, Unit]] = js.undefined
  var onReceiveStatus: js.UndefOr[js.Function1[/* status */ StatusObject, Unit]] = js.undefined
}

object PartialInterceptingListen {
  @scala.inline
  def apply(
    onReceiveMessage: /* message */ js.Any => Unit = null,
    onReceiveMetadata: /* metadata */ Metadata => Unit = null,
    onReceiveStatus: /* status */ StatusObject => Unit = null
  ): PartialInterceptingListen = {
    val __obj = js.Dynamic.literal()
    if (onReceiveMessage != null) __obj.updateDynamic("onReceiveMessage")(js.Any.fromFunction1(onReceiveMessage))
    if (onReceiveMetadata != null) __obj.updateDynamic("onReceiveMetadata")(js.Any.fromFunction1(onReceiveMetadata))
    if (onReceiveStatus != null) __obj.updateDynamic("onReceiveStatus")(js.Any.fromFunction1(onReceiveStatus))
    __obj.asInstanceOf[PartialInterceptingListen]
  }
}

