package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Win32LobAppReturnCode extends StObject {
  
  // Return code.
  var returnCode: js.UndefOr[Double] = js.native
  
  // The type of return code. Possible values are: failed, success, softReboot, hardReboot, retry.
  var `type`: js.UndefOr[Win32LobAppReturnCodeType] = js.native
}
object Win32LobAppReturnCode {
  
  @scala.inline
  def apply(): Win32LobAppReturnCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppReturnCode]
  }
  
  @scala.inline
  implicit class Win32LobAppReturnCodeMutableBuilder[Self <: Win32LobAppReturnCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturnCode(value: Double): Self = StObject.set(x, "returnCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnCodeUndefined: Self = StObject.set(x, "returnCode", js.undefined)
    
    @scala.inline
    def setType(value: Win32LobAppReturnCodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
