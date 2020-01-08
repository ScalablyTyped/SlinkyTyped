package typingsSlinky.rdfDashDatasetDashExt

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.rdfDashJs.rdfDashJsMod.BaseQuad
import typingsSlinky.rdfDashJs.rdfDashJsMod.DatasetCore
import typingsSlinky.rdfDashJs.rdfDashJsMod.Stream
import typingsSlinky.rdfDashJs.rdfDashJsMod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-dataset-ext", JSImport.Namespace)
@js.native
object rdfDashDatasetDashExtMod extends js.Object {
  def addAll[Q /* <: BaseQuad */, D /* <: DatasetCore[Q] */](dataset: D, iterable: js.Iterable[Q]): D = js.native
  def deleteMatch[D /* <: DatasetCore[BaseQuad] */](dataset: D): D = js.native
  def deleteMatch[D /* <: DatasetCore[BaseQuad] */](dataset: D, subject: Term): D = js.native
  def deleteMatch[D /* <: DatasetCore[BaseQuad] */](dataset: D, subject: Term, predicate: Term): D = js.native
  def deleteMatch[D /* <: DatasetCore[BaseQuad] */](dataset: D, subject: Term, predicate: Term, `object`: Term): D = js.native
  def deleteMatch[D /* <: DatasetCore[BaseQuad] */](dataset: D, subject: Term, predicate: Term, `object`: Term, graph: Term): D = js.native
  def equals(a: DatasetCore[BaseQuad], b: DatasetCore[BaseQuad]): Boolean = js.native
  def fromStream[D /* <: DatasetCore[BaseQuad] */](dataset: D, stream: EventEmitter): js.Promise[D] = js.native
  def toCanonical(dataset: DatasetCore[BaseQuad]): String = js.native
  def toStream[Q /* <: BaseQuad */](dataset: DatasetCore[Q]): Stream[Q] = js.native
}

