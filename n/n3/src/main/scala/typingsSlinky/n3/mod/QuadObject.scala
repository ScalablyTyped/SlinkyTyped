package typingsSlinky.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.n3.mod.NamedNode
  - typingsSlinky.n3.mod.Literal
  - typingsSlinky.n3.mod.BlankNode
  - typingsSlinky.n3.mod.Variable
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

