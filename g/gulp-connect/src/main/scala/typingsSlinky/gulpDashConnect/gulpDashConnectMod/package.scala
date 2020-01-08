package typingsSlinky.gulpDashConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashConnectMod {
  import typingsSlinky.connect.connectMod.HandleFunction
  import typingsSlinky.connect.connectMod.Server
  import typingsSlinky.gulpDashConnect.TypeofconnectModule

  type ConnectRouteHandler = js.Tuple2[String, HandleFunction]
  type MiddlewareFactory = js.Function2[
    /* connect */ js.Function0[Server] with TypeofconnectModule, 
    /* options */ ConnectAppOptions, 
    js.Array[HandleFunction | ConnectRouteHandler]
  ]
}
