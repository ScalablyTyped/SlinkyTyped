package typingsSlinky.adalNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("adal-node", "createAuthenticationParametersFromUrl")
@js.native
object createAuthenticationParametersFromUrl extends js.Object {
  
  def apply(
    url: String,
    callback: js.Function2[/* error */ js.Error, /* parameters */ AuthenticationParameters, Unit]
  ): AuthenticationParameters = js.native
  def apply(
    url: String,
    callback: js.Function2[/* error */ js.Error, /* parameters */ AuthenticationParameters, Unit],
    correlationId: String
  ): AuthenticationParameters = js.native
}
