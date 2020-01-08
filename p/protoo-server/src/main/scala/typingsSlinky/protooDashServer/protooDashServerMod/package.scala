package typingsSlinky.protooDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object protooDashServerMod {
  import typingsSlinky.protooDashServer.protooDashServerStrings.autoAcceptConnections
  import typingsSlinky.protooDashServer.protooDashServerStrings.disableNagleAlgorithm
  import typingsSlinky.protooDashServer.protooDashServerStrings.dropConnectionOnKeepaliveTimeout
  import typingsSlinky.protooDashServer.protooDashServerStrings.httpServer
  import typingsSlinky.protooDashServer.protooDashServerStrings.ignoreXForwardedFor
  import typingsSlinky.protooDashServer.protooDashServerStrings.keepalive
  import typingsSlinky.protooDashServer.protooDashServerStrings.keepaliveGracePeriod
  import typingsSlinky.protooDashServer.protooDashServerStrings.keepaliveInterval
  import typingsSlinky.protooDashServer.protooDashServerStrings.maxReceivedFrameSize
  import typingsSlinky.protooDashServer.protooDashServerStrings.maxReceivedMessageSize
  import typingsSlinky.protooDashServer.protooDashServerStrings.useNativeKeepalive
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick
  import typingsSlinky.websocket.websocketMod.IServerConfig

  type AcceptFn = js.Function1[/* data */ js.Any, Unit]
  type ConnectionRequestAcceptFn = js.Function0[WebSocketTransport]
  type ConnectionRequestCb = js.Function3[
    /* info */ ConnectionRequestInfo, 
    /* accept */ ConnectionRequestAcceptFn, 
    /* reject */ ConnectionRequestRejectFn, 
    Unit
  ]
  type ConnectionRequestRejectFn = (js.Function2[/* code */ Double, /* reason */ String, Unit]) with (js.Function1[/* error */ js.Error, Unit])
  type EmptyCb = js.Function0[Unit]
  type NotificationCb = js.Function1[/* notification */ ProtooNotification, Unit]
  type RejectFn = (js.Function1[/* errorCode */ js.UndefOr[js.Error], Unit]) with (js.Function2[/* errorCode */ Double, /* errorReason */ js.Error | String, Unit])
  type RequestCb = js.Function3[/* request */ ProtooRequest, /* accept */ AcceptFn, /* reject */ RejectFn, Unit]
  type WebSocketServerOptions = Pick[
    IServerConfig, 
    Exclude[
      httpServer | maxReceivedFrameSize | maxReceivedMessageSize | keepalive | keepaliveInterval | dropConnectionOnKeepaliveTimeout | keepaliveGracePeriod | useNativeKeepalive | autoAcceptConnections | ignoreXForwardedFor | disableNagleAlgorithm, 
      httpServer
    ]
  ]
}
