package typingsSlinky.clownface.clownfaceMod

import typingsSlinky.clownface.mod.ClownfaceInit
import typingsSlinky.clownface.mod.WithSingleTerm
import typingsSlinky.clownface.mod.WithSingleValue
import typingsSlinky.clownface.mod.WithTerms
import typingsSlinky.clownface.mod.WithValues
import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.Term
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clownface/lib/Clownface", JSImport.Namespace)
@js.native
class ^[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */] protected () extends Clownface[D, T] {
  def this(options: (ClownfaceInit[DatasetCore[Quad, Quad], Term]) with (Partial[WithSingleTerm[T] | WithTerms[T]]) with (Partial[WithSingleValue | WithValues])) = this()
}

