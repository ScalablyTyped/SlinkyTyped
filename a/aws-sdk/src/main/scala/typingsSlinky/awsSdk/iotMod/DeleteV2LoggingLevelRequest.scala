package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteV2LoggingLevelRequest extends StObject {
  
  /**
    * The name of the resource for which you are configuring logging.
    */
  var targetName: LogTargetName = js.native
  
  /**
    * The type of resource for which you are configuring logging. Must be THING_Group.
    */
  var targetType: LogTargetType = js.native
}
object DeleteV2LoggingLevelRequest {
  
  @scala.inline
  def apply(targetName: LogTargetName, targetType: LogTargetType): DeleteV2LoggingLevelRequest = {
    val __obj = js.Dynamic.literal(targetName = targetName.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteV2LoggingLevelRequest]
  }
  
  @scala.inline
  implicit class DeleteV2LoggingLevelRequestMutableBuilder[Self <: DeleteV2LoggingLevelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetName(value: LogTargetName): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetType(value: LogTargetType): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
  }
}
