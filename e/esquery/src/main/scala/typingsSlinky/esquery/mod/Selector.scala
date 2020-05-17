package typingsSlinky.esquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Unions
//
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.esquery.mod.Field
  - typingsSlinky.esquery.mod.Type
  - typingsSlinky.esquery.mod.Sequence
  - typingsSlinky.esquery.mod.Identifier
  - typingsSlinky.esquery.mod.Wildcard
  - typingsSlinky.esquery.mod.Attribute
  - typingsSlinky.esquery.mod.NthChild
  - typingsSlinky.esquery.mod.NthLastChild
  - typingsSlinky.esquery.mod.Descendant
  - typingsSlinky.esquery.mod.Child
  - typingsSlinky.esquery.mod.Sibling
  - typingsSlinky.esquery.mod.Adjacent
  - typingsSlinky.esquery.mod.Negation
  - typingsSlinky.esquery.mod.Matches_
  - typingsSlinky.esquery.mod.Has
  - typingsSlinky.esquery.mod.Class
*/
trait Selector extends js.Object

object Selector {
  @scala.inline
  implicit def apply(value: Adjacent): Selector = value.asInstanceOf[Selector]
  @scala.inline
  implicit def apply(value: Attribute): Selector = value.asInstanceOf[Selector]
  @scala.inline
  implicit def apply(value: Child): Selector = value.asInstanceOf[Selector]
  @scala.inline
  implicit def apply(value: Class): Selector = value.asInstanceOf[Selector]
  @scala.inline
  implicit def apply(value: Descendant): Selector = value.asInstanceOf[Selector]
  @scala.inline
  implicit def apply(value: Field): Selector = value.asInstanceOf[Selector]
  @scala.inline
  implicit def apply(value: Has): Selector = value.asInstanceOf[Selector]
  @scala.inline
  implicit def apply(value: Identifier): Selector = value.asInstanceOf[Selector]
  @scala.inline
  implicit def apply(value: Matches_): Selector = value.asInstanceOf[Selector]
  @scala.inline
  implicit def apply(value: Negation): Selector = value.asInstanceOf[Selector]
  @scala.inline
  implicit def apply(value: NthChild): Selector = value.asInstanceOf[Selector]
  @scala.inline
  implicit def apply(value: NthLastChild): Selector = value.asInstanceOf[Selector]
  @scala.inline
  implicit def apply(value: Sequence): Selector = value.asInstanceOf[Selector]
  @scala.inline
  implicit def apply(value: Sibling): Selector = value.asInstanceOf[Selector]
  @scala.inline
  implicit def apply(value: Type): Selector = value.asInstanceOf[Selector]
  @scala.inline
  implicit def apply(value: Wildcard): Selector = value.asInstanceOf[Selector]
}

