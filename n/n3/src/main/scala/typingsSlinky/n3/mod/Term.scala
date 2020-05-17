package typingsSlinky.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.n3.mod.NamedNode
  - typingsSlinky.n3.mod.BlankNode
  - typingsSlinky.n3.mod.Literal
  - typingsSlinky.n3.mod.Variable
  - typingsSlinky.n3.mod.DefaultGraph
*/
trait Term extends js.Object

object Term {
  @scala.inline
  implicit def apply(value: BlankNode): Term = value.asInstanceOf[Term]
  @scala.inline
  implicit def apply(value: DefaultGraph): Term = value.asInstanceOf[Term]
  @scala.inline
  implicit def apply(value: Literal): Term = value.asInstanceOf[Term]
  @scala.inline
  implicit def apply(value: NamedNode): Term = value.asInstanceOf[Term]
  @scala.inline
  implicit def apply(value: Variable): Term = value.asInstanceOf[Term]
}

