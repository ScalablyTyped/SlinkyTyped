package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VppToken extends Entity {
  // The apple Id associated with the given Apple Volume Purchase Program Token.
  var appleId: js.UndefOr[String] = js.native
  // Whether or not apps for the VPP token will be automatically updated.
  var automaticallyUpdateApps: js.UndefOr[Boolean] = js.native
  // Whether or not apps for the VPP token will be automatically updated.
  var countryOrRegion: js.UndefOr[String] = js.native
  // The expiration date time of the Apple Volume Purchase Program Token.
  var expirationDateTime: js.UndefOr[String] = js.native
  // Last modification date time associated with the Apple Volume Purchase Program Token.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  /**
    * The last time when an application sync was done with the Apple volume purchase program service using the Apple Volume
    * Purchase Program Token.
    */
  var lastSyncDateTime: js.UndefOr[String] = js.native
  /**
    * Current sync status of the last application sync which was triggered using the Apple Volume Purchase Program Token.
    * Possible values are: none, inProgress, completed, failed. Possible values are: none, inProgress, completed, failed.
    */
  var lastSyncStatus: js.UndefOr[VppTokenSyncStatus] = js.native
  // The organization associated with the Apple Volume Purchase Program Token
  var organizationName: js.UndefOr[String] = js.native
  /**
    * Current state of the Apple Volume Purchase Program Token. Possible values are: unknown, valid, expired, invalid,
    * assignedToExternalMDM. Possible values are: unknown, valid, expired, invalid, assignedToExternalMDM.
    */
  var state: js.UndefOr[VppTokenState] = js.native
  // The Apple Volume Purchase Program Token string downloaded from the Apple Volume Purchase Program.
  var token: js.UndefOr[String] = js.native
  /**
    * The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible
    * values are: business, education. Possible values are: business, education.
    */
  var vppTokenAccountType: js.UndefOr[VppTokenAccountType] = js.native
}

object VppToken {
  @scala.inline
  def apply(): VppToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VppToken]
  }
  @scala.inline
  implicit class VppTokenOps[Self <: VppToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleId")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomaticallyUpdateApps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticallyUpdateApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticallyUpdateApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticallyUpdateApps")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryOrRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryOrRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryOrRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryOrRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSyncDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSyncDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSyncDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSyncDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSyncStatus(value: VppTokenSyncStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSyncStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSyncStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSyncStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizationName")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: VppTokenState): Self = {
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
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
    @scala.inline
    def withVppTokenAccountType(value: VppTokenAccountType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vppTokenAccountType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVppTokenAccountType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vppTokenAccountType")(js.undefined)
        ret
    }
  }
  
}

