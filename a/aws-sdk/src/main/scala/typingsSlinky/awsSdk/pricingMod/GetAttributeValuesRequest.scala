package typingsSlinky.awsSdk.pricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAttributeValuesRequest extends js.Object {
  /**
    * The name of the attribute that you want to retrieve the values for, such as volumeType.
    */
  var AttributeName: String = js.native
  /**
    * The maximum number of results to return in response.
    */
  var MaxResults: js.UndefOr[BoxedInteger] = js.native
  /**
    * The pagination token that indicates the next set of results that you want to retrieve.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The service code for the service whose attributes you want to retrieve. For example, if you want the retrieve an EC2 attribute, use AmazonEC2.
    */
  var ServiceCode: String = js.native
}

object GetAttributeValuesRequest {
  @scala.inline
  def apply(AttributeName: String, ServiceCode: String): GetAttributeValuesRequest = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAttributeValuesRequest]
  }
  @scala.inline
  implicit class GetAttributeValuesRequestOps[Self <: GetAttributeValuesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: BoxedInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
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
  }
  
}

