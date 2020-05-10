package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticsearchDomainConfigRequest extends js.Object {
  /**
    * The Elasticsearch domain that you want to get information about.
    */
  var DomainName: typingsSlinky.awsSdk.esMod.DomainName = js.native
}

object DescribeElasticsearchDomainConfigRequest {
  @scala.inline
  def apply(DomainName: DomainName): DescribeElasticsearchDomainConfigRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchDomainConfigRequest]
  }
  @scala.inline
  implicit class DescribeElasticsearchDomainConfigRequestOps[Self <: DescribeElasticsearchDomainConfigRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

