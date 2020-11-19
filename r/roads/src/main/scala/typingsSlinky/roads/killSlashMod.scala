package typingsSlinky.roads

import typingsSlinky.roads.roadMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("roads/types/middleware/killSlash", JSImport.Namespace)
@js.native
object killSlashMod extends js.Object {
  
  /**
    * Any requests with trailing slashes will immediately return a Response object redirecting to a non-trailing-slash path
    */
  var default: Middleware = js.native
}
