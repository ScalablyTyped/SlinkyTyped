package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DoReloadExResult...
  */
@js.native
trait IDoReloadExResult extends StObject {
  
  /**
    * Path to the script log file.
    */
  var qScriptLogFile: String = js.native
  
  /**
    * The operation is successful if qSuccess is set to True.
    */
  var qSuccess: Boolean = js.native
}
object IDoReloadExResult {
  
  @scala.inline
  def apply(qScriptLogFile: String, qSuccess: Boolean): IDoReloadExResult = {
    val __obj = js.Dynamic.literal(qScriptLogFile = qScriptLogFile.asInstanceOf[js.Any], qSuccess = qSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDoReloadExResult]
  }
  
  @scala.inline
  implicit class IDoReloadExResultMutableBuilder[Self <: IDoReloadExResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQScriptLogFile(value: String): Self = StObject.set(x, "qScriptLogFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSuccess(value: Boolean): Self = StObject.set(x, "qSuccess", value.asInstanceOf[js.Any])
  }
}
