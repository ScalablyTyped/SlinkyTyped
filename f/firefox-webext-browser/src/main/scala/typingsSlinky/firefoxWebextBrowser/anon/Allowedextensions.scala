package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.manifest.ExtensionID
import typingsSlinky.firefoxWebextBrowser.browser.manifest.NativeManifest
import typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.pkcs11
import typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.stdio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Allowedextensions extends NativeManifest {
  var allowed_extensions: js.Array[ExtensionID]
  var description: String
  var name: String
  var path: String
  var `type`: pkcs11 | stdio
}

object Allowedextensions {
  @scala.inline
  def apply(
    allowed_extensions: js.Array[ExtensionID],
    description: String,
    name: String,
    path: String,
    `type`: pkcs11 | stdio
  ): Allowedextensions = {
    val __obj = js.Dynamic.literal(allowed_extensions = allowed_extensions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowedextensions]
  }
}

