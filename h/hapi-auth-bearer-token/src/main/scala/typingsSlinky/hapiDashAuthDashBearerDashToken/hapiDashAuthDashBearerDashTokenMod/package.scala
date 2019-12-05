package typingsSlinky.hapiDashAuthDashBearerDashToken

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hapiDashAuthDashBearerDashTokenMod {
  import typingsSlinky.hapi.hapiMod.AuthenticationData
  import typingsSlinky.hapi.hapiMod.Request
  import typingsSlinky.hapi.hapiMod.ResponseToolkit
  import typingsSlinky.hapiDashAuthDashBearerDashToken.Anon_IsValid

  type Validate = js.Function3[
    /* request */ Request, 
    /* token */ String, 
    /* h */ ResponseToolkit, 
    js.Promise[ValidateReturn] | ValidateReturn
  ]
  type ValidateReturn = AuthenticationData with Anon_IsValid
}
