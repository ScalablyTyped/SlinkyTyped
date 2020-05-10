package typingsSlinky.pulumiAws.getAvailabilityZonesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAvailabilityZonesResult extends js.Object {
  val blacklistedNames: js.UndefOr[js.Array[String]] = js.native
  val blacklistedZoneIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * A list of the Availability Zone names available to the account.
    */
  val names: js.Array[String] = js.native
  val state: js.UndefOr[String] = js.native
  /**
    * A list of the Availability Zone IDs available to the account.
    */
  val zoneIds: js.Array[String] = js.native
}

object GetAvailabilityZonesResult {
  @scala.inline
  def apply(id: String, names: js.Array[String], zoneIds: js.Array[String]): GetAvailabilityZonesResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], zoneIds = zoneIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAvailabilityZonesResult]
  }
  @scala.inline
  implicit class GetAvailabilityZonesResultOps[Self <: GetAvailabilityZonesResult] (val x: Self) extends AnyVal {
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
    def withNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoneIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlacklistedNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklistedNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlacklistedNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklistedNames")(js.undefined)
        ret
    }
    @scala.inline
    def withBlacklistedZoneIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklistedZoneIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlacklistedZoneIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklistedZoneIds")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

