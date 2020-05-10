package typingsSlinky.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitCCPOptions extends js.Object {
  /*
    * The URL for the Connect CCP.
    */
  var ccpUrl: String = js.native
  /*
    * Whether to display the login view.
    */
  var loginPopup: js.UndefOr[Boolean] = js.native
  /**
    * Defaults to false.
    * Set to true to automatically close the loginPopup window after authentication.
    */
  var loginPopupAutoClose: js.UndefOr[Boolean] = js.native
  /**
    * Allows custom URL to be used to initiate the ccp, as in the case of SAML authentication.
    */
  var loginUrl: js.UndefOr[String] = js.native
  /**
    * Amazon connect instance region
    * Only required for chat channel
    */
  var region: js.UndefOr[String] = js.native
  /*
    * Options specifying softphone configuration.
    */
  var softphone: js.UndefOr[SoftPhoneOptions] = js.native
}

object InitCCPOptions {
  @scala.inline
  def apply(ccpUrl: String): InitCCPOptions = {
    val __obj = js.Dynamic.literal(ccpUrl = ccpUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitCCPOptions]
  }
  @scala.inline
  implicit class InitCCPOptionsOps[Self <: InitCCPOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCcpUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccpUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoginPopup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginPopup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoginPopup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginPopup")(js.undefined)
        ret
    }
    @scala.inline
    def withLoginPopupAutoClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginPopupAutoClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoginPopupAutoClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginPopupAutoClose")(js.undefined)
        ret
    }
    @scala.inline
    def withLoginUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoginUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withSoftphone(value: SoftPhoneOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softphone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftphone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softphone")(js.undefined)
        ret
    }
  }
  
}

