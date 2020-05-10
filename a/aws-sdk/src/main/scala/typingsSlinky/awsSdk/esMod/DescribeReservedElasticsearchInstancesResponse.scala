package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReservedElasticsearchInstancesResponse extends js.Object {
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * List of reserved Elasticsearch instances.
    */
  var ReservedElasticsearchInstances: js.UndefOr[ReservedElasticsearchInstanceList] = js.native
}

object DescribeReservedElasticsearchInstancesResponse {
  @scala.inline
  def apply(): DescribeReservedElasticsearchInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedElasticsearchInstancesResponse]
  }
  @scala.inline
  implicit class DescribeReservedElasticsearchInstancesResponseOps[Self <: DescribeReservedElasticsearchInstancesResponse] (val x: Self) extends AnyVal {
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
    def withReservedElasticsearchInstances(value: ReservedElasticsearchInstanceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedElasticsearchInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedElasticsearchInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedElasticsearchInstances")(js.undefined)
        ret
    }
  }
  
}

