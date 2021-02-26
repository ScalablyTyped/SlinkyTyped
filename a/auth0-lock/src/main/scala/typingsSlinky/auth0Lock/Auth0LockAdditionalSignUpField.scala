package typingsSlinky.auth0Lock

import typingsSlinky.auth0Lock.auth0LockStrings.`false`
import typingsSlinky.auth0Lock.auth0LockStrings.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.auth0Lock.Auth0LockAdditionalSelectSignUpField
  - typingsSlinky.auth0Lock.Auth0LockAdditionalTextSignUpField
  - typingsSlinky.auth0Lock.Auth0LockAdditionalCheckboxSignUpField
*/
trait Auth0LockAdditionalSignUpField extends StObject
object Auth0LockAdditionalSignUpField {
  
  @scala.inline
  def Auth0LockAdditionalCheckboxSignUpField(name: String, placeholder: String, prefill: `true` | `false`): typingsSlinky.auth0Lock.Auth0LockAdditionalCheckboxSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], prefill = prefill.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.auth0Lock.Auth0LockAdditionalCheckboxSignUpField]
  }
  
  @scala.inline
  def Auth0LockAdditionalSelectSignUpField(name: String, placeholder: String): typingsSlinky.auth0Lock.Auth0LockAdditionalSelectSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.auth0Lock.Auth0LockAdditionalSelectSignUpField]
  }
  
  @scala.inline
  def Auth0LockAdditionalTextSignUpField(name: String, placeholder: String): typingsSlinky.auth0Lock.Auth0LockAdditionalTextSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.auth0Lock.Auth0LockAdditionalTextSignUpField]
  }
}
