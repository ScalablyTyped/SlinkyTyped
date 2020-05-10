package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Security extends Entity {
  // Read-only. Nullable.
  var alerts: js.UndefOr[js.Array[Alert]] = js.native
  var secureScoreControlProfiles: js.UndefOr[js.Array[SecureScoreControlProfile]] = js.native
  var secureScores: js.UndefOr[js.Array[SecureScore]] = js.native
}

object Security {
  @scala.inline
  def apply(): Security = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Security]
  }
  @scala.inline
  implicit class SecurityOps[Self <: Security] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlerts(value: js.Array[Alert]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlerts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alerts")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureScoreControlProfiles(value: js.Array[SecureScoreControlProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureScoreControlProfiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureScoreControlProfiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureScoreControlProfiles")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureScores(value: js.Array[SecureScore]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureScores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureScores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureScores")(js.undefined)
        ret
    }
  }
  
}

