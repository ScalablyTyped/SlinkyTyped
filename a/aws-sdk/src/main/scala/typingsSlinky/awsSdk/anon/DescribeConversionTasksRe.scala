package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.ec2Mod.Boolean
import typingsSlinky.awsSdk.ec2Mod.ConversionIdStringList
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeConversionTasksRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeConversionTasksRe extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The conversion task IDs.
    */
  var ConversionTaskIds: js.UndefOr[ConversionIdStringList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}

object DescribeConversionTasksRe {
  @scala.inline
  def apply(): DescribeConversionTasksRe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConversionTasksRe]
  }
  @scala.inline
  implicit class DescribeConversionTasksReOps[Self <: DescribeConversionTasksRe] (val x: Self) extends AnyVal {
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
    def withConversionTaskIds(value: ConversionIdStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConversionTaskIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversionTaskIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConversionTaskIds")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
  }
  
}

