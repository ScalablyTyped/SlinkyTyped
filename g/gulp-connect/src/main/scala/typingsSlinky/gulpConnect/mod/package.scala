package typingsSlinky.gulpConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConnectRouteHandler = js.Tuple2[java.lang.String, typingsSlinky.connect.mod.HandleFunction]
  type MiddlewareFactory = js.Function2[
    /* connect */ js.Function0[typingsSlinky.connect.mod.Server] with typingsSlinky.gulpConnect.anon.TypeofconnectModule, 
    /* options */ typingsSlinky.gulpConnect.mod.ConnectAppOptions, 
    js.Array[
      typingsSlinky.connect.mod.HandleFunction | typingsSlinky.gulpConnect.mod.ConnectRouteHandler
    ]
  ]
}
