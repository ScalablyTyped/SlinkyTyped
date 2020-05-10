package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DnsConfigChange extends js.Object {
  /**
    * An array that contains one DnsRecord object for each Route 53 record that you want AWS Cloud Map to create when you register an instance.
    */
  var DnsRecords: DnsRecordList = js.native
}

object DnsConfigChange {
  @scala.inline
  def apply(DnsRecords: DnsRecordList): DnsConfigChange = {
    val __obj = js.Dynamic.literal(DnsRecords = DnsRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnsConfigChange]
  }
  @scala.inline
  implicit class DnsConfigChangeOps[Self <: DnsConfigChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDnsRecords(value: DnsRecordList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsRecords")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

