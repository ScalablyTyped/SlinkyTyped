package typingsSlinky.clownface.clownfaceMod

import typingsSlinky.rdfDashJs.rdfDashJsMod.DatasetCore
import typingsSlinky.rdfDashJs.rdfDashJsMod.Quad
import typingsSlinky.rdfDashJs.rdfDashJsMod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clownface", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[D /* <: DatasetCore[Quad] */](options: (ClownfaceInit[D, Term]) with (WithTerm | WithValue)): SafeClownface[D, Term] = js.native
}

