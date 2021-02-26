package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxRange...
  */
@js.native
trait INxRange extends StObject {
  
  /**
    * Position in the expression of the first character of the field name.
    */
  var qCount: Double = js.native
  
  /**
    * Number of characters in the field name.
    */
  var qFrom: Double = js.native
}
object INxRange {
  
  @scala.inline
  def apply(qCount: Double, qFrom: Double): INxRange = {
    val __obj = js.Dynamic.literal(qCount = qCount.asInstanceOf[js.Any], qFrom = qFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxRange]
  }
  
  @scala.inline
  implicit class INxRangeMutableBuilder[Self <: INxRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQCount(value: Double): Self = StObject.set(x, "qCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFrom(value: Double): Self = StObject.set(x, "qFrom", value.asInstanceOf[js.Any])
  }
}
