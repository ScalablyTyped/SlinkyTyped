package typingsSlinky.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRobotResponse extends StObject {
  
  /**
    * The target architecture of the robot.
    */
  var architecture: js.UndefOr[Architecture] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the robot was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Greengrass group associated with the robot.
    */
  var greengrassGroupId: js.UndefOr[Id] = js.native
  
  /**
    * The name of the robot.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The list of all tags added to the robot.
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object CreateRobotResponse {
  
  @scala.inline
  def apply(): CreateRobotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRobotResponse]
  }
  
  @scala.inline
  implicit class CreateRobotResponseMutableBuilder[Self <: CreateRobotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchitecture(value: Architecture): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setGreengrassGroupId(value: Id): Self = StObject.set(x, "greengrassGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreengrassGroupIdUndefined: Self = StObject.set(x, "greengrassGroupId", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
