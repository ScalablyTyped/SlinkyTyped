package typingsSlinky.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.n3.mod.NamedNode
  - typingsSlinky.n3.mod.BlankNode
  - typingsSlinky.n3.mod.Variable
*/
trait QuadSubject extends js.Object

object QuadSubject {
  @scala.inline
  implicit def apply(value: BlankNode): QuadSubject = value.asInstanceOf[QuadSubject]
  @scala.inline
  implicit def apply(value: NamedNode): QuadSubject = value.asInstanceOf[QuadSubject]
  @scala.inline
  implicit def apply(value: Variable): QuadSubject = value.asInstanceOf[QuadSubject]
}

