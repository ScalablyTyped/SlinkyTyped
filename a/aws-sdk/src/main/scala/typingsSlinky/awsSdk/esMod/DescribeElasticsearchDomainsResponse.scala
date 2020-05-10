package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticsearchDomainsResponse extends js.Object {
  /**
    * The status of the domains requested in the DescribeElasticsearchDomains request.
    */
  var DomainStatusList: ElasticsearchDomainStatusList = js.native
}

object DescribeElasticsearchDomainsResponse {
  @scala.inline
  def apply(DomainStatusList: ElasticsearchDomainStatusList): DescribeElasticsearchDomainsResponse = {
    val __obj = js.Dynamic.literal(DomainStatusList = DomainStatusList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchDomainsResponse]
  }
  @scala.inline
  implicit class DescribeElasticsearchDomainsResponseOps[Self <: DescribeElasticsearchDomainsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainStatusList(value: ElasticsearchDomainStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainStatusList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

