package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.cloudformationMod.NextToken
import typingsSlinky.awsSdk.cloudformationMod.StackName
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/cloudformation.DescribeStacksInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
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
    def with$waiter(value: WaiterConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$waiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withStackName(value: StackName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackName")(js.undefined)
        ret
    }
  }
  
}

