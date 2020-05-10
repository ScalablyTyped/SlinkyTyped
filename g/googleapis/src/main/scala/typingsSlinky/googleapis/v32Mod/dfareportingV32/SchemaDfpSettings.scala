package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Ad Manager Settings
  */
@js.native
trait SchemaDfpSettings extends js.Object {
  /**
    * Ad Manager network code for this directory site.
    */
  var dfpNetworkCode: js.UndefOr[String] = js.native
  /**
    * Ad Manager network name for this directory site.
    */
  var dfpNetworkName: js.UndefOr[String] = js.native
  /**
    * Whether this directory site accepts programmatic placements.
    */
  var programmaticPlacementAccepted: js.UndefOr[Boolean] = js.native
  /**
    * Whether this directory site accepts publisher-paid tags.
    */
  var pubPaidPlacementAccepted: js.UndefOr[Boolean] = js.native
  /**
    * Whether this directory site is available only via Publisher Portal.
    */
  var publisherPortalOnly: js.UndefOr[Boolean] = js.native
}

object SchemaDfpSettings {
  @scala.inline
  def apply(): SchemaDfpSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDfpSettings]
  }
  @scala.inline
  implicit class SchemaDfpSettingsOps[Self <: SchemaDfpSettings] (val x: Self) extends AnyVal {
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

