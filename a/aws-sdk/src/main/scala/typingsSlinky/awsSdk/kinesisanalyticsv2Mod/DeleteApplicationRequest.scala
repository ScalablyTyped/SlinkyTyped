package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApplicationRequest extends StObject {
  
  /**
    * The name of the application to delete.
    */
  var ApplicationName: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  
  /**
    * Use the DescribeApplication operation to get this value.
    */
  var CreateTimestamp: js.Date = js.native
}
object DeleteApplicationRequest {
  
  @scala.inline
  def apply(ApplicationName: ApplicationName, CreateTimestamp: js.Date): DeleteApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CreateTimestamp = CreateTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationRequest]
  }
  
  @scala.inline
  implicit class DeleteApplicationRequestMutableBuilder[Self <: DeleteApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimestamp(value: js.Date): Self = StObject.set(x, "CreateTimestamp", value.asInstanceOf[js.Any])
  }
}
