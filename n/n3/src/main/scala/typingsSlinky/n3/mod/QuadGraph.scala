package typingsSlinky.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.n3.mod.DefaultGraph
  - typingsSlinky.n3.mod.NamedNode
  - typingsSlinky.n3.mod.BlankNode
  - typingsSlinky.n3.mod.Variable
*/
trait QuadGraph extends js.Object

object QuadGraph {
  @scala.inline
  implicit def apply(value: BlankNode): QuadGraph = value.asInstanceOf[QuadGraph]
  @scala.inline
  implicit def apply(value: DefaultGraph): QuadGraph = value.asInstanceOf[QuadGraph]
  @scala.inline
  implicit def apply(value: NamedNode): QuadGraph = value.asInstanceOf[QuadGraph]
  @scala.inline
  implicit def apply(value: Variable): QuadGraph = value.asInstanceOf[QuadGraph]
}

