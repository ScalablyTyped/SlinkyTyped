package typingsSlinky.awsSdk.pricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAttributeValuesResponse extends js.Object {
  /**
    * The list of values for an attribute. For example, Throughput Optimized HDD and Provisioned IOPS are two available values for the AmazonEC2 volumeType.
    */
  var AttributeValues: js.UndefOr[AttributeValueList] = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object GetAttributeValuesResponse {
  @scala.inline
  def apply(): GetAttributeValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAttributeValuesResponse]
  }
  @scala.inline
  implicit class GetAttributeValuesResponseOps[Self <: GetAttributeValuesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeValues(value: AttributeValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeValues")(js.undefined)
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

