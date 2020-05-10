package typingsSlinky.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedZonePeeringConfig extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZonePeeringConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var targetNetwork: js.UndefOr[SchemaManagedZonePeeringConfigTargetNetwork] = js.native
}

object SchemaManagedZonePeeringConfig {
  @scala.inline
  def apply(): SchemaManagedZonePeeringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZonePeeringConfig]
  }
  @scala.inline
  implicit class SchemaManagedZonePeeringConfigOps[Self <: SchemaManagedZonePeeringConfig] (val x: Self) extends AnyVal {
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
    def withTargetNetwork(value: SchemaManagedZonePeeringConfigTargetNetwork): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetNetwork")(js.undefined)
        ret
    }
  }
  
}

