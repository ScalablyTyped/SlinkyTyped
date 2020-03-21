package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.ExtensionFileOrCode
import typingsSlinky.firefoxWebextBrowser.browser.manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFile extends ExtensionFileOrCode {
  var file: ExtensionURL
}

object AnonFile {
  @scala.inline
  def apply(file: ExtensionURL): AnonFile = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFile]
  }
}

