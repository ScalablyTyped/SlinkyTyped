package typingsSlinky.awsSdk.pricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServicesResponse extends js.Object {
  /**
    * The format version of the response. For example, aws_v1.
    */
  var FormatVersion: js.UndefOr[String] = js.native
  /**
    * The pagination token for the next set of retreivable results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The service metadata for the service or services in the response.
    */
  var Services: js.UndefOr[ServiceList] = js.native
}

object DescribeServicesResponse {
  @scala.inline
  def apply(): DescribeServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServicesResponse]
  }
  @scala.inline
  implicit class DescribeServicesResponseOps[Self <: DescribeServicesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FormatVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FormatVersion")(js.undefined)
        ret
    }
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
    def withServices(value: ServiceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Services")(js.undefined)
        ret
    }
  }
  
}

