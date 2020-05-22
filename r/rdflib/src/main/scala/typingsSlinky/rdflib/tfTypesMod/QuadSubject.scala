package typingsSlinky.rdflib.tfTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rdflib.tfTypesMod.NamedNode
  - typingsSlinky.rdflib.tfTypesMod.BlankNode
  - typingsSlinky.rdflib.tfTypesMod.Variable
*/
trait QuadSubject extends js.Object

object QuadSubject {
  @scala.inline
  def NamedNode(equals: Term => Boolean, termType: typingsSlinky.rdflib.rdflibStrings.NamedNode, value: String): QuadSubject = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadSubject]
  }
  @scala.inline
  def BlankNode(equals: Term => Boolean, termType: typingsSlinky.rdflib.rdflibStrings.BlankNode, value: String): QuadSubject = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadSubject]
  }
  @scala.inline
  def Variable(equals: Term => Boolean, termType: typingsSlinky.rdflib.rdflibStrings.Variable, value: String): QuadSubject = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadSubject]
  }
}

