package typingsSlinky.qlikVisualizationextensions.BackendAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INxStateCounts extends StObject {
  
  /**
    * Number of values in alternative state.
    * Integer
    */
  var qAlternative: Double = js.native
  
  /**
    * Number of values in deselected state.
    * Integer
    */
  var qDeselected: Double = js.native
  
  /**
    * Number of values in excluded state
    * Integer
    */
  var qExcluded: Double = js.native
  
  /**
    * Number of values in locked state.
    * Integer
    */
  var qLocked: Double = js.native
  
  /**
    * Number of values in locked excluded state.
    * Integer
    */
  var qLockedExcluded: Double = js.native
  
  /**
    * Number of values in optional state.
    * Integer
    */
  var qOption: Double = js.native
  
  /**
    * Number of values in selected state.
    * Integer
    */
  var qSelected: Double = js.native
  
  /**
    * Number of values in selected excluded state.
    * Integer
    */
  var qSelectedExcluded: Double = js.native
}
object INxStateCounts {
  
  @scala.inline
  def apply(
    qAlternative: Double,
    qDeselected: Double,
    qExcluded: Double,
    qLocked: Double,
    qLockedExcluded: Double,
    qOption: Double,
    qSelected: Double,
    qSelectedExcluded: Double
  ): INxStateCounts = {
    val __obj = js.Dynamic.literal(qAlternative = qAlternative.asInstanceOf[js.Any], qDeselected = qDeselected.asInstanceOf[js.Any], qExcluded = qExcluded.asInstanceOf[js.Any], qLocked = qLocked.asInstanceOf[js.Any], qLockedExcluded = qLockedExcluded.asInstanceOf[js.Any], qOption = qOption.asInstanceOf[js.Any], qSelected = qSelected.asInstanceOf[js.Any], qSelectedExcluded = qSelectedExcluded.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxStateCounts]
  }
  
  @scala.inline
  implicit class INxStateCountsMutableBuilder[Self <: INxStateCounts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQAlternative(value: Double): Self = StObject.set(x, "qAlternative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDeselected(value: Double): Self = StObject.set(x, "qDeselected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQExcluded(value: Double): Self = StObject.set(x, "qExcluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLocked(value: Double): Self = StObject.set(x, "qLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLockedExcluded(value: Double): Self = StObject.set(x, "qLockedExcluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQOption(value: Double): Self = StObject.set(x, "qOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSelected(value: Double): Self = StObject.set(x, "qSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSelectedExcluded(value: Double): Self = StObject.set(x, "qSelectedExcluded", value.asInstanceOf[js.Any])
  }
}
