package typingsSlinky.pulumiAws.getAvailabilityZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAvailabilityZoneResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The name of the selected availability zone.
    */
  val name: String = js.native
  /**
    * The part of the AZ name that appears after the region name,
    * uniquely identifying the AZ within its region.
    */
  val nameSuffix: String = js.native
  /**
    * The region where the selected availability zone resides.
    * This is always the region selected on the provider, since this data source
    * searches only within that region.
    */
  val region: String = js.native
  /**
    * The current state of the AZ.
    */
  val state: String = js.native
  /**
    * (Optional) The zone ID of the selected availability zone.
    */
  val zoneId: String = js.native
}

object GetAvailabilityZoneResult {
  @scala.inline
  def apply(id: String, name: String, nameSuffix: String, region: String, state: String, zoneId: String): GetAvailabilityZoneResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameSuffix = nameSuffix.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAvailabilityZoneResult]
  }
  @scala.inline
  implicit class GetAvailabilityZoneResultOps[Self <: GetAvailabilityZoneResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

