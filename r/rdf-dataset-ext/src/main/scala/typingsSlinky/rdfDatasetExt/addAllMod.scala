package typingsSlinky.rdfDatasetExt

import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.DatasetCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdf-dataset-ext/addAll", JSImport.Namespace)
@js.native
object addAllMod extends js.Object {
  
  def apply[Q /* <: BaseQuad */, D /* <: DatasetCore[Q, Q] */](dataset: D, iterable: js.Iterable[Q]): D = js.native
}
