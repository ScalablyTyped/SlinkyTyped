package typingsSlinky.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleRunRequest extends StObject {
  
  /**
    * The ARN of an application package to run tests against, created with CreateUpload. See ListUploads.
    */
  var appArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * Information about the settings for the run to be scheduled.
    */
  var configuration: js.UndefOr[ScheduleRunConfiguration] = js.native
  
  /**
    * The ARN of the device pool for the run to be scheduled.
    */
  var devicePoolArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The filter criteria used to dynamically select a set of devices for a test run and the maximum number of devices to be included in the run. Either  devicePoolArn  or  deviceSelectionConfiguration  is required in a request.
    */
  var deviceSelectionConfiguration: js.UndefOr[DeviceSelectionConfiguration] = js.native
  
  /**
    * Specifies configuration information about a test run, such as the execution timeout (in minutes).
    */
  var executionConfiguration: js.UndefOr[ExecutionConfiguration] = js.native
  
  /**
    * The name for the run to be scheduled.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The ARN of the project for the run to be scheduled.
    */
  var projectArn: AmazonResourceName = js.native
  
  /**
    * Information about the test for the run to be scheduled.
    */
  var test: ScheduleRunTest = js.native
}
object ScheduleRunRequest {
  
  @scala.inline
  def apply(projectArn: AmazonResourceName, test: ScheduleRunTest): ScheduleRunRequest = {
    val __obj = js.Dynamic.literal(projectArn = projectArn.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleRunRequest]
  }
  
  @scala.inline
  implicit class ScheduleRunRequestMutableBuilder[Self <: ScheduleRunRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppArn(value: AmazonResourceName): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppArnUndefined: Self = StObject.set(x, "appArn", js.undefined)
    
    @scala.inline
    def setConfiguration(value: ScheduleRunConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setDevicePoolArn(value: AmazonResourceName): Self = StObject.set(x, "devicePoolArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicePoolArnUndefined: Self = StObject.set(x, "devicePoolArn", js.undefined)
    
    @scala.inline
    def setDeviceSelectionConfiguration(value: DeviceSelectionConfiguration): Self = StObject.set(x, "deviceSelectionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceSelectionConfigurationUndefined: Self = StObject.set(x, "deviceSelectionConfiguration", js.undefined)
    
    @scala.inline
    def setExecutionConfiguration(value: ExecutionConfiguration): Self = StObject.set(x, "executionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionConfigurationUndefined: Self = StObject.set(x, "executionConfiguration", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProjectArn(value: AmazonResourceName): Self = StObject.set(x, "projectArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: ScheduleRunTest): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
