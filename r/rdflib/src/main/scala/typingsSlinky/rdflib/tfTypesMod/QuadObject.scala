package typingsSlinky.rdflib.tfTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rdflib.tfTypesMod.NamedNode
  - typingsSlinky.rdflib.tfTypesMod.BlankNode
  - typingsSlinky.rdflib.tfTypesMod.Literal
  - typingsSlinky.rdflib.tfTypesMod.Variable
  - typingsSlinky.rdflib.tfTypesMod.Term
*/
trait QuadObject extends js.Object
object QuadObject {
  
  @scala.inline
  def BlankNode(equals: Term => Boolean, termType: typingsSlinky.rdflib.rdflibStrings.BlankNode, value: String): QuadObject = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadObject]
  }
  
  @scala.inline
  def NamedNode(equals: Term => Boolean, termType: typingsSlinky.rdflib.rdflibStrings.NamedNode, value: String): QuadObject = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadObject]
  }
  
  @scala.inline
  def Variable(equals: Term => Boolean, termType: typingsSlinky.rdflib.rdflibStrings.Variable, value: String): QuadObject = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadObject]
  }
  
  @scala.inline
  def Literal(
    datatype: NamedNode,
    equals: Term => Boolean,
    language: String,
    termType: typingsSlinky.rdflib.rdflibStrings.Literal,
    value: String
  ): QuadObject = {
    val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), language = language.asInstanceOf[js.Any], termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadObject]
  }
  
  @scala.inline
  def Term(equals: typingsSlinky.rdflib.tfTypesMod.Term => Boolean, termType: String, value: String): QuadObject = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadObject]
  }
}
