package typingsSlinky.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateStateMachineOutput extends StObject {
  
  /**
    * The date and time the state machine was updated.
    */
  var updateDate: js.Date = js.native
}
object UpdateStateMachineOutput {
  
  @scala.inline
  def apply(updateDate: js.Date): UpdateStateMachineOutput = {
    val __obj = js.Dynamic.literal(updateDate = updateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStateMachineOutput]
  }
  
  @scala.inline
  implicit class UpdateStateMachineOutputMutableBuilder[Self <: UpdateStateMachineOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdateDate(value: js.Date): Self = StObject.set(x, "updateDate", value.asInstanceOf[js.Any])
  }
}
