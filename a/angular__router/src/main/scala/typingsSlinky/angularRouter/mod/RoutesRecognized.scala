package typingsSlinky.angularRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "RoutesRecognized")
@js.native
class RoutesRecognized protected () extends RouterEvent {
  def this(
    /** @docsNotRequired */
  id: Double,
    /** @docsNotRequired */
  url: String,
    /** @docsNotRequired */
  urlAfterRedirects: String,
    /** @docsNotRequired */
  state: RouterStateSnapshot
  ) = this()
  
  /** @docsNotRequired */
  var state: RouterStateSnapshot = js.native
  
  /** @docsNotRequired */
  var urlAfterRedirects: String = js.native
}
