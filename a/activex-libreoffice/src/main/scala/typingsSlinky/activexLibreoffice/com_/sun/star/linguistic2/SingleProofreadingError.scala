package typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2

import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * holds a single error found by the proofreader.
  * @since OOo 3.0.1
  */
@js.native
trait SingleProofreadingError extends StObject {
  
  var aFullComment: String = js.native
  
  var aProperties: SafeArray[PropertyValue] = js.native
  
  var aRuleIdentifier: String = js.native
  
  var aShortComment: String = js.native
  
  var aSuggestions: SafeArray[String] = js.native
  
  var nErrorLength: Double = js.native
  
  var nErrorStart: Double = js.native
  
  var nErrorType: Double = js.native
}
object SingleProofreadingError {
  
  @scala.inline
  def apply(
    aFullComment: String,
    aProperties: SafeArray[PropertyValue],
    aRuleIdentifier: String,
    aShortComment: String,
    aSuggestions: SafeArray[String],
    nErrorLength: Double,
    nErrorStart: Double,
    nErrorType: Double
  ): SingleProofreadingError = {
    val __obj = js.Dynamic.literal(aFullComment = aFullComment.asInstanceOf[js.Any], aProperties = aProperties.asInstanceOf[js.Any], aRuleIdentifier = aRuleIdentifier.asInstanceOf[js.Any], aShortComment = aShortComment.asInstanceOf[js.Any], aSuggestions = aSuggestions.asInstanceOf[js.Any], nErrorLength = nErrorLength.asInstanceOf[js.Any], nErrorStart = nErrorStart.asInstanceOf[js.Any], nErrorType = nErrorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleProofreadingError]
  }
  
  @scala.inline
  implicit class SingleProofreadingErrorMutableBuilder[Self <: SingleProofreadingError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAFullComment(value: String): Self = StObject.set(x, "aFullComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAProperties(value: SafeArray[PropertyValue]): Self = StObject.set(x, "aProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARuleIdentifier(value: String): Self = StObject.set(x, "aRuleIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAShortComment(value: String): Self = StObject.set(x, "aShortComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setASuggestions(value: SafeArray[String]): Self = StObject.set(x, "aSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNErrorLength(value: Double): Self = StObject.set(x, "nErrorLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNErrorStart(value: Double): Self = StObject.set(x, "nErrorStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNErrorType(value: Double): Self = StObject.set(x, "nErrorType", value.asInstanceOf[js.Any])
  }
}
