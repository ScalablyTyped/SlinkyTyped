package typingsSlinky.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceShadowEnrichActivity extends StObject {
  
  /**
    * The name of the attribute that is added to the message.
    */
  var attribute: AttributeName = js.native
  
  /**
    * The name of the deviceShadowEnrich activity.
    */
  var name: ActivityName = js.native
  
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.native
  
  /**
    * The ARN of the role that allows access to the device's shadow.
    */
  var roleArn: RoleArn = js.native
  
  /**
    * The name of the IoT device whose shadow information is added to the message.
    */
  var thingName: AttributeName = js.native
}
object DeviceShadowEnrichActivity {
  
  @scala.inline
  def apply(attribute: AttributeName, name: ActivityName, roleArn: RoleArn, thingName: AttributeName): DeviceShadowEnrichActivity = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceShadowEnrichActivity]
  }
  
  @scala.inline
  implicit class DeviceShadowEnrichActivityMutableBuilder[Self <: DeviceShadowEnrichActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: AttributeName): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ActivityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: ActivityName): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingName(value: AttributeName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
