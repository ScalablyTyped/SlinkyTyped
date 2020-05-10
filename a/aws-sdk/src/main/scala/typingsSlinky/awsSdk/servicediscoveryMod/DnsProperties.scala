package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DnsProperties extends js.Object {
  /**
    * The ID for the Route 53 hosted zone that AWS Cloud Map creates when you create a namespace.
    */
  var HostedZoneId: js.UndefOr[ResourceId] = js.native
}

object DnsProperties {
  @scala.inline
  def apply(): DnsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsProperties]
  }
  @scala.inline
  implicit class DnsPropertiesOps[Self <: DnsProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostedZoneId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostedZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostedZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostedZoneId")(js.undefined)
        ret
    }
  }
  
}

