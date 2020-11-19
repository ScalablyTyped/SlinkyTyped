package typingsSlinky.oauth2orize

import typingsSlinky.oauth2orize.mod.AuthorizationErrorCode
import typingsSlinky.oauth2orize.mod.TokenErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oauth2orizeStrings {
  
  @scala.inline
  def access_denied: access_denied = "access_denied".asInstanceOf[access_denied]
  
  @scala.inline
  def invalid_client: invalid_client = "invalid_client".asInstanceOf[invalid_client]
  
  @scala.inline
  def invalid_grant: invalid_grant = "invalid_grant".asInstanceOf[invalid_grant]
  
  @scala.inline
  def invalid_request: invalid_request = "invalid_request".asInstanceOf[invalid_request]
  
  @scala.inline
  def invalid_scope: invalid_scope = "invalid_scope".asInstanceOf[invalid_scope]
  
  @scala.inline
  def temporarily_unavailable: temporarily_unavailable = "temporarily_unavailable".asInstanceOf[temporarily_unavailable]
  
  @scala.inline
  def unauthorized_client: unauthorized_client = "unauthorized_client".asInstanceOf[unauthorized_client]
  
  @scala.inline
  def unsupported_grant_type: unsupported_grant_type = "unsupported_grant_type".asInstanceOf[unsupported_grant_type]
  
  @scala.inline
  def unsupported_response_type: unsupported_response_type = "unsupported_response_type".asInstanceOf[unsupported_response_type]
  
  @js.native
  sealed trait access_denied extends AuthorizationErrorCode
  
  @js.native
  sealed trait invalid_client extends TokenErrorCode
  
  @js.native
  sealed trait invalid_grant extends TokenErrorCode
  
  @js.native
  sealed trait invalid_request
    extends AuthorizationErrorCode
       with TokenErrorCode
  
  @js.native
  sealed trait invalid_scope
    extends AuthorizationErrorCode
       with TokenErrorCode
  
  @js.native
  sealed trait temporarily_unavailable extends AuthorizationErrorCode
  
  @js.native
  sealed trait unauthorized_client
    extends AuthorizationErrorCode
       with TokenErrorCode
  
  @js.native
  sealed trait unsupported_grant_type extends TokenErrorCode
  
  @js.native
  sealed trait unsupported_response_type extends AuthorizationErrorCode
}
