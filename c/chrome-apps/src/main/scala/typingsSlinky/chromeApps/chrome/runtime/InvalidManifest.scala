package typingsSlinky.chromeApps.chrome.runtime

import typingsSlinky.chromeApps.anon.Accepttlschannelid
import typingsSlinky.chromeApps.anon.Background
import typingsSlinky.chromeApps.chromeAppsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidManifest
  extends PartialManifest
     with Manifest

object InvalidManifest {
  @scala.inline
  def apply(
    app: Background,
    externally_connectable: Accepttlschannelid,
    manifest_version: `2`,
    name: String,
    version: String
  ): InvalidManifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidManifest]
  }
}

