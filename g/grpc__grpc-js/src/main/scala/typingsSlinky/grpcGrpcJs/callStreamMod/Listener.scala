package typingsSlinky.grpcGrpcJs.callStreamMod

import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.FullListener> */
trait Listener extends js.Object {
  var onReceiveMessage: js.UndefOr[MessageListener] = js.undefined
  var onReceiveMetadata: js.UndefOr[MetadataListener] = js.undefined
  var onReceiveStatus: js.UndefOr[StatusListener] = js.undefined
}

object Listener {
  @scala.inline
  def apply(
    onReceiveMessage: (/* message */ js.Any, /* next */ js.Function1[/* message */ js.Any, Unit]) => Unit = null,
    onReceiveMetadata: (/* metadata */ Metadata, /* next */ js.Function1[/* metadata */ Metadata, Unit]) => Unit = null,
    onReceiveStatus: (/* status */ StatusObject, /* next */ js.Function1[/* status */ StatusObject, Unit]) => Unit = null
  ): Listener = {
    val __obj = js.Dynamic.literal()
    if (onReceiveMessage != null) __obj.updateDynamic("onReceiveMessage")(js.Any.fromFunction2(onReceiveMessage))
    if (onReceiveMetadata != null) __obj.updateDynamic("onReceiveMetadata")(js.Any.fromFunction2(onReceiveMetadata))
    if (onReceiveStatus != null) __obj.updateDynamic("onReceiveStatus")(js.Any.fromFunction2(onReceiveStatus))
    __obj.asInstanceOf[Listener]
  }
}

