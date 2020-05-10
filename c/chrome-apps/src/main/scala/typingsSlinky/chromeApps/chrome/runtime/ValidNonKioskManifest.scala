package typingsSlinky.chromeApps.chrome.runtime

import typingsSlinky.chromeApps.AnonAccepttlschannelid
import typingsSlinky.chromeApps.AnonBackground
import typingsSlinky.chromeApps.chromeAppsBooleans.`false`
import typingsSlinky.chromeApps.chromeAppsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidNonKioskManifest
  extends PartialManifest
     with Manifest {
  var kiosk_enabled: js.UndefOr[`false`] = js.native
}

object ValidNonKioskManifest {
  @scala.inline
  def apply(
    app: AnonBackground,
    externally_connectable: AnonAccepttlschannelid,
    manifest_version: `2`,
    name: String,
    version: String
  ): ValidNonKioskManifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidNonKioskManifest]
  }
  @scala.inline
  implicit class ValidNonKioskManifestOps[Self <: ValidNonKioskManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKiosk_enabled(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kiosk_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKiosk_enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kiosk_enabled")(js.undefined)
        ret
    }
  }
  
}

