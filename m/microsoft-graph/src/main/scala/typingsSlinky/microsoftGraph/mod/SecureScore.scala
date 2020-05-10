package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecureScore extends Entity {
  // Active user count of the given tenant.
  var activeUserCount: js.UndefOr[Double] = js.native
  /**
    * Average score by different scopes (for example, average by industry, average by seating) and control category
    * (Identity, Data, Device, Apps, Infrastructure) within the scope.
    */
  var averageComparativeScores: js.UndefOr[js.Array[AverageComparativeScore]] = js.native
  // GUID string for tenant ID.
  var azureTenantId: js.UndefOr[String] = js.native
  // Contains tenant scores for a set of controls.
  var controlScores: js.UndefOr[js.Array[ControlScore]] = js.native
  // The date when the entity is created.
  var createdDateTime: js.UndefOr[String] = js.native
  // Tenant current attained score on specified date.
  var currentScore: js.UndefOr[Double] = js.native
  // Microsoft-provided services for the tenant (for example, Exchange online, Skype, Sharepoint).
  var enabledServices: js.UndefOr[js.Array[String]] = js.native
  // Licensed user count of the given tenant.
  var licensedUserCount: js.UndefOr[Double] = js.native
  // Tenant maximum possible score on specified date.
  var maxScore: js.UndefOr[Double] = js.native
  /**
    * Complex type containing details about the security product/service vendor, provider, and subprovider (for example,
    * vendor=Microsoft; provider=SecureScore). Required.
    */
  var vendorInformation: js.UndefOr[SecurityVendorInformation] = js.native
}

object SecureScore {
  @scala.inline
  def apply(): SecureScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureScore]
  }
  @scala.inline
  implicit class SecureScoreOps[Self <: SecureScore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveUserCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeUserCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveUserCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeUserCount")(js.undefined)
        ret
    }
    @scala.inline
    def withAverageComparativeScores(value: js.Array[AverageComparativeScore]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageComparativeScores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverageComparativeScores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageComparativeScores")(js.undefined)
        ret
    }
    @scala.inline
    def withAzureTenantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureTenantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAzureTenantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureTenantId")(js.undefined)
        ret
    }
    @scala.inline
    def withControlScores(value: js.Array[ControlScore]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlScores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlScores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlScores")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentScore")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledServices(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledServices")(js.undefined)
        ret
    }
    @scala.inline
    def withLicensedUserCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licensedUserCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicensedUserCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licensedUserCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScore")(js.undefined)
        ret
    }
    @scala.inline
    def withVendorInformation(value: SecurityVendorInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVendorInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorInformation")(js.undefined)
        ret
    }
  }
  
}

