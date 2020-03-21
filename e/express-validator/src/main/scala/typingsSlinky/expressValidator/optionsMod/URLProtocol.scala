package typingsSlinky.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.expressValidator.expressValidatorStrings.http
  - typingsSlinky.expressValidator.expressValidatorStrings.https
  - typingsSlinky.expressValidator.expressValidatorStrings.ftp
*/
trait URLProtocol extends js.Object

object URLProtocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ftp: typingsSlinky.expressValidator.expressValidatorStrings.ftp = this.cast("ftp")
  @scala.inline
  def http: typingsSlinky.expressValidator.expressValidatorStrings.http = this.cast("http")
  @scala.inline
  def https: typingsSlinky.expressValidator.expressValidatorStrings.https = this.cast("https")
}

