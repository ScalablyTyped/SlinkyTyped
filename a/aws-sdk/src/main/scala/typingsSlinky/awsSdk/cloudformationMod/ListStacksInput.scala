package typingsSlinky.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStacksInput extends StObject {
  
  /**
    * A string that identifies the next page of stacks that you want to retrieve.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.NextToken] = js.native
  
  /**
    * Stack status to use as a filter. Specify one or more stack status codes to list only stacks with the specified status codes. For a complete list of stack status codes, see the StackStatus parameter of the Stack data type.
    */
  var StackStatusFilter: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackStatusFilter] = js.native
}
object ListStacksInput {
  
  @scala.inline
  def apply(): ListStacksInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStacksInput]
  }
  
  @scala.inline
  implicit class ListStacksInputMutableBuilder[Self <: ListStacksInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStackStatusFilter(value: StackStatusFilter): Self = StObject.set(x, "StackStatusFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackStatusFilterUndefined: Self = StObject.set(x, "StackStatusFilter", js.undefined)
    
    @scala.inline
    def setStackStatusFilterVarargs(value: StackStatus*): Self = StObject.set(x, "StackStatusFilter", js.Array(value :_*))
  }
}
