package typingsSlinky.pulumiAws.getAvailabilityZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAvailabilityZoneArgs extends js.Object {
  /**
    * The full name of the availability zone to select.
    */
  val name: js.UndefOr[String] = js.native
  /**
    * A specific availability zone state to require. May
    * be any of `"available"`, `"information"` or `"impaired"`.
    */
  val state: js.UndefOr[String] = js.native
  /**
    * The zone ID of the availability zone to select.
    */
  val zoneId: js.UndefOr[String] = js.native
}

object GetAvailabilityZoneArgs {
  @scala.inline
  def apply(): GetAvailabilityZoneArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAvailabilityZoneArgs]
  }
  @scala.inline
  implicit class GetAvailabilityZoneArgsOps[Self <: GetAvailabilityZoneArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneId")(js.undefined)
        ret
    }
  }
  
}

