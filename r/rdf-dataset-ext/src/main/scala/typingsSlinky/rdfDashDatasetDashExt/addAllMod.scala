package typingsSlinky.rdfDashDatasetDashExt

import typingsSlinky.rdfDashJs.rdfDashJsMod.BaseQuad
import typingsSlinky.rdfDashJs.rdfDashJsMod.DatasetCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-dataset-ext/addAll", JSImport.Namespace)
@js.native
object addAllMod extends js.Object {
  def apply[Q /* <: BaseQuad */, D /* <: DatasetCore[Q] */](dataset: D, iterable: js.Iterable[Q]): D = js.native
}

