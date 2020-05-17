package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.sagemakerMod.EndpointName
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/sagemaker.DescribeEndpointInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeEndpointInputwait extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The name of the endpoint.
    */
  var EndpointName: typingsSlinky.awsSdk.sagemakerMod.EndpointName = js.native
}

object DescribeEndpointInputwait {
  @scala.inline
  def apply(EndpointName: EndpointName): DescribeEndpointInputwait = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointInputwait]
  }
  @scala.inline
  implicit class DescribeEndpointInputwaitOps[Self <: DescribeEndpointInputwait] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointName(value: EndpointName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointName")(value.asInstanceOf[js.Any])
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

