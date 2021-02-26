package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDataflowGraphRequest extends StObject {
  
  /**
    * The Python script to transform.
    */
  var PythonScript: js.UndefOr[typingsSlinky.awsSdk.glueMod.PythonScript] = js.native
}
object GetDataflowGraphRequest {
  
  @scala.inline
  def apply(): GetDataflowGraphRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataflowGraphRequest]
  }
  
  @scala.inline
  implicit class GetDataflowGraphRequestMutableBuilder[Self <: GetDataflowGraphRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPythonScript(value: PythonScript): Self = StObject.set(x, "PythonScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPythonScriptUndefined: Self = StObject.set(x, "PythonScript", js.undefined)
  }
}
