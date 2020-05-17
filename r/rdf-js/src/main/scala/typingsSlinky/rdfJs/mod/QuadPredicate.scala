package typingsSlinky.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rdfJs.mod.NamedNode
  - typingsSlinky.rdfJs.mod.Variable
*/
trait QuadPredicate extends js.Object

object QuadPredicate {
  @scala.inline
  implicit def apply(value: NamedNode): QuadPredicate = value.asInstanceOf[QuadPredicate]
  @scala.inline
  implicit def apply(value: Variable): QuadPredicate = value.asInstanceOf[QuadPredicate]
}

