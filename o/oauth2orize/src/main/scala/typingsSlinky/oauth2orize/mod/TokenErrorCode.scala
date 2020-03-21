package typingsSlinky.oauth2orize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.oauth2orize.oauth2orizeStrings.invalid_request
  - typingsSlinky.oauth2orize.oauth2orizeStrings.invalid_client
  - typingsSlinky.oauth2orize.oauth2orizeStrings.invalid_grant
  - typingsSlinky.oauth2orize.oauth2orizeStrings.unauthorized_client
  - typingsSlinky.oauth2orize.oauth2orizeStrings.unsupported_grant_type
  - typingsSlinky.oauth2orize.oauth2orizeStrings.invalid_scope
*/
trait TokenErrorCode extends js.Object

object TokenErrorCode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def invalid_client: typingsSlinky.oauth2orize.oauth2orizeStrings.invalid_client = this.cast("invalid_client")
  @scala.inline
  def invalid_grant: typingsSlinky.oauth2orize.oauth2orizeStrings.invalid_grant = this.cast("invalid_grant")
  @scala.inline
  def invalid_request: typingsSlinky.oauth2orize.oauth2orizeStrings.invalid_request = this.cast("invalid_request")
  @scala.inline
  def invalid_scope: typingsSlinky.oauth2orize.oauth2orizeStrings.invalid_scope = this.cast("invalid_scope")
  @scala.inline
  def unauthorized_client: typingsSlinky.oauth2orize.oauth2orizeStrings.unauthorized_client = this.cast("unauthorized_client")
  @scala.inline
  def unsupported_grant_type: typingsSlinky.oauth2orize.oauth2orizeStrings.unsupported_grant_type = this.cast("unsupported_grant_type")
}

