package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopApplicationRequest extends StObject {
  
  /**
    * The name of the running application to stop.
    */
  var ApplicationName: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  
  /**
    * Set to true to force the application to stop. If you set Force to true, Kinesis Data Analytics stops the application without taking a snapshot.   Force-stopping your application may lead to data loss or duplication. To prevent data loss or duplicate processing of data during application restarts, we recommend you to take frequent snapshots of your application.  You can only force stop a Flink-based Kinesis Data Analytics application. You can't force stop a SQL-based Kinesis Data Analytics application. The application must be in the STARTING, UPDATING, STOPPING, AUTOSCALING, or RUNNING status. 
    */
  var Force: js.UndefOr[BooleanObject] = js.native
}
object StopApplicationRequest {
  
  @scala.inline
  def apply(ApplicationName: ApplicationName): StopApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopApplicationRequest]
  }
  
  @scala.inline
  implicit class StopApplicationRequestMutableBuilder[Self <: StopApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForce(value: BooleanObject): Self = StObject.set(x, "Force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "Force", js.undefined)
  }
}
