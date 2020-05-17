package typingsSlinky.retryAsPromised.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
  - typingsSlinky.std.Error
*/
trait MatchOption extends js.Object

object MatchOption {
  @scala.inline
  implicit def apply(value: js.Error): MatchOption = value.asInstanceOf[MatchOption]
  @scala.inline
  implicit def apply(value: js.RegExp): MatchOption = value.asInstanceOf[MatchOption]
  @scala.inline
  implicit def apply(value: String): MatchOption = value.asInstanceOf[MatchOption]
}

