package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DfpSettings extends js.Object {
  var dfpNetworkCode: js.UndefOr[String] = js.native
  var dfpNetworkName: js.UndefOr[String] = js.native
  var programmaticPlacementAccepted: js.UndefOr[Boolean] = js.native
  var pubPaidPlacementAccepted: js.UndefOr[Boolean] = js.native
  var publisherPortalOnly: js.UndefOr[Boolean] = js.native
}

object DfpSettings {
  @scala.inline
  def apply(): DfpSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DfpSettings]
  }
  @scala.inline
  implicit class DfpSettingsOps[Self <: DfpSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDfpNetworkCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dfpNetworkCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDfpNetworkCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dfpNetworkCode")(js.undefined)
        ret
    }
    @scala.inline
    def withDfpNetworkName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dfpNetworkName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDfpNetworkName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dfpNetworkName")(js.undefined)
        ret
    }
    @scala.inline
    def withProgrammaticPlacementAccepted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programmaticPlacementAccepted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgrammaticPlacementAccepted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programmaticPlacementAccepted")(js.undefined)
        ret
    }
    @scala.inline
    def withPubPaidPlacementAccepted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubPaidPlacementAccepted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubPaidPlacementAccepted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubPaidPlacementAccepted")(js.undefined)
        ret
    }
    @scala.inline
    def withPublisherPortalOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherPortalOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisherPortalOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherPortalOnly")(js.undefined)
        ret
    }
  }
  
}

