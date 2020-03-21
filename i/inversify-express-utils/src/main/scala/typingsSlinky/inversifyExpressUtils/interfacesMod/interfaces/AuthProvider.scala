package typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces

import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthProvider extends js.Object {
  def getUser(req: Request_[ParamsDictionary], res: Response_, next: NextFunction): js.Promise[Principal]
}

object AuthProvider {
  @scala.inline
  def apply(getUser: (Request_[ParamsDictionary], Response_, NextFunction) => js.Promise[Principal]): AuthProvider = {
    val __obj = js.Dynamic.literal(getUser = js.Any.fromFunction3(getUser))
  
    __obj.asInstanceOf[AuthProvider]
  }
}

