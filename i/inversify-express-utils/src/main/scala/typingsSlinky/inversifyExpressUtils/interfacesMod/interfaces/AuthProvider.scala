package typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces

import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthProvider extends js.Object {
  def getUser(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], next: NextFunction): js.Promise[Principal]
}

object AuthProvider {
  @scala.inline
  def apply(
    getUser: (Request_[ParamsDictionary, _, _, Query], Response_[_], NextFunction) => js.Promise[Principal]
  ): AuthProvider = {
    val __obj = js.Dynamic.literal(getUser = js.Any.fromFunction3(getUser))
    __obj.asInstanceOf[AuthProvider]
  }
}

