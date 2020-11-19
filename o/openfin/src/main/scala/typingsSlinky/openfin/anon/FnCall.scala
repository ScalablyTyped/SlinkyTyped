package typingsSlinky.openfin.anon

import typingsSlinky.openfin.openfinBooleans.`true`
import typingsSlinky.openfin.openfinStrings.`request-external-authorization`
import typingsSlinky.openfin.transportMod.AuthorizationPayload
import typingsSlinky.openfin.transportMod.Message
import typingsSlinky.openfin.transportMod.Payload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply(action: String, payload: js.Object, uncorrelated: Boolean): js.Promise[Message[Payload]] = js.native
  def apply(action: `request-external-authorization`, payload: js.Object, uncorrelated: `true`): js.Promise[Message[AuthorizationPayload]] = js.native
}
