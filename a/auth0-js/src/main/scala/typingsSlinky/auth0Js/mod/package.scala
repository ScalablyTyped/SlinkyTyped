package typingsSlinky.auth0Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Auth0Callback[T, E] = js.Function2[/* error */ scala.Null | E, /* result */ T, scala.Unit]
  
  type ConsentRequiredErrorCode = typingsSlinky.auth0Js.auth0JsStrings.consent_required
  
  type InteractionRequiredErrorCode = typingsSlinky.auth0Js.auth0JsStrings.interaction_required
  
  type LoginRequiredErrorCode = typingsSlinky.auth0Js.auth0JsStrings.login_required
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.auth0Js.mod.LoginRequiredErrorCode
    - typingsSlinky.auth0Js.mod.InteractionRequiredErrorCode
    - typingsSlinky.auth0Js.mod.ConsentRequiredErrorCode
    - typingsSlinky.auth0Js.auth0JsStrings.account_selection_required
    - typingsSlinky.auth0Js.auth0JsStrings.invalid_request_uri
    - typingsSlinky.auth0Js.auth0JsStrings.invalid_request_object
    - typingsSlinky.auth0Js.auth0JsStrings.request_not_supported
    - typingsSlinky.auth0Js.auth0JsStrings.request_uri_not_supported
    - typingsSlinky.auth0Js.auth0JsStrings.registration_not_supported
  */
  type SpecErrorCodes = typingsSlinky.auth0Js.mod._SpecErrorCodes | typingsSlinky.auth0Js.mod.LoginRequiredErrorCode | typingsSlinky.auth0Js.mod.InteractionRequiredErrorCode | typingsSlinky.auth0Js.mod.ConsentRequiredErrorCode
}
