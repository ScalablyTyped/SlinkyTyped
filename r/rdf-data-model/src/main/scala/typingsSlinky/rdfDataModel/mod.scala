package typingsSlinky.rdfDataModel

import typingsSlinky.rdfJs.mod.BlankNode
import typingsSlinky.rdfJs.mod.DefaultGraph
import typingsSlinky.rdfJs.mod.Literal
import typingsSlinky.rdfJs.mod.NamedNode
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.Term
import typingsSlinky.rdfJs.mod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-data-model", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val defaultGraphInstance: DefaultGraph = js.native
  def blankNode(): BlankNode = js.native
  def blankNode(value: String): BlankNode = js.native
  def defaultGraph(): DefaultGraph = js.native
  def literal(value: String): Literal = js.native
  def literal(value: String, languageOrDatatype: String): Literal = js.native
  def literal(value: String, languageOrDatatype: NamedNode[String]): Literal = js.native
  def namedNode(value: String): NamedNode[String] = js.native
  def quad(subject: Term, predicate: Term, `object`: Term): Quad = js.native
  def quad(subject: Term, predicate: Term, `object`: Term, graph: Term): Quad = js.native
  def triple(subject: Term, predicate: Term, `object`: Term): Quad = js.native
  def variable(value: String): Variable = js.native
}

