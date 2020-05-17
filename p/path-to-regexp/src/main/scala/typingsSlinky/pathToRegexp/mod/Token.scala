package typingsSlinky.pathToRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.pathToRegexp.mod.Key
*/
trait Token extends js.Object

object Token {
  @scala.inline
  implicit def apply(value: Key): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: String): Token = value.asInstanceOf[Token]
}

