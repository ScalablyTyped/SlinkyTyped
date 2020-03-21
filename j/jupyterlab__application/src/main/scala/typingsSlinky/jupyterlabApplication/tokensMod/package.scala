package typingsSlinky.jupyterlabApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tokensMod {
  type IConnectionLost = js.Function2[
    /* manager */ typingsSlinky.jupyterlabServices.libManagerMod.ServiceManager.IManager, 
    /* err */ typingsSlinky.jupyterlabServices.mod.ServerConnection.NetworkError, 
    js.Promise[scala.Unit]
  ]
  type IRouter = typingsSlinky.jupyterlabApplication.tokensMod.IRouter_
}
