package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplatePlacement extends js.Object {
  var affinity: String = js.native
  var availabilityZone: String = js.native
  var groupName: String = js.native
  var hostId: String = js.native
  var spreadDomain: String = js.native
  var tenancy: String = js.native
}

object GetLaunchTemplatePlacement {
  @scala.inline
  def apply(
    affinity: String,
    availabilityZone: String,
    groupName: String,
    hostId: String,
    spreadDomain: String,
    tenancy: String
  ): GetLaunchTemplatePlacement = {
    val __obj = js.Dynamic.literal(affinity = affinity.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], hostId = hostId.asInstanceOf[js.Any], spreadDomain = spreadDomain.asInstanceOf[js.Any], tenancy = tenancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplatePlacement]
  }
  @scala.inline
  implicit class GetLaunchTemplatePlacementOps[Self <: GetLaunchTemplatePlacement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffinity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpreadDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spreadDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTenancy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenancy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

