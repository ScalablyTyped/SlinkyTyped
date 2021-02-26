package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstancePatchStatesForPatchGroupResult extends StObject {
  
  /**
    * The high-level patch state for the requested instances. 
    */
  var InstancePatchStates: js.UndefOr[InstancePatchStatesList] = js.native
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
}
object DescribeInstancePatchStatesForPatchGroupResult {
  
  @scala.inline
  def apply(): DescribeInstancePatchStatesForPatchGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancePatchStatesForPatchGroupResult]
  }
  
  @scala.inline
  implicit class DescribeInstancePatchStatesForPatchGroupResultMutableBuilder[Self <: DescribeInstancePatchStatesForPatchGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstancePatchStates(value: InstancePatchStatesList): Self = StObject.set(x, "InstancePatchStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancePatchStatesUndefined: Self = StObject.set(x, "InstancePatchStates", js.undefined)
    
    @scala.inline
    def setInstancePatchStatesVarargs(value: InstancePatchState*): Self = StObject.set(x, "InstancePatchStates", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
