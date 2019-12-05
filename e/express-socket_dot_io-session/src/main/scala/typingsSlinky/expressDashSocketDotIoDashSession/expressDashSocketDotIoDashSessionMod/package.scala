package typingsSlinky.expressDashSocketDotIoDashSession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashSocketDotIoDashSessionMod {
  import typingsSlinky.socketDotIo.socketDotIoMod.Socket

  type SocketIoSharedSessionMiddleware = js.Function2[
    /* socket */ Socket, 
    /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
}
