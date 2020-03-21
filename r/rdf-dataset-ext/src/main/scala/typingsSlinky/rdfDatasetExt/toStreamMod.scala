package typingsSlinky.rdfDatasetExt

import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-dataset-ext/toStream", JSImport.Namespace)
@js.native
object toStreamMod extends js.Object {
  def apply[Q /* <: BaseQuad */](dataset: DatasetCore[Q, Q]): Stream[Q] = js.native
}

