package typingsSlinky.chromeApps.chrome.fileSystemProvider

import typingsSlinky.chromeApps.AnonREAD
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.READ
import typingsSlinky.chromeApps.chromeAppsStrings.WRITE
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenedFileInfo extends js.Object {
  /** The path of the opened file. */
  var filePath: String
  /**
    * Whether the file was opened for reading or writing.
    * @see OpenFileMode
    */
  var mode: ToStringLiteral[AnonREAD, String, Exclude[String, READ | WRITE]]
  /** A request ID to be be used by consecutive read/write and close requests. */
  var openRequestId: integer
}

object OpenedFileInfo {
  @scala.inline
  def apply(
    filePath: String,
    mode: ToStringLiteral[AnonREAD, String, Exclude[String, READ | WRITE]],
    openRequestId: integer
  ): OpenedFileInfo = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenedFileInfo]
  }
}

