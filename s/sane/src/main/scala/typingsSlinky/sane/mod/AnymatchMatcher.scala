package typingsSlinky.sane.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
  - js.Function1[/ * repeated * / java.lang.String, scala.Boolean]
*/
trait AnymatchMatcher extends js.Object

object AnymatchMatcher {
  @scala.inline
  implicit def apply(value: js.Function1[/* repeated */ String, Boolean]): AnymatchMatcher = value.asInstanceOf[AnymatchMatcher]
  @scala.inline
  implicit def apply(value: js.RegExp): AnymatchMatcher = value.asInstanceOf[AnymatchMatcher]
  @scala.inline
  implicit def apply(value: String): AnymatchMatcher = value.asInstanceOf[AnymatchMatcher]
}

