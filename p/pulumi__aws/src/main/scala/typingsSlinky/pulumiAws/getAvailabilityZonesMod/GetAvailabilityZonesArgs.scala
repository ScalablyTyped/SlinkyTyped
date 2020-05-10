package typingsSlinky.pulumiAws.getAvailabilityZonesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAvailabilityZonesArgs extends js.Object {
  /**
    * List of blacklisted Availability Zone names.
    */
  val blacklistedNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of blacklisted Availability Zone IDs.
    */
  val blacklistedZoneIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Allows to filter list of Availability Zones based on their
    * current state. Can be either `"available"`, `"information"`, `"impaired"` or
    * `"unavailable"`. By default the list includes a complete set of Availability Zones
    * to which the underlying AWS account has access, regardless of their state.
    */
  val state: js.UndefOr[String] = js.native
}

object GetAvailabilityZonesArgs {
  @scala.inline
  def apply(): GetAvailabilityZonesArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAvailabilityZonesArgs]
  }
  @scala.inline
  implicit class GetAvailabilityZonesArgsOps[Self <: GetAvailabilityZonesArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

