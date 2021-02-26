package typingsSlinky.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateActivityOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the created activity.
    */
  var activityArn: Arn = js.native
  
  /**
    * The date the activity is created.
    */
  var creationDate: js.Date = js.native
}
object CreateActivityOutput {
  
  @scala.inline
  def apply(activityArn: Arn, creationDate: js.Date): CreateActivityOutput = {
    val __obj = js.Dynamic.literal(activityArn = activityArn.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateActivityOutput]
  }
  
  @scala.inline
  implicit class CreateActivityOutputMutableBuilder[Self <: CreateActivityOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityArn(value: Arn): Self = StObject.set(x, "activityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
  }
}
