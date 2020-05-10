package typingsSlinky.chromeApps.chrome.runtime

import typingsSlinky.chromeApps.AnonAccepttlschannelid
import typingsSlinky.chromeApps.AnonBackground
import typingsSlinky.chromeApps.chromeAppsBooleans.`true`
import typingsSlinky.chromeApps.chromeAppsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chrome.runtime.ValidKioskManifest
  - typingsSlinky.chromeApps.chrome.runtime.ValidNonKioskManifest
  - typingsSlinky.chromeApps.chrome.runtime.InvalidManifest
*/
trait Manifest extends js.Object

object Manifest {
  @scala.inline
  def ValidKioskManifest(
    app: AnonBackground,
    externally_connectable: AnonAccepttlschannelid,
    kiosk_enabled: `true`,
    manifest_version: `2`,
    name: String,
    version: String
  ): Manifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], kiosk_enabled = kiosk_enabled.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
  @scala.inline
  def ValidNonKioskManifest(
    app: AnonBackground,
    externally_connectable: AnonAccepttlschannelid,
    manifest_version: `2`,
    name: String,
    version: String
  ): Manifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
  @scala.inline
  def InvalidManifest(
    app: AnonBackground,
    externally_connectable: AnonAccepttlschannelid,
    manifest_version: `2`,
    name: String,
    version: String
  ): Manifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
}

