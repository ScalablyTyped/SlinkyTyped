package typingsSlinky.rdfDatasetIndexed

import typingsSlinky.rdfDatasetIndexed.datasetMod.DatasetIndexed
import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.DataFactory
import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.DatasetCoreFactory
import typingsSlinky.rdfJs.mod.Quad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rdf-dataset-indexed", JSImport.Namespace)
  @js.native
  def apply[Q /* <: BaseQuad */](): DatasetIndexed[Q, Quad] = js.native
  @JSImport("rdf-dataset-indexed", JSImport.Namespace)
  @js.native
  def apply[Q /* <: BaseQuad */](
    quads: js.UndefOr[scala.Nothing],
    dataFactory: (DataFactory[Q, Q]) with (DatasetCoreFactory[Q, Q, DatasetCore[Q, Q]])
  ): DatasetIndexed[Q, Quad] = js.native
  @JSImport("rdf-dataset-indexed", JSImport.Namespace)
  @js.native
  def apply[Q /* <: BaseQuad */](quads: js.Array[Q]): DatasetIndexed[Q, Quad] = js.native
  @JSImport("rdf-dataset-indexed", JSImport.Namespace)
  @js.native
  def apply[Q /* <: BaseQuad */](
    quads: js.Array[Q],
    dataFactory: (DataFactory[Q, Q]) with (DatasetCoreFactory[Q, Q, DatasetCore[Q, Q]])
  ): DatasetIndexed[Q, Quad] = js.native
}
