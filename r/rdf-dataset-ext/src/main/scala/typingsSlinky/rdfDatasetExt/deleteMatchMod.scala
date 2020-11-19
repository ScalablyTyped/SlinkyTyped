package typingsSlinky.rdfDatasetExt

import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdf-dataset-ext/deleteMatch", JSImport.Namespace)
@js.native
object deleteMatchMod extends js.Object {
  
  def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D): D = js.native
  def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](
    dataset: D,
    subject: js.UndefOr[Term],
    predicate: js.UndefOr[Term],
    `object`: js.UndefOr[Term],
    graph: Term
  ): D = js.native
  def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: js.UndefOr[Term], predicate: js.UndefOr[Term], `object`: Term): D = js.native
  def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: js.UndefOr[Term], predicate: Term): D = js.native
  def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term): D = js.native
}
