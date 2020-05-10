package typingsSlinky.rdflib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "st")
@js.native
object st extends js.Object {
  def apply(subject: String, predicate: Node, `object`: String, graph: Node): Statement = js.native
  def apply(subject: String, predicate: Node, `object`: Node, graph: Node): Statement = js.native
  def apply(subject: String, predicate: Node, `object`: js.Date, graph: Node): Statement = js.native
  def apply(subject: Node, predicate: Node, `object`: String, graph: Node): Statement = js.native
  def apply(subject: Node, predicate: Node, `object`: Node, graph: Node): Statement = js.native
  def apply(subject: Node, predicate: Node, `object`: js.Date, graph: Node): Statement = js.native
  def apply(subject: js.Date, predicate: Node, `object`: String, graph: Node): Statement = js.native
  def apply(subject: js.Date, predicate: Node, `object`: Node, graph: Node): Statement = js.native
  def apply(subject: js.Date, predicate: Node, `object`: js.Date, graph: Node): Statement = js.native
}

