package typingsSlinky.detectBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("detect-browser", "BrowserInfo")
@js.native
class BrowserInfo protected () extends DetectedInfo[Browser, OperatingSystem | Null, String] {
  def this(name: Browser, version: String) = this()
  def this(name: Browser, version: String, os: OperatingSystem) = this()
}

