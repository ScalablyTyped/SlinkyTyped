package typingsSlinky.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rdfJs.mod.DefaultGraph
  - typingsSlinky.rdfJs.mod.NamedNode
  - typingsSlinky.rdfJs.mod.BlankNode
  - typingsSlinky.rdfJs.mod.Variable
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

