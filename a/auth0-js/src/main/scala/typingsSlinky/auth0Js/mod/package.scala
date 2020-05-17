package typingsSlinky.auth0Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Auth0Callback[T, E] = js.Function2[/* error */ scala.Null | E, /* result */ T, scala.Unit]
  type ConsentRequiredErrorCode = typingsSlinky.auth0Js.auth0JsStrings.consent_required
  type InteractionRequiredErrorCode = typingsSlinky.auth0Js.auth0JsStrings.interaction_required
  type LoginRequiredErrorCode = typingsSlinky.auth0Js.auth0JsStrings.login_required
}
