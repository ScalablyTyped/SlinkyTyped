package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.auth0.auth0Strings.authorization_code
  - typingsSlinky.auth0.auth0Strings.client_credentials
  - typingsSlinky.auth0.auth0Strings.`implicit`
  - typingsSlinky.auth0.auth0Strings.password
  - typingsSlinky.auth0.auth0Strings.refresh_token
*/
trait Grant extends js.Object

object Grant {
  @scala.inline
  def authorization_code: typingsSlinky.auth0.auth0Strings.authorization_code = this.cast("authorization_code")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def client_credentials: typingsSlinky.auth0.auth0Strings.client_credentials = this.cast("client_credentials")
  @scala.inline
  def `implicit`: typingsSlinky.auth0.auth0Strings.`implicit` = this.cast("implicit")
  @scala.inline
  def password: typingsSlinky.auth0.auth0Strings.password = this.cast("password")
  @scala.inline
  def refresh_token: typingsSlinky.auth0.auth0Strings.refresh_token = this.cast("refresh_token")
}

