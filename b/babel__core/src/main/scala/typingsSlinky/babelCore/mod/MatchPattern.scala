package typingsSlinky.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
  - js.Function2[
/ * filename * / js.UndefOr[java.lang.String], 
/ * context * / typingsSlinky.babelCore.mod.MatchPatternContext, 
scala.Boolean]
*/
trait MatchPattern extends js.Object

object MatchPattern {
  @scala.inline
  implicit def apply(value: js.Function2[/* filename */ js.UndefOr[String], /* context */ MatchPatternContext, Boolean]): MatchPattern = value.asInstanceOf[MatchPattern]
  @scala.inline
  implicit def apply(value: js.RegExp): MatchPattern = value.asInstanceOf[MatchPattern]
  @scala.inline
  implicit def apply(value: String): MatchPattern = value.asInstanceOf[MatchPattern]
}

