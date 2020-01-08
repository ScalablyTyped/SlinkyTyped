package typingsSlinky.rdfDashDatasetDashExt

import typingsSlinky.rdfDashJs.rdfDashJsMod.BaseQuad
import typingsSlinky.rdfDashJs.rdfDashJsMod.DatasetCore
import typingsSlinky.rdfDashJs.rdfDashJsMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-dataset-ext/toStream", JSImport.Namespace)
@js.native
object toStreamMod extends js.Object {
  def apply[Q /* <: BaseQuad */](dataset: DatasetCore[Q]): Stream[Q] = js.native
}

