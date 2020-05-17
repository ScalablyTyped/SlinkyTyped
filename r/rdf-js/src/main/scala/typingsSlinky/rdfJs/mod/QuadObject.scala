package typingsSlinky.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rdfJs.mod.NamedNode
  - typingsSlinky.rdfJs.mod.Literal
  - typingsSlinky.rdfJs.mod.BlankNode
  - typingsSlinky.rdfJs.mod.Variable
*/
trait QuadObject extends js.Object

object QuadObject {
  @scala.inline
  implicit def apply(value: BlankNode): QuadObject = value.asInstanceOf[QuadObject]
  @scala.inline
  implicit def apply(value: Literal): QuadObject = value.asInstanceOf[QuadObject]
  @scala.inline
  implicit def apply(value: NamedNode): QuadObject = value.asInstanceOf[QuadObject]
  @scala.inline
  implicit def apply(value: Variable): QuadObject = value.asInstanceOf[QuadObject]
}

