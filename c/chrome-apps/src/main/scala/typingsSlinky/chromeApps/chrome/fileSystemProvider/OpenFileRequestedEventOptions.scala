package typingsSlinky.chromeApps.chrome.fileSystemProvider

import typingsSlinky.chromeApps.AnonREAD
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.fileSystemProvider.internal.FilePathRequestedEventOptions
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.READ
import typingsSlinky.chromeApps.chromeAppsStrings.WRITE
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFileRequestedEventOptions extends FilePathRequestedEventOptions {
  /**
    * Whether the file will be used for reading or writing.
    * @see ChangeType
    */
  var mode: ToStringLiteral[AnonREAD, String, Exclude[String, READ | WRITE]]
}

object OpenFileRequestedEventOptions {
  @scala.inline
  def apply(
    filePath: String,
    fileSystemId: String,
    mode: ToStringLiteral[AnonREAD, String, Exclude[String, READ | WRITE]],
    requestId: integer
  ): OpenFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenFileRequestedEventOptions]
  }
}

