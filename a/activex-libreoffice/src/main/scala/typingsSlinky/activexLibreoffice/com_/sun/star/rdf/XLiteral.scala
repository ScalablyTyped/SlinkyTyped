package typingsSlinky.activexLibreoffice.com_.sun.star.rdf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a literal that may occur in a RDF graph.
  *
  * RDF literals may come in three varieties: just a string ValueValue and Languagetyped literal: Value and Datatype (represented by an {@link URI} ) Note
  * that there is no literal with both Language and Datatype.
  * @see XRepository
  * @since OOo 3.0
  */
@js.native
trait XLiteral extends XNode {
  
  var Datatype: XURI = js.native
  
  var Language: String = js.native
  
  var Value: String = js.native
}
object XLiteral {
  
  @scala.inline
  def apply(Datatype: XURI, Language: String, StringValue: String, Value: String): XLiteral = {
    val __obj = js.Dynamic.literal(Datatype = Datatype.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[XLiteral]
  }
  
  @scala.inline
  implicit class XLiteralMutableBuilder[Self <: XLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatatype(value: XURI): Self = StObject.set(x, "Datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
