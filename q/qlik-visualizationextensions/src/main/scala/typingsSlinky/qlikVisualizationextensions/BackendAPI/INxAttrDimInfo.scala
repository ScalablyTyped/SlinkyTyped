package typingsSlinky.qlikVisualizationextensions.BackendAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INxAttrDimInfo extends StObject {
  
  /**
    * Cardinality of the attribute expression.
    *     Integer
    */
  var qCardinal: Double = js.native
  
  /**
    * Validation error.
    * REF(NxValidationError)
    */
  // ?Type = REF(NxValidationError)?
  var qError: INxValidationError = js.native
  
  /**
    * The title for the attribute dimension.
    * String
    */
  var qFallbackTitle: String = js.native
  
  /**
    * The Locked value of the dimension.
    * Boolean
    */
  var qLocked: Boolean = js.native
  
  /**
    * Number of rows.
    *     Size
    */
  var qSize: Double = js.native
}
object INxAttrDimInfo {
  
  @scala.inline
  def apply(
    qCardinal: Double,
    qError: INxValidationError,
    qFallbackTitle: String,
    qLocked: Boolean,
    qSize: Double
  ): INxAttrDimInfo = {
    val __obj = js.Dynamic.literal(qCardinal = qCardinal.asInstanceOf[js.Any], qError = qError.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qLocked = qLocked.asInstanceOf[js.Any], qSize = qSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAttrDimInfo]
  }
  
  @scala.inline
  implicit class INxAttrDimInfoMutableBuilder[Self <: INxAttrDimInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQCardinal(value: Double): Self = StObject.set(x, "qCardinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQError(value: INxValidationError): Self = StObject.set(x, "qError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFallbackTitle(value: String): Self = StObject.set(x, "qFallbackTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLocked(value: Boolean): Self = StObject.set(x, "qLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSize(value: Double): Self = StObject.set(x, "qSize", value.asInstanceOf[js.Any])
  }
}
