package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the list of variables in an app.
  */
@js.native
trait IVariableListDef extends StObject {
  
  /**
    * Data Type JSON
    */
  var qData: js.Any = js.native
  
  /**
    * Shows the system variables if set to true.
    */
  var qShowConfig: Boolean = js.native
  
  /**
    * Shows the reserved variables if set to true.
    */
  var qShowReserved: Boolean = js.native
  
  /**
    * Type of the list.
    */
  var qType: String = js.native
}
object IVariableListDef {
  
  @scala.inline
  def apply(qData: js.Any, qShowConfig: Boolean, qShowReserved: Boolean, qType: String): IVariableListDef = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qShowConfig = qShowConfig.asInstanceOf[js.Any], qShowReserved = qShowReserved.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVariableListDef]
  }
  
  @scala.inline
  implicit class IVariableListDefMutableBuilder[Self <: IVariableListDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQData(value: js.Any): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQShowConfig(value: Boolean): Self = StObject.set(x, "qShowConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQShowReserved(value: Boolean): Self = StObject.set(x, "qShowReserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: String): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}
