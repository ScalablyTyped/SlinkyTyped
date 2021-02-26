package typingsSlinky.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateTestReportRequest extends StObject {
  
  /**
    * Specifies the endpoint group to deliver the report to.
    */
  var group: js.UndefOr[String] = js.native
  
  /**
    * Message to be displayed in the report.
    */
  var message: String = js.native
}
object GenerateTestReportRequest {
  
  @scala.inline
  def apply(message: String): GenerateTestReportRequest = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateTestReportRequest]
  }
  
  @scala.inline
  implicit class GenerateTestReportRequestMutableBuilder[Self <: GenerateTestReportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
