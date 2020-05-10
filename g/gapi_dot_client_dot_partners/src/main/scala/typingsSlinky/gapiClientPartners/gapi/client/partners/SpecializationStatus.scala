package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecializationStatus extends js.Object {
  /** The specialization this status is for. */
  var badgeSpecialization: js.UndefOr[String] = js.native
  /** State of agency specialization. */
  var badgeSpecializationState: js.UndefOr[String] = js.native
}

object SpecializationStatus {
  @scala.inline
  def apply(): SpecializationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecializationStatus]
  }
  @scala.inline
  implicit class SpecializationStatusOps[Self <: SpecializationStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadgeSpecialization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeSpecialization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgeSpecialization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeSpecialization")(js.undefined)
        ret
    }
    @scala.inline
    def withBadgeSpecializationState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeSpecializationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgeSpecializationState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeSpecializationState")(js.undefined)
        ret
    }
  }
  
}

