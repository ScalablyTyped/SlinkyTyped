package typingsSlinky.anymatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
  - js.Function1[/ * repeated * / java.lang.String, scala.Boolean]
*/
trait MatcherType extends Matcher

object MatcherType {
  @scala.inline
  implicit def apply(value: js.Function1[/* repeated */ String, Boolean]): MatcherType = value.asInstanceOf[MatcherType]
  @scala.inline
  implicit def apply(value: js.RegExp): MatcherType = value.asInstanceOf[MatcherType]
  @scala.inline
  implicit def apply(value: String): MatcherType = value.asInstanceOf[MatcherType]
}

