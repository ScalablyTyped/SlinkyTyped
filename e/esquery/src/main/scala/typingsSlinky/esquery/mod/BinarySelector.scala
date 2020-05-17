package typingsSlinky.esquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.esquery.mod.Descendant
  - typingsSlinky.esquery.mod.Child
  - typingsSlinky.esquery.mod.Sibling
  - typingsSlinky.esquery.mod.Adjacent
*/
trait BinarySelector extends SubjectSelector

object BinarySelector {
  @scala.inline
  implicit def apply(value: Adjacent): BinarySelector = value.asInstanceOf[BinarySelector]
  @scala.inline
  implicit def apply(value: Child): BinarySelector = value.asInstanceOf[BinarySelector]
  @scala.inline
  implicit def apply(value: Descendant): BinarySelector = value.asInstanceOf[BinarySelector]
  @scala.inline
  implicit def apply(value: Sibling): BinarySelector = value.asInstanceOf[BinarySelector]
}

