package typingsSlinky.atJupyterlabApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTokensMod {
  import typingsSlinky.atJupyterlabServices.atJupyterlabServicesMod.ServerConnection.NetworkError
  import typingsSlinky.atJupyterlabServices.libManagerMod.ServiceManager.IManager

  type IConnectionLost = js.Function2[/* manager */ IManager, /* err */ NetworkError, js.Promise[Unit]]
  type IRouter = IRouter_
}
