package typingsSlinky.marko.expressMod

import typingsSlinky.express.mod.Application_
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.Express
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marko/express", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Creates an Express application. The express() function is a top-level function exported by the express module.
    */
  def apply(): Express = js.native
  
  /**
    * These are the exposed prototypes.
    */
  var application: Application_ = js.native
  
  var request: Request_[ParamsDictionary, js.Any, js.Any, Query] = js.native
  
  var response: Response_[js.Any] = js.native
}
