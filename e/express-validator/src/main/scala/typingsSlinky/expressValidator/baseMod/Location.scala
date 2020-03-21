package typingsSlinky.expressValidator.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.expressValidator.expressValidatorStrings.body
  - typingsSlinky.expressValidator.expressValidatorStrings.cookies
  - typingsSlinky.expressValidator.expressValidatorStrings.headers
  - typingsSlinky.expressValidator.expressValidatorStrings.params
  - typingsSlinky.expressValidator.expressValidatorStrings.query
*/
trait Location extends js.Object

object Location {
  @scala.inline
  def body: typingsSlinky.expressValidator.expressValidatorStrings.body = this.cast("body")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cookies: typingsSlinky.expressValidator.expressValidatorStrings.cookies = this.cast("cookies")
  @scala.inline
  def headers: typingsSlinky.expressValidator.expressValidatorStrings.headers = this.cast("headers")
  @scala.inline
  def params: typingsSlinky.expressValidator.expressValidatorStrings.params = this.cast("params")
  @scala.inline
  def query: typingsSlinky.expressValidator.expressValidatorStrings.query = this.cast("query")
}

