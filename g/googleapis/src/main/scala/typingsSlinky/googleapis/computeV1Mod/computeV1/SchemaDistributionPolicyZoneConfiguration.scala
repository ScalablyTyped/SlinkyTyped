package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDistributionPolicyZoneConfiguration extends js.Object {
  /**
    * The URL of the zone. The zone must exist in the region where the managed
    * instance group is located.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaDistributionPolicyZoneConfiguration {
  @scala.inline
  def apply(): SchemaDistributionPolicyZoneConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDistributionPolicyZoneConfiguration]
  }
  @scala.inline
  implicit class SchemaDistributionPolicyZoneConfigurationOps[Self <: SchemaDistributionPolicyZoneConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(js.undefined)
        ret
    }
  }
  
}

