package typingsSlinky.pulumiAws.outputMod.wafregional

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XssMatchSetXssMatchTuple extends StObject {
  
  /**
    * Specifies where in a web request to look for cross-site scripting attacks.
    */
  var fieldToMatch: XssMatchSetXssMatchTupleFieldToMatch = js.native
  
  /**
    * Which text transformation, if any, to perform on the web request before inspecting the request for cross-site scripting attacks.
    */
  var textTransformation: String = js.native
}
object XssMatchSetXssMatchTuple {
  
  @scala.inline
  def apply(fieldToMatch: XssMatchSetXssMatchTupleFieldToMatch, textTransformation: String): XssMatchSetXssMatchTuple = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[XssMatchSetXssMatchTuple]
  }
  
  @scala.inline
  implicit class XssMatchSetXssMatchTupleMutableBuilder[Self <: XssMatchSetXssMatchTuple] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldToMatch(value: XssMatchSetXssMatchTupleFieldToMatch): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformation(value: String): Self = StObject.set(x, "textTransformation", value.asInstanceOf[js.Any])
  }
}
