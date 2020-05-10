package typingsSlinky.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventDetailsForOrganizationRequest extends js.Object {
  /**
    * The locale (language) to return information in. English (en) is the default and the only supported value at this time.
    */
  var locale: js.UndefOr[typingsSlinky.awsSdk.healthMod.locale] = js.native
  /**
    * A set of JSON elements that includes the awsAccountId and the eventArn.
    */
  var organizationEventDetailFilters: OrganizationEventDetailFiltersList = js.native
}

object DescribeEventDetailsForOrganizationRequest {
  @scala.inline
  def apply(organizationEventDetailFilters: OrganizationEventDetailFiltersList): DescribeEventDetailsForOrganizationRequest = {
    val __obj = js.Dynamic.literal(organizationEventDetailFilters = organizationEventDetailFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventDetailsForOrganizationRequest]
  }
  @scala.inline
  implicit class DescribeEventDetailsForOrganizationRequestOps[Self <: DescribeEventDetailsForOrganizationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrganizationEventDetailFilters(value: OrganizationEventDetailFiltersList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizationEventDetailFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
  }
  
}

