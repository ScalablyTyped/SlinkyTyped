package typingsSlinky.clownface.clownfaceMod

import typingsSlinky.rdfDashJs.rdfDashJsMod.BlankNode
import typingsSlinky.rdfDashJs.rdfDashJsMod.DatasetCore
import typingsSlinky.rdfDashJs.rdfDashJsMod.Literal
import typingsSlinky.rdfDashJs.rdfDashJsMod.NamedNode
import typingsSlinky.rdfDashJs.rdfDashJsMod.Quad
import typingsSlinky.rdfDashJs.rdfDashJsMod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafeClownface[D /* <: DatasetCore[Quad] */, T /* <: Term */] extends Clownface[D, T] {
  def blankNode(values: js.Array[String]): SafeClownface[D, BlankNode] = js.native
  def literal(values: js.Array[Boolean | String | Double | Term | Null]): SafeClownface[D, Literal] = js.native
  def literal(values: js.Array[Boolean | String | Double | Term | Null], languageOrDatatype: String): SafeClownface[D, Literal] = js.native
  def literal(values: js.Array[Boolean | String | Double | Term | Null], languageOrDatatype: NamedNode): SafeClownface[D, Literal] = js.native
  def namedNode(values: js.Array[String | NamedNode]): SafeClownface[D, NamedNode] = js.native
  def node[X /* <: Term */](values: js.Array[Boolean | String | Double | Term | Null]): SafeClownface[D, X] = js.native
  def node[X /* <: Term */](values: js.Array[Boolean | String | Double | Term | Null], options: NodeOptions): SafeClownface[D, X] = js.native
}

