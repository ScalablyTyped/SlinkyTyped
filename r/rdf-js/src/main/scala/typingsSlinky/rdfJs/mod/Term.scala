package typingsSlinky.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rdfJs.mod.NamedNode
  - typingsSlinky.rdfJs.mod.BlankNode
  - typingsSlinky.rdfJs.mod.Literal
  - typingsSlinky.rdfJs.mod.Variable
  - typingsSlinky.rdfJs.mod.DefaultGraph
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

