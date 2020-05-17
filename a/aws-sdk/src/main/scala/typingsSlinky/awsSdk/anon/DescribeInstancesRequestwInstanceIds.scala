package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.opsworksMod.String
import typingsSlinky.awsSdk.opsworksMod.Strings
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/opsworks.DescribeInstancesRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeInstancesRequestwInstanceIds extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * An array of instance IDs to be described. If you use this parameter, DescribeInstances returns a description of the specified instances. Otherwise, it returns a description of every instance.
    */
  var InstanceIds: js.UndefOr[Strings] = js.native
  /**
    * A layer ID. If you use this parameter, DescribeInstances returns descriptions of the instances associated with the specified layer.
    */
  var LayerId: js.UndefOr[String] = js.native
  /**
    * A stack ID. If you use this parameter, DescribeInstances returns descriptions of the instances associated with the specified stack.
    */
  var StackId: js.UndefOr[String] = js.native
}

object DescribeInstancesRequestwInstanceIds {
  @scala.inline
  def apply(): DescribeInstancesRequestwInstanceIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancesRequestwInstanceIds]
  }
  @scala.inline
  implicit class DescribeInstancesRequestwInstanceIdsOps[Self <: DescribeInstancesRequestwInstanceIds] (val x: Self) extends AnyVal {
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
    def withInstanceIds(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceIds")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerId")(js.undefined)
        ret
    }
    @scala.inline
    def withStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(js.undefined)
        ret
    }
  }
  
}

