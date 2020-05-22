package typingsSlinky.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOutpostInput extends js.Object {
  var AvailabilityZone: js.UndefOr[typingsSlinky.awsSdk.outpostsMod.AvailabilityZone] = js.native
  var AvailabilityZoneId: js.UndefOr[typingsSlinky.awsSdk.outpostsMod.AvailabilityZoneId] = js.native
  var Description: js.UndefOr[OutpostDescription] = js.native
  var Name: js.UndefOr[OutpostName] = js.native
  var SiteId: typingsSlinky.awsSdk.outpostsMod.SiteId = js.native
}

object CreateOutpostInput {
  @scala.inline
  def apply(
    SiteId: SiteId,
    AvailabilityZone: AvailabilityZone = null,
    AvailabilityZoneId: AvailabilityZoneId = null,
    Description: OutpostDescription = null,
    Name: OutpostName = null
  ): CreateOutpostInput = {
    val __obj = js.Dynamic.literal(SiteId = SiteId.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (AvailabilityZoneId != null) __obj.updateDynamic("AvailabilityZoneId")(AvailabilityZoneId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOutpostInput]
  }
}

