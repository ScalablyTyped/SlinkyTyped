package typingsSlinky.oauth2orize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.oauth2orize.oauth2orizeStrings.invalid_request
  - typingsSlinky.oauth2orize.oauth2orizeStrings.unauthorized_client
  - typingsSlinky.oauth2orize.oauth2orizeStrings.access_denied
  - typingsSlinky.oauth2orize.oauth2orizeStrings.unsupported_response_type
  - typingsSlinky.oauth2orize.oauth2orizeStrings.invalid_scope
  - typingsSlinky.oauth2orize.oauth2orizeStrings.temporarily_unavailable
*/
trait AuthorizationErrorCode extends js.Object

object AuthorizationErrorCode {
  @scala.inline
  def access_denied: typingsSlinky.oauth2orize.oauth2orizeStrings.access_denied = this.cast("access_denied")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def invalid_request: typingsSlinky.oauth2orize.oauth2orizeStrings.invalid_request = this.cast("invalid_request")
  @scala.inline
  def invalid_scope: typingsSlinky.oauth2orize.oauth2orizeStrings.invalid_scope = this.cast("invalid_scope")
  @scala.inline
  def temporarily_unavailable: typingsSlinky.oauth2orize.oauth2orizeStrings.temporarily_unavailable = this.cast("temporarily_unavailable")
  @scala.inline
  def unauthorized_client: typingsSlinky.oauth2orize.oauth2orizeStrings.unauthorized_client = this.cast("unauthorized_client")
  @scala.inline
  def unsupported_response_type: typingsSlinky.oauth2orize.oauth2orizeStrings.unsupported_response_type = this.cast("unsupported_response_type")
}

