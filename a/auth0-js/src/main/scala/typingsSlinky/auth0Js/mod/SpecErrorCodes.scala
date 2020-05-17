package typingsSlinky.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait SpecErrorCodes extends js.Object

object SpecErrorCodes {
  @scala.inline
  def account_selection_required: typingsSlinky.auth0Js.auth0JsStrings.account_selection_required = "account_selection_required".asInstanceOf[typingsSlinky.auth0Js.auth0JsStrings.account_selection_required]
  @scala.inline
  def invalid_request_uri: typingsSlinky.auth0Js.auth0JsStrings.invalid_request_uri = "invalid_request_uri".asInstanceOf[typingsSlinky.auth0Js.auth0JsStrings.invalid_request_uri]
  @scala.inline
  def invalid_request_object: typingsSlinky.auth0Js.auth0JsStrings.invalid_request_object = "invalid_request_object".asInstanceOf[typingsSlinky.auth0Js.auth0JsStrings.invalid_request_object]
  @scala.inline
  def request_not_supported: typingsSlinky.auth0Js.auth0JsStrings.request_not_supported = "request_not_supported".asInstanceOf[typingsSlinky.auth0Js.auth0JsStrings.request_not_supported]
  @scala.inline
  def request_uri_not_supported: typingsSlinky.auth0Js.auth0JsStrings.request_uri_not_supported = "request_uri_not_supported".asInstanceOf[typingsSlinky.auth0Js.auth0JsStrings.request_uri_not_supported]
  @scala.inline
  def registration_not_supported: typingsSlinky.auth0Js.auth0JsStrings.registration_not_supported = "registration_not_supported".asInstanceOf[typingsSlinky.auth0Js.auth0JsStrings.registration_not_supported]
  @scala.inline
  implicit def apply(value: ConsentRequiredErrorCode): SpecErrorCodes = value.asInstanceOf[SpecErrorCodes]
  @scala.inline
  implicit def apply(value: InteractionRequiredErrorCode): SpecErrorCodes = value.asInstanceOf[SpecErrorCodes]
  @scala.inline
  implicit def apply(value: LoginRequiredErrorCode): SpecErrorCodes = value.asInstanceOf[SpecErrorCodes]
}

