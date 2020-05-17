package typingsSlinky.esquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.esquery.mod.NthChild
  - typingsSlinky.esquery.mod.NthLastChild
*/
trait NthSelector extends SubjectSelector

object NthSelector {
  @scala.inline
  implicit def apply(value: NthChild): NthSelector = value.asInstanceOf[NthSelector]
  @scala.inline
  implicit def apply(value: NthLastChild): NthSelector = value.asInstanceOf[NthSelector]
}

