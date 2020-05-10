package typingsSlinky.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedZoneForwardingConfigNameServerTarget extends js.Object {
  var ipv4Address: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZoneForwardingConfigNameServerTarget&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaManagedZoneForwardingConfigNameServerTarget {
  @scala.inline
  def apply(): SchemaManagedZoneForwardingConfigNameServerTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZoneForwardingConfigNameServerTarget]
  }
  @scala.inline
  implicit class SchemaManagedZoneForwardingConfigNameServerTargetOps[Self <: SchemaManagedZoneForwardingConfigNameServerTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpv4Address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv4Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv4Address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv4Address")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

