package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.emrMod.ClusterId
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/emr.DescribeClusterInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeClusterInputwaite extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The identifier of the cluster to describe.
    */
  var ClusterId: typingsSlinky.awsSdk.emrMod.ClusterId = js.native
}

object DescribeClusterInputwaite {
  @scala.inline
  def apply(ClusterId: ClusterId): DescribeClusterInputwaite = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterInputwaite]
  }
  @scala.inline
  implicit class DescribeClusterInputwaiteOps[Self <: DescribeClusterInputwaite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterId(value: ClusterId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

