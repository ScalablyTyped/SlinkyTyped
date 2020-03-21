package typingsSlinky.clownface.mod

import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleContextClownface[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */] extends SafeClownface[D, T] {
  @JSName("term")
  val term_SingleContextClownface: T = js.native
  @JSName("value")
  val value_SingleContextClownface: String = js.native
}

