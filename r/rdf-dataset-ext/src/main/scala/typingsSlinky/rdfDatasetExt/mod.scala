package typingsSlinky.rdfDatasetExt

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.Stream
import typingsSlinky.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdf-dataset-ext", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addAll[Q /* <: BaseQuad */, D /* <: DatasetCore[Q, Q] */](dataset: D, iterable: js.Iterable[Q]): D = js.native
  
  def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D): D = js.native
  def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](
    dataset: D,
    subject: js.UndefOr[Term],
    predicate: js.UndefOr[Term],
    `object`: js.UndefOr[Term],
    graph: Term
  ): D = js.native
  def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: js.UndefOr[Term], predicate: js.UndefOr[Term], `object`: Term): D = js.native
  def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: js.UndefOr[Term], predicate: Term): D = js.native
  def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term): D = js.native
  
  def equals(a: DatasetCore[BaseQuad, BaseQuad], b: DatasetCore[BaseQuad, BaseQuad]): Boolean = js.native
  
  def fromStream[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, stream: EventEmitter): js.Promise[D] = js.native
  
  def toCanonical(dataset: DatasetCore[BaseQuad, BaseQuad]): String = js.native
  
  def toStream[Q /* <: BaseQuad */](dataset: DatasetCore[Q, Q]): Stream[Q] = js.native
}
