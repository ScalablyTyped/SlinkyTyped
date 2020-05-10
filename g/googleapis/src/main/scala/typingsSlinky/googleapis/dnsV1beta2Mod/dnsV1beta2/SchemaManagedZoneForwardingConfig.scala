package typingsSlinky.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedZoneForwardingConfig extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZoneForwardingConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var targetNameServers: js.UndefOr[js.Array[SchemaManagedZoneForwardingConfigNameServerTarget]] = js.native
}

object SchemaManagedZoneForwardingConfig {
  @scala.inline
  def apply(): SchemaManagedZoneForwardingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZoneForwardingConfig]
  }
  @scala.inline
  implicit class SchemaManagedZoneForwardingConfigOps[Self <: SchemaManagedZoneForwardingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withTargetNameServers(value: js.Array[SchemaManagedZoneForwardingConfigNameServerTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetNameServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetNameServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetNameServers")(js.undefined)
        ret
    }
  }
  
}

