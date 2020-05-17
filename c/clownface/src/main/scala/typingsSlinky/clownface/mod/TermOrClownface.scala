package typingsSlinky.clownface.mod

import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.clownface.mod.SafeClownface[
X, 
typingsSlinky.rdfJs.mod.DatasetCore[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad]]
  - X
*/
trait TermOrClownface[X /* <: Term */] extends TermOrLiteral[X]

object TermOrClownface {
  @scala.inline
  implicit def apply[X](value: SafeClownface[X, DatasetCore[Quad, Quad]]): TermOrClownface[X] = value.asInstanceOf[TermOrClownface[X]]
  @scala.inline
  implicit def apply[X](value: X): TermOrClownface[X] = value.asInstanceOf[TermOrClownface[X]]
}

