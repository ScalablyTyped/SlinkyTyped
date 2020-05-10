package typingsSlinky.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedZone extends js.Object {
  var creationTime: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var dnsName: js.UndefOr[String] = js.native
  var dnssecConfig: js.UndefOr[SchemaManagedZoneDnsSecConfig] = js.native
  var forwardingConfig: js.UndefOr[SchemaManagedZoneForwardingConfig] = js.native
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZone&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  var name: js.UndefOr[String] = js.native
  var nameServerSet: js.UndefOr[String] = js.native
  var nameServers: js.UndefOr[js.Array[String]] = js.native
  var peeringConfig: js.UndefOr[SchemaManagedZonePeeringConfig] = js.native
  var privateVisibilityConfig: js.UndefOr[SchemaManagedZonePrivateVisibilityConfig] = js.native
  var visibility: js.UndefOr[String] = js.native
}

object SchemaManagedZone {
  @scala.inline
  def apply(): SchemaManagedZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZone]
  }
  @scala.inline
  implicit class SchemaManagedZoneOps[Self <: SchemaManagedZone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsName")(js.undefined)
        ret
    }
    @scala.inline
    def withDnssecConfig(value: SchemaManagedZoneDnsSecConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnssecConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnssecConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnssecConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardingConfig(value: SchemaManagedZoneForwardingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNameServerSet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameServerSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameServerSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameServerSet")(js.undefined)
        ret
    }
    @scala.inline
    def withNameServers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameServers")(js.undefined)
        ret
    }
    @scala.inline
    def withPeeringConfig(value: SchemaManagedZonePeeringConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peeringConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeeringConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peeringConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateVisibilityConfig(value: SchemaManagedZonePrivateVisibilityConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateVisibilityConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateVisibilityConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateVisibilityConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

