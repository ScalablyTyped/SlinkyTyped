package typingsSlinky.rdfDatasetExt

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.DatasetCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdf-dataset-ext/fromStream", JSImport.Namespace)
@js.native
object fromStreamMod extends js.Object {
  
  def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, stream: EventEmitter): js.Promise[D] = js.native
}
