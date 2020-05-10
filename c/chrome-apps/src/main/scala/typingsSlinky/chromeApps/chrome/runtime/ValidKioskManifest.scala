package typingsSlinky.chromeApps.chrome.runtime

import typingsSlinky.chromeApps.AnonAccepttlschannelid
import typingsSlinky.chromeApps.AnonAlwaysupdate
import typingsSlinky.chromeApps.AnonBackground
import typingsSlinky.chromeApps.chromeAppsBooleans.`true`
import typingsSlinky.chromeApps.chromeAppsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Manifest for Chrome OS Kiosk apps
  * @requires(CrOS Kiosk App) **Only for Chrome OS Kiosk Apps.**
  */
@js.native
trait ValidKioskManifest
  extends PartialManifest
     with Manifest {
  /** Kiosk settings */
  var kiosk: js.UndefOr[AnonAlwaysupdate] = js.native
  /**
    * Enable this app to be used as a kiosk app.
    */
  var kiosk_enabled: `true` = js.native
  /**
    * This app can only be used as a kiosk app on Chrome OS
    */
  var kiosk_only: js.UndefOr[Boolean] = js.native
  /**
    * Not useful since it will prevent app from running.
    * @see[Source]{@link https://github.com/chromium/chromium/blob/master/chrome/browser/chromeos/extensions/device_local_account_management_policy_provider.cc#L155}
    */
  var kiosk_secondary_apps: js.UndefOr[js.Any] = js.native
}

object ValidKioskManifest {
  @scala.inline
  def apply(
    app: AnonBackground,
    externally_connectable: AnonAccepttlschannelid,
    kiosk_enabled: `true`,
    manifest_version: `2`,
    name: String,
    version: String
  ): ValidKioskManifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], kiosk_enabled = kiosk_enabled.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidKioskManifest]
  }
  @scala.inline
  implicit class ValidKioskManifestOps[Self <: ValidKioskManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKiosk_enabled(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kiosk_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKiosk(value: AnonAlwaysupdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kiosk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKiosk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kiosk")(js.undefined)
        ret
    }
    @scala.inline
    def withKiosk_only(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kiosk_only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKiosk_only: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kiosk_only")(js.undefined)
        ret
    }
    @scala.inline
    def withKiosk_secondary_apps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kiosk_secondary_apps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKiosk_secondary_apps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kiosk_secondary_apps")(js.undefined)
        ret
    }
  }
  
}

