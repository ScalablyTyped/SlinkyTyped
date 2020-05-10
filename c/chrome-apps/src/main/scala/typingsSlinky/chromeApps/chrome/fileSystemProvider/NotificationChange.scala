package typingsSlinky.chromeApps.chrome.fileSystemProvider

import typingsSlinky.chromeApps.AnonCHANGED
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.CHANGED
import typingsSlinky.chromeApps.chromeAppsStrings.DELETED
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationChange extends js.Object {
  /**
    * The type of the change which happened to the entry.
    * @see ChangeType
    */
  var changeType: ToStringLiteral[
    AnonCHANGED, 
    /* keyof chrome-apps.AnonCHANGED */ CHANGED | DELETED, 
    Exclude[/* keyof chrome-apps.AnonCHANGED */ CHANGED | DELETED, CHANGED | DELETED]
  ] = js.native
  /** The path of the changed entry. */
  var entryPath: String = js.native
}

object NotificationChange {
  @scala.inline
  def apply(
    changeType: ToStringLiteral[
      AnonCHANGED, 
      /* keyof chrome-apps.AnonCHANGED */ CHANGED | DELETED, 
      Exclude[/* keyof chrome-apps.AnonCHANGED */ CHANGED | DELETED, CHANGED | DELETED]
    ],
    entryPath: String
  ): NotificationChange = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], entryPath = entryPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationChange]
  }
  @scala.inline
  implicit class NotificationChangeOps[Self <: NotificationChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeType(
      value: ToStringLiteral[
          AnonCHANGED, 
          /* keyof chrome-apps.AnonCHANGED */ CHANGED | DELETED, 
          Exclude[/* keyof chrome-apps.AnonCHANGED */ CHANGED | DELETED, CHANGED | DELETED]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntryPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

