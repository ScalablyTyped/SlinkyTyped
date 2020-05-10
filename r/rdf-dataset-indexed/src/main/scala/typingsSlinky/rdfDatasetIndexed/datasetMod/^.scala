package typingsSlinky.rdfDatasetIndexed.datasetMod

import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.DataFactory
import typingsSlinky.rdfJs.mod.Dataset
import typingsSlinky.rdfJs.mod.DatasetFactory
import typingsSlinky.rdfJs.mod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-unnecessary-class
@JSImport("rdf-dataset-indexed/dataset", JSImport.Namespace)
@js.native
class ^[Q /* <: BaseQuad */, InQuad /* <: BaseQuad */] () extends js.Object {
  def this(quads: js.Array[Q]) = this()
  def this(
    quads: js.Array[Q],
    factory: (DataFactory[Quad, Quad]) with (DatasetFactory[Quad, Quad, Dataset[Quad, Quad]])
  ) = this()
}

