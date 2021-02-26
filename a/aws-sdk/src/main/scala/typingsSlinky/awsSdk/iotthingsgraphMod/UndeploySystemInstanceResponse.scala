package typingsSlinky.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndeploySystemInstanceResponse extends StObject {
  
  /**
    * An object that contains summary information about the system instance that was removed from its target.
    */
  var summary: js.UndefOr[SystemInstanceSummary] = js.native
}
object UndeploySystemInstanceResponse {
  
  @scala.inline
  def apply(): UndeploySystemInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UndeploySystemInstanceResponse]
  }
  
  @scala.inline
  implicit class UndeploySystemInstanceResponseMutableBuilder[Self <: UndeploySystemInstanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSummary(value: SystemInstanceSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
