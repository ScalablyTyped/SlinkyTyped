package typingsSlinky.activexLibreoffice.com_.sun.star.rdf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a node that may occur in a RDF graph.
  *
  * In the RDF data model, there are three distinct types of nodes: {@link URIs} , blank nodes, and literals.
  *
  * `XNode; |; |---XLiteral; |; XResource; |; |---XBlankNode; |; XURI`
  * @see XRepository
  * @see Statement
  * @see XResource
  * @see XBlankNode
  * @see XURI
  * @see XLiteral
  * @since OOo 3.0
  */
@js.native
trait XNode extends StObject {
  
  var StringValue: String = js.native
}
object XNode {
  
  @scala.inline
  def apply(StringValue: String): XNode = {
    val __obj = js.Dynamic.literal(StringValue = StringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[XNode]
  }
  
  @scala.inline
  implicit class XNodeMutableBuilder[Self <: XNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
  }
}
