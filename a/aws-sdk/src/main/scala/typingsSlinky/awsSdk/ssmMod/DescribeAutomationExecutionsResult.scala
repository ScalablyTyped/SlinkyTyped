package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAutomationExecutionsResult extends StObject {
  
  /**
    * The list of details about each automation execution which has occurred which matches the filter specification, if any.
    */
  var AutomationExecutionMetadataList: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AutomationExecutionMetadataList] = js.native
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
}
object DescribeAutomationExecutionsResult {
  
  @scala.inline
  def apply(): DescribeAutomationExecutionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAutomationExecutionsResult]
  }
  
  @scala.inline
  implicit class DescribeAutomationExecutionsResultMutableBuilder[Self <: DescribeAutomationExecutionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomationExecutionMetadataList(value: AutomationExecutionMetadataList): Self = StObject.set(x, "AutomationExecutionMetadataList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomationExecutionMetadataListUndefined: Self = StObject.set(x, "AutomationExecutionMetadataList", js.undefined)
    
    @scala.inline
    def setAutomationExecutionMetadataListVarargs(value: AutomationExecutionMetadata*): Self = StObject.set(x, "AutomationExecutionMetadataList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
