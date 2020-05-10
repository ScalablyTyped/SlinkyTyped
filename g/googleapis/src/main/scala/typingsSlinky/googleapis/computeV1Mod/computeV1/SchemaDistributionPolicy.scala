package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDistributionPolicy extends js.Object {
  /**
    * Zones where the regional managed instance group will create and manage
    * instances.
    */
  var zones: js.UndefOr[js.Array[SchemaDistributionPolicyZoneConfiguration]] = js.native
}

object SchemaDistributionPolicy {
  @scala.inline
  def apply(): SchemaDistributionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDistributionPolicy]
  }
  @scala.inline
  implicit class SchemaDistributionPolicyOps[Self <: SchemaDistributionPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withZones(value: js.Array[SchemaDistributionPolicyZoneConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zones")(js.undefined)
        ret
    }
  }
  
}

