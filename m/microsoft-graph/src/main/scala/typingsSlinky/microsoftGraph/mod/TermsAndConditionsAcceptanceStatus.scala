package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TermsAndConditionsAcceptanceStatus extends Entity {
  // DateTime when the terms were last accepted by the user.
  var acceptedDateTime: js.UndefOr[String] = js.native
  // Most recent version number of the T&amp;C accepted by the user.
  var acceptedVersion: js.UndefOr[Double] = js.native
  // Navigation link to the terms and conditions that are assigned.
  var termsAndConditions: js.UndefOr[TermsAndConditions] = js.native
  // Display name of the user whose acceptance the entity represents.
  var userDisplayName: js.UndefOr[String] = js.native
}

object TermsAndConditionsAcceptanceStatus {
  @scala.inline
  def apply(): TermsAndConditionsAcceptanceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TermsAndConditionsAcceptanceStatus]
  }
  @scala.inline
  implicit class TermsAndConditionsAcceptanceStatusOps[Self <: TermsAndConditionsAcceptanceStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAcceptedVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptedVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withTermsAndConditions(value: TermsAndConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termsAndConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTermsAndConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termsAndConditions")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDisplayName")(js.undefined)
        ret
    }
  }
  
}

