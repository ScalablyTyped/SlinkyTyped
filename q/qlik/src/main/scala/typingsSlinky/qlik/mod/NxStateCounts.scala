package typingsSlinky.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxStateCounts extends StObject {
  
  var qAlternative: Double = js.native
  
  var qDeselected: Double = js.native
  
  var qExcluded: Double = js.native
  
  var qLocked: Double = js.native
  
  var qLockedExcluded: Double = js.native
  
  var qOption: Double = js.native
  
  var qSelected: Double = js.native
  
  var qSelectedExcluded: Double = js.native
}
object NxStateCounts {
  
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
  ): NxStateCounts = {
    val __obj = js.Dynamic.literal(qAlternative = qAlternative.asInstanceOf[js.Any], qDeselected = qDeselected.asInstanceOf[js.Any], qExcluded = qExcluded.asInstanceOf[js.Any], qLocked = qLocked.asInstanceOf[js.Any], qLockedExcluded = qLockedExcluded.asInstanceOf[js.Any], qOption = qOption.asInstanceOf[js.Any], qSelected = qSelected.asInstanceOf[js.Any], qSelectedExcluded = qSelectedExcluded.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxStateCounts]
  }
  
  @scala.inline
  implicit class NxStateCountsMutableBuilder[Self <: NxStateCounts] (val x: Self) extends AnyVal {
    
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
