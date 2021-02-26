package typingsSlinky.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectStackDriftInput extends StObject {
  
  /**
    * The logical names of any resources you want to use as filters.
    */
  var LogicalResourceIds: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.LogicalResourceIds] = js.native
  
  /**
    * The name of the stack for which you want to detect drift. 
    */
  var StackName: StackNameOrId = js.native
}
object DetectStackDriftInput {
  
  @scala.inline
  def apply(StackName: StackNameOrId): DetectStackDriftInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectStackDriftInput]
  }
  
  @scala.inline
  implicit class DetectStackDriftInputMutableBuilder[Self <: DetectStackDriftInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogicalResourceIds(value: LogicalResourceIds): Self = StObject.set(x, "LogicalResourceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalResourceIdsUndefined: Self = StObject.set(x, "LogicalResourceIds", js.undefined)
    
    @scala.inline
    def setLogicalResourceIdsVarargs(value: LogicalResourceId*): Self = StObject.set(x, "LogicalResourceIds", js.Array(value :_*))
    
    @scala.inline
    def setStackName(value: StackNameOrId): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
  }
}
