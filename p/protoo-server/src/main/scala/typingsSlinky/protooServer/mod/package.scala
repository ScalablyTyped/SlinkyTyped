package typingsSlinky.protooServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AcceptFn = js.Function1[/* data */ js.Any, scala.Unit]
  type ConnectionRequestAcceptFn = js.Function0[typingsSlinky.protooServer.mod.WebSocketTransport]
  type ConnectionRequestCb = js.Function3[
    /* info */ typingsSlinky.protooServer.mod.ConnectionRequestInfo, 
    /* accept */ typingsSlinky.protooServer.mod.ConnectionRequestAcceptFn, 
    /* reject */ typingsSlinky.protooServer.mod.ConnectionRequestRejectFn, 
    scala.Unit
  ]
  type ConnectionRequestRejectFn = (js.Function2[/* code */ scala.Double, /* reason */ java.lang.String, scala.Unit]) with (js.Function1[/* error */ js.Error, scala.Unit])
  type EmptyCb = js.Function0[scala.Unit]
  type NotificationCb = js.Function1[/* notification */ typingsSlinky.protooServer.mod.ProtooNotification, scala.Unit]
  type RejectFn = (js.Function1[/* errorCode */ js.UndefOr[js.Error], scala.Unit]) with (js.Function2[
    /* errorCode */ scala.Double, 
    /* errorReason */ js.Error | java.lang.String, 
    scala.Unit
  ])
  type RequestCb = js.Function3[
    /* request */ typingsSlinky.protooServer.mod.ProtooRequest, 
    /* accept */ typingsSlinky.protooServer.mod.AcceptFn, 
    /* reject */ typingsSlinky.protooServer.mod.RejectFn, 
    scala.Unit
  ]
}
