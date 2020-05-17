package typingsSlinky.log4js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[/ * logEvent * / typingsSlinky.log4js.mod.LoggingEvent, java.lang.String]
  - java.lang.String
*/
trait Token extends js.Object

object Token {
  @scala.inline
  implicit def apply(value: js.Function1[/* logEvent */ LoggingEvent, String]): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: String): Token = value.asInstanceOf[Token]
}

