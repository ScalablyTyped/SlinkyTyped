package typingsSlinky.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateChangeSetOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the change set.
    */
  var Id: js.UndefOr[ChangeSetId] = js.native
  
  /**
    * The unique ID of the stack.
    */
  var StackId: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackId] = js.native
}
object CreateChangeSetOutput {
  
  @scala.inline
  def apply(): CreateChangeSetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChangeSetOutput]
  }
  
  @scala.inline
  implicit class CreateChangeSetOutputMutableBuilder[Self <: CreateChangeSetOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ChangeSetId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setStackId(value: StackId): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
