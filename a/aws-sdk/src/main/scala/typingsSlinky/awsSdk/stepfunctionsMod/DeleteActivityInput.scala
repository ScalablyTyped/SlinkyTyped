package typingsSlinky.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteActivityInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the activity to delete.
    */
  var activityArn: Arn = js.native
}
object DeleteActivityInput {
  
  @scala.inline
  def apply(activityArn: Arn): DeleteActivityInput = {
    val __obj = js.Dynamic.literal(activityArn = activityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteActivityInput]
  }
  
  @scala.inline
  implicit class DeleteActivityInputMutableBuilder[Self <: DeleteActivityInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityArn(value: Arn): Self = StObject.set(x, "activityArn", value.asInstanceOf[js.Any])
  }
}
