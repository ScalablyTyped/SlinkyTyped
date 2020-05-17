package typingsSlinky.anymatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.anymatch.mod.MatcherType
  - js.Array[typingsSlinky.anymatch.mod.MatcherType]
*/
trait Matcher extends js.Object

object Matcher {
  @scala.inline
  implicit def apply(value: js.Array[MatcherType]): Matcher = value.asInstanceOf[Matcher]
  @scala.inline
  implicit def apply(value: MatcherType): Matcher = value.asInstanceOf[Matcher]
}

