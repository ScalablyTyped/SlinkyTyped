package typingsSlinky.grpcGrpcJs.clientInterceptorsMod

import typingsSlinky.grpcGrpcJs.callStreamMod.InterceptingListener
import typingsSlinky.grpcGrpcJs.callStreamMod.Listener
import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/client-interceptors.FullRequester> */
trait Requester extends js.Object {
  var cancel: js.UndefOr[CancelRequester] = js.undefined
  var halfClose: js.UndefOr[CloseRequester] = js.undefined
  var sendMessage: js.UndefOr[MessageRequester] = js.undefined
  var start: js.UndefOr[MetadataRequester] = js.undefined
}

object Requester {
  @scala.inline
  def apply(
    cancel: /* next */ js.Function0[Unit] => Unit = null,
    halfClose: /* next */ js.Function0[Unit] => Unit = null,
    sendMessage: (/* message */ js.Any, /* next */ js.Function1[/* message */ js.Any, Unit]) => Unit = null,
    start: (/* metadata */ Metadata, /* listener */ InterceptingListener, /* next */ js.Function2[/* metadata */ Metadata, /* listener */ InterceptingListener | Listener, Unit]) => Unit = null
  ): Requester = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1(cancel))
    if (halfClose != null) __obj.updateDynamic("halfClose")(js.Any.fromFunction1(halfClose))
    if (sendMessage != null) __obj.updateDynamic("sendMessage")(js.Any.fromFunction2(sendMessage))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction3(start))
    __obj.asInstanceOf[Requester]
  }
}

