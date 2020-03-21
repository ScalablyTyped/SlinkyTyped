package typingsSlinky.chromeApps.chrome.fileSystemProvider

import typingsSlinky.chromeApps.AnonCHANGED
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.CHANGED
import typingsSlinky.chromeApps.chromeAppsStrings.DELETED
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationChange extends js.Object {
  /**
    * The type of the change which happened to the entry.
    * @see ChangeType
    */
  var changeType: ToStringLiteral[AnonCHANGED, String, Exclude[String, CHANGED | DELETED]]
  /** The path of the changed entry. */
  var entryPath: String
}

object NotificationChange {
  @scala.inline
  def apply(
    changeType: ToStringLiteral[AnonCHANGED, String, Exclude[String, CHANGED | DELETED]],
    entryPath: String
  ): NotificationChange = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], entryPath = entryPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotificationChange]
  }
}

