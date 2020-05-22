package typingsSlinky.rdflib.tfTypesMod

import typingsSlinky.rdflib.rdflibStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rdflib.tfTypesMod.NamedNode
  - typingsSlinky.rdflib.tfTypesMod.DefaultGraph
  - typingsSlinky.rdflib.tfTypesMod.BlankNode
  - typingsSlinky.rdflib.tfTypesMod.Variable
*/
trait QuadGraph extends js.Object

object QuadGraph {
  @scala.inline
  def NamedNode(equals: Term => Boolean, termType: typingsSlinky.rdflib.rdflibStrings.NamedNode, value: String): QuadGraph = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadGraph]
  }
  @scala.inline
  def DefaultGraph(equals: Term => Boolean, termType: typingsSlinky.rdflib.rdflibStrings.DefaultGraph, value: _empty): QuadGraph = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadGraph]
  }
  @scala.inline
  def BlankNode(equals: Term => Boolean, termType: typingsSlinky.rdflib.rdflibStrings.BlankNode, value: String): QuadGraph = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadGraph]
  }
  @scala.inline
  def Variable(equals: Term => Boolean, termType: typingsSlinky.rdflib.rdflibStrings.Variable, value: String): QuadGraph = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadGraph]
  }
}

