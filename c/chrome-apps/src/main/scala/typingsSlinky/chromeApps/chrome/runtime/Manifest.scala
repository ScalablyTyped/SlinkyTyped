package typingsSlinky.chromeApps.chrome.runtime

import typingsSlinky.chromeApps.anon.Accepttlschannelid
import typingsSlinky.chromeApps.anon.Background
import typingsSlinky.chromeApps.chromeAppsBooleans.`true`
import typingsSlinky.chromeApps.chromeAppsNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chrome.runtime.ValidKioskManifest
  - typingsSlinky.chromeApps.chrome.runtime.ValidNonKioskManifest
  - typingsSlinky.chromeApps.chrome.runtime.InvalidManifest
*/
trait Manifest extends StObject
object Manifest {
  
  @scala.inline
  def InvalidManifest(
    app: Background,
    externally_connectable: Accepttlschannelid,
    manifest_version: `2`,
    name: String,
    version: String
  ): typingsSlinky.chromeApps.chrome.runtime.InvalidManifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.chromeApps.chrome.runtime.InvalidManifest]
  }
  
  @scala.inline
  def ValidKioskManifest(
    app: Background,
    externally_connectable: Accepttlschannelid,
    kiosk_enabled: `true`,
    manifest_version: `2`,
    name: String,
    version: String
  ): typingsSlinky.chromeApps.chrome.runtime.ValidKioskManifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], kiosk_enabled = kiosk_enabled.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.chromeApps.chrome.runtime.ValidKioskManifest]
  }
  
  @scala.inline
  def ValidNonKioskManifest(
    app: Background,
    externally_connectable: Accepttlschannelid,
    manifest_version: `2`,
    name: String,
    version: String
  ): typingsSlinky.chromeApps.chrome.runtime.ValidNonKioskManifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.chromeApps.chrome.runtime.ValidNonKioskManifest]
  }
}
