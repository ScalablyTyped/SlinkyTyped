package typingsSlinky.marko.expressMod

import typingsSlinky.express.mod.Application_
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.Express
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/express", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * These are the exposed prototypes.
    */
  var application: Application_ = js.native
  var request: Request_[ParamsDictionary] = js.native
  var response: Response_ = js.native
  /**
    * Creates an Express application. The express() function is a top-level function exported by the express module.
    */
  def apply(): Express = js.native
}

