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
     with Manifest {
  /** Not for packaged apps */
  var browser_action: js.UndefOr[scala.Nothing] = js.native
  /**
    * Not for packaged apps
    * Only for extensions and legacy packaged apps
    */
  var chrome_url_overrides: js.UndefOr[scala.Nothing] = js.native
  /**
    * Not for packaged apps
    * Only for extensions and legacy packaged apps
    */
  var content_security_policy: js.UndefOr[scala.Nothing] = js.native
  /** Not for packaged apps */
  var options_page: js.UndefOr[scala.Nothing] = js.native
  //
  // Never types - should never exist
  // Are declared to prevent use since many
  // legacy app are using them. Will result
  // in errors. Many examples and code bases
  // have these included.
  //
  /** Not for packaged apps */
  var options_ui: js.UndefOr[scala.Nothing] = js.native
}

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

