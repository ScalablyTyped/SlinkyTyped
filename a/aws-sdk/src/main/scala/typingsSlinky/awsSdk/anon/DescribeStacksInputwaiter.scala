package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.cloudformationMod.NextToken
import typingsSlinky.awsSdk.cloudformationMod.StackName
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/cloudformation.DescribeStacksInput & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeStacksInputwaiter extends js.Object {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  
  /**
    * A string that identifies the next page of stacks that you want to retrieve.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.NextToken] = js.native
  
  /**
    * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value.
    */
  var StackName: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackName] = js.native
}
object DescribeStacksInputwaiter {
  
  @scala.inline
  def apply(): DescribeStacksInputwaiter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStacksInputwaiter]
  }
  
  @scala.inline
  implicit class DescribeStacksInputwaiterOps[Self <: DescribeStacksInputwaiter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setStackName(value: StackName): Self = this.set("StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackName: Self = this.set("StackName", js.undefined)
  }
}
