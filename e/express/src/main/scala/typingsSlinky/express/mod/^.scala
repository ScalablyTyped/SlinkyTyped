package typingsSlinky.express.mod

import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Creates an Express application. The express() function is a top-level function exported by the express module.
    */
  def apply(): typingsSlinky.expressServeStaticCore.mod.Express = js.native
  
  /**
    * These are the exposed prototypes.
    */
  var application: Application_ = js.native
  
  var request: Request_[ParamsDictionary, js.Any, js.Any, Query] = js.native
  
  var response: Response_[js.Any] = js.native
}
