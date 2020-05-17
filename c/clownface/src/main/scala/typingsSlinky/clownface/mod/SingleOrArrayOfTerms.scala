package typingsSlinky.clownface.mod

import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.clownface.mod.SingleOrArray[X]
  - typingsSlinky.clownface.mod.SafeClownface[
X, 
typingsSlinky.rdfJs.mod.DatasetCore[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad]]
*/
trait SingleOrArrayOfTerms[X /* <: Term */] extends js.Object

object SingleOrArrayOfTerms {
  @scala.inline
  implicit def apply[X](value: SafeClownface[X, DatasetCore[Quad, Quad]]): SingleOrArrayOfTerms[X] = value.asInstanceOf[SingleOrArrayOfTerms[X]]
  @scala.inline
  implicit def apply[X](value: SingleOrArray[X]): SingleOrArrayOfTerms[X] = value.asInstanceOf[SingleOrArrayOfTerms[X]]
}

