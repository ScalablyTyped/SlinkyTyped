package typingsSlinky.clownface.clownfaceMod

import typingsSlinky.clownface.mod.SingleContextClownface
import typingsSlinky.rdfJs.mod.BlankNode
import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clownface[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */]
  extends typingsSlinky.clownface.mod.Clownface[D, T] {
  def blankNode(value: String): SingleContextClownface[D, BlankNode] = js.native
  @JSName("blankNode")
  def blankNode_SingleContextClownface(value: js.Array[String]): SingleContextClownface[D, BlankNode] = js.native
}

