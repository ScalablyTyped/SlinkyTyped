package typingsSlinky.esquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.esquery.mod.NthSelector
  - typingsSlinky.esquery.mod.BinarySelector
  - typingsSlinky.esquery.mod.MultiSelector
  - typingsSlinky.esquery.mod.Identifier
  - typingsSlinky.esquery.mod.Wildcard
  - typingsSlinky.esquery.mod.Attribute
*/
trait SubjectSelector extends js.Object

object SubjectSelector {
  @scala.inline
  implicit def apply(value: Attribute): SubjectSelector = value.asInstanceOf[SubjectSelector]
  @scala.inline
  implicit def apply(value: BinarySelector): SubjectSelector = value.asInstanceOf[SubjectSelector]
  @scala.inline
  implicit def apply(value: Identifier): SubjectSelector = value.asInstanceOf[SubjectSelector]
  @scala.inline
  implicit def apply(value: MultiSelector): SubjectSelector = value.asInstanceOf[SubjectSelector]
  @scala.inline
  implicit def apply(value: NthSelector): SubjectSelector = value.asInstanceOf[SubjectSelector]
  @scala.inline
  implicit def apply(value: Wildcard): SubjectSelector = value.asInstanceOf[SubjectSelector]
}

