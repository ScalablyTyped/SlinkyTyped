package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcEndpointServicesResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the service.
    */
  var ServiceDetails: js.UndefOr[ServiceDetailSet] = js.native
  /**
    * A list of supported services.
    */
  var ServiceNames: js.UndefOr[ValueStringList] = js.native
}

object DescribeVpcEndpointServicesResult {
  @scala.inline
  def apply(): DescribeVpcEndpointServicesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcEndpointServicesResult]
  }
  @scala.inline
  implicit class DescribeVpcEndpointServicesResultOps[Self <: DescribeVpcEndpointServicesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
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
    def withServiceDetails(value: ServiceDetailSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceNames(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceNames")(js.undefined)
        ret
    }
  }
  
}

