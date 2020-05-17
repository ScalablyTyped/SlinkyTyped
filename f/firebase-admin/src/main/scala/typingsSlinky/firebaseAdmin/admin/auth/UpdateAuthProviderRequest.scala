package typingsSlinky.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseAdmin.admin.auth.SAMLUpdateAuthProviderRequest
  - typingsSlinky.firebaseAdmin.admin.auth.OIDCUpdateAuthProviderRequest
*/
trait UpdateAuthProviderRequest extends js.Object

object UpdateAuthProviderRequest {
  @scala.inline
  implicit def apply(value: OIDCUpdateAuthProviderRequest): UpdateAuthProviderRequest = value.asInstanceOf[UpdateAuthProviderRequest]
  @scala.inline
  implicit def apply(value: SAMLUpdateAuthProviderRequest): UpdateAuthProviderRequest = value.asInstanceOf[UpdateAuthProviderRequest]
}

