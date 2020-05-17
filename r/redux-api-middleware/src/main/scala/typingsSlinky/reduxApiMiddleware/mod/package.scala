package typingsSlinky.reduxApiMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RSAAFailureAction[Payload, Meta] = typingsSlinky.reduxApiMiddleware.mod.RSAAResultAction[Payload, Meta]
  type RSAASuccessAction[Payload, Meta] = typingsSlinky.reduxApiMiddleware.mod.RSAAResultAction[Payload, Meta]
  type ValidAction[Payload, Meta] = typingsSlinky.reduxApiMiddleware.anon.Error with (typingsSlinky.reduxApiMiddleware.anon.PayloadPayload[Payload] | js.Object) with (typingsSlinky.reduxApiMiddleware.anon.MetaMeta[Meta] | js.Object)
}
