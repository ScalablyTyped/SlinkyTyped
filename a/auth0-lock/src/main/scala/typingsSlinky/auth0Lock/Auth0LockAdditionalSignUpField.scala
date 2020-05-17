package typingsSlinky.auth0Lock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.auth0Lock.Auth0LockAdditionalSelectSignUpField
  - typingsSlinky.auth0Lock.Auth0LockAdditionalTextSignUpField
  - typingsSlinky.auth0Lock.Auth0LockAdditionalCheckboxSignUpField
*/
trait Auth0LockAdditionalSignUpField extends js.Object

object Auth0LockAdditionalSignUpField {
  @scala.inline
  implicit def apply(value: Auth0LockAdditionalCheckboxSignUpField): Auth0LockAdditionalSignUpField = value.asInstanceOf[Auth0LockAdditionalSignUpField]
  @scala.inline
  implicit def apply(value: Auth0LockAdditionalSelectSignUpField): Auth0LockAdditionalSignUpField = value.asInstanceOf[Auth0LockAdditionalSignUpField]
  @scala.inline
  implicit def apply(value: Auth0LockAdditionalTextSignUpField): Auth0LockAdditionalSignUpField = value.asInstanceOf[Auth0LockAdditionalSignUpField]
}

