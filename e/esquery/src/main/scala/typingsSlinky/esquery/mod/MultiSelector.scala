package typingsSlinky.esquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.esquery.mod.Sequence
  - typingsSlinky.esquery.mod.Negation
  - typingsSlinky.esquery.mod.Matches_
  - typingsSlinky.esquery.mod.Has
*/
trait MultiSelector extends SubjectSelector

object MultiSelector {
  @scala.inline
  implicit def apply(value: Has): MultiSelector = value.asInstanceOf[MultiSelector]
  @scala.inline
  implicit def apply(value: Matches_): MultiSelector = value.asInstanceOf[MultiSelector]
  @scala.inline
  implicit def apply(value: Negation): MultiSelector = value.asInstanceOf[MultiSelector]
  @scala.inline
  implicit def apply(value: Sequence): MultiSelector = value.asInstanceOf[MultiSelector]
}

