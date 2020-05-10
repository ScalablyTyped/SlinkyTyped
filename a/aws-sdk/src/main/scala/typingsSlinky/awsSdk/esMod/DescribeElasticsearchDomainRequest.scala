package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticsearchDomainRequest extends js.Object {
  /**
    * The name of the Elasticsearch domain for which you want information.
    */
  var DomainName: typingsSlinky.awsSdk.esMod.DomainName = js.native
}

object DescribeElasticsearchDomainRequest {
  @scala.inline
  def apply(DomainName: DomainName): DescribeElasticsearchDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchDomainRequest]
  }
  @scala.inline
  implicit class DescribeElasticsearchDomainRequestOps[Self <: DescribeElasticsearchDomainRequest] (val x: Self) extends AnyVal {
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

