package typingsSlinky.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.estree.mod.SimpleLiteral
  - typingsSlinky.estree.mod.RegExpLiteral
*/
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.estree.mod.Node because Already inherited */ trait Literal extends Expression

object Literal {
  @scala.inline
  implicit def apply(value: RegExpLiteral): Literal = value.asInstanceOf[Literal]
  @scala.inline
  implicit def apply(value: SimpleLiteral): Literal = value.asInstanceOf[Literal]
}

