package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainsResponse extends js.Object {
  var DomainStatusList: typingsSlinky.awsSdk.cloudsearchMod.DomainStatusList = js.native
}

object DescribeDomainsResponse {
  @scala.inline
  def apply(DomainStatusList: DomainStatusList): DescribeDomainsResponse = {
    val __obj = js.Dynamic.literal(DomainStatusList = DomainStatusList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainsResponse]
  }
  @scala.inline
  implicit class DescribeDomainsResponseOps[Self <: DescribeDomainsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainStatusList(value: DomainStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainStatusList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

