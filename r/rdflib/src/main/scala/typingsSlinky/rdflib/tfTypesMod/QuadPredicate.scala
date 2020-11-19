package typingsSlinky.rdflib.tfTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rdflib.tfTypesMod.NamedNode
  - typingsSlinky.rdflib.tfTypesMod.Variable
*/
trait QuadPredicate extends js.Object
object QuadPredicate {
  
  @scala.inline
  def NamedNode(equals: Term => Boolean, termType: typingsSlinky.rdflib.rdflibStrings.NamedNode, value: String): QuadPredicate = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadPredicate]
  }
  
  @scala.inline
  def Variable(equals: Term => Boolean, termType: typingsSlinky.rdflib.rdflibStrings.Variable, value: String): QuadPredicate = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadPredicate]
  }
}
