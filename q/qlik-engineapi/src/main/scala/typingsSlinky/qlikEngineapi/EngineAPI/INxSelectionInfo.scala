package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxSelectionInfo...
  */
@js.native
trait INxSelectionInfo extends StObject {
  
  /**
    * Is set to true if the visualization is in selection mode.
    * For more information about the selection mode
    */
  var qInSelections: Boolean = js.native
  
  /**
    * Is set to true if the visualization is in selection mode
    * and if some selections have been made while in selection mode.
    */
  var qMadeSelections: Boolean = js.native
}
object INxSelectionInfo {
  
  @scala.inline
  def apply(qInSelections: Boolean, qMadeSelections: Boolean): INxSelectionInfo = {
    val __obj = js.Dynamic.literal(qInSelections = qInSelections.asInstanceOf[js.Any], qMadeSelections = qMadeSelections.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxSelectionInfo]
  }
  
  @scala.inline
  implicit class INxSelectionInfoMutableBuilder[Self <: INxSelectionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQInSelections(value: Boolean): Self = StObject.set(x, "qInSelections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMadeSelections(value: Boolean): Self = StObject.set(x, "qMadeSelections", value.asInstanceOf[js.Any])
  }
}
