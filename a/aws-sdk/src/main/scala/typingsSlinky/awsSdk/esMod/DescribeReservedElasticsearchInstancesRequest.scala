package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReservedElasticsearchInstancesRequest extends js.Object {
  /**
    * Set this value to limit the number of results returned. If not specified, defaults to 100.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.esMod.MaxResults] = js.native
  /**
    * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for pagination.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.esMod.NextToken] = js.native
  /**
    * The reserved instance identifier filter value. Use this parameter to show only the reservation that matches the specified reserved Elasticsearch instance ID.
    */
  var ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.native
}

object DescribeReservedElasticsearchInstancesRequest {
  @scala.inline
  def apply(): DescribeReservedElasticsearchInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedElasticsearchInstancesRequest]
  }
  @scala.inline
  implicit class DescribeReservedElasticsearchInstancesRequestOps[Self <: DescribeReservedElasticsearchInstancesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
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
    def withReservedElasticsearchInstanceId(value: GUID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedElasticsearchInstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedElasticsearchInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedElasticsearchInstanceId")(js.undefined)
        ret
    }
  }
  
}

