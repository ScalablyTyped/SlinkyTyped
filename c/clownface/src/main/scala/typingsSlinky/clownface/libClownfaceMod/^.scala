package typingsSlinky.clownface.libClownfaceMod

import typingsSlinky.clownface.clownfaceMod.ClownfaceInit
import typingsSlinky.clownface.clownfaceMod.WithTerm
import typingsSlinky.clownface.clownfaceMod.WithValue
import typingsSlinky.rdfDashJs.rdfDashJsMod.DatasetCore
import typingsSlinky.rdfDashJs.rdfDashJsMod.Quad
import typingsSlinky.rdfDashJs.rdfDashJsMod.Term
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clownface/lib/Clownface", JSImport.Namespace)
@js.native
class ^[D /* <: DatasetCore[Quad] */, T /* <: Term */] protected () extends Clownface[D, T] {
  def this(options: (ClownfaceInit[DatasetCore[Quad], Term]) with Partial[WithTerm] with Partial[WithValue]) = this()
}

