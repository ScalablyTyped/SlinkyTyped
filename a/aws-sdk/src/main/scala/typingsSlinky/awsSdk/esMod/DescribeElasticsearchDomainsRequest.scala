package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticsearchDomainsRequest extends js.Object {
  /**
    * The Elasticsearch domains for which you want information.
    */
  var DomainNames: DomainNameList = js.native
}

object DescribeElasticsearchDomainsRequest {
  @scala.inline
  def apply(DomainNames: DomainNameList): DescribeElasticsearchDomainsRequest = {
    val __obj = js.Dynamic.literal(DomainNames = DomainNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchDomainsRequest]
  }
  @scala.inline
  implicit class DescribeElasticsearchDomainsRequestOps[Self <: DescribeElasticsearchDomainsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainNames(value: DomainNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

