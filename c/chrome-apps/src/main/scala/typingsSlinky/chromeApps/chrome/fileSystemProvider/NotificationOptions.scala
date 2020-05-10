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
trait NotificationOptions extends js.Object {
  /**
    * The type of the change which happened to the observed entry.
    * If it is DELETED, then the observed entry will be automatically
    * removed from the list of observed entries.
    * @see ChangeType
    */
  var changeType: ToStringLiteral[
    AnonCHANGED, 
    /* keyof chrome-apps.AnonCHANGED */ CHANGED | DELETED, 
    Exclude[/* keyof chrome-apps.AnonCHANGED */ CHANGED | DELETED, CHANGED | DELETED]
  ] = js.native
  /** List of changes to entries within the observed directory (including the entry itself)  */
  var changes: js.UndefOr[js.Array[NotificationChange]] = js.native
  /** The identifier of the file system related to this change. */
  var fileSystemId: String = js.native
  /** The path of the observed entry. */
  var observedPath: String = js.native
  /** Mode of the observed entry. */
  var recursive: Boolean = js.native
  /**
    * Tag for the notification.
    * Required if the file system was mounted with the supportsNotifyTag option.
    * Note, that this flag is necessary to provide notifications about changes
    * which changed even when the system was shutdown.
    */
  var tag: js.UndefOr[String] = js.native
}

object NotificationOptions {
  @scala.inline
  def apply(
    changeType: ToStringLiteral[
      AnonCHANGED, 
      /* keyof chrome-apps.AnonCHANGED */ CHANGED | DELETED, 
      Exclude[/* keyof chrome-apps.AnonCHANGED */ CHANGED | DELETED, CHANGED | DELETED]
    ],
    fileSystemId: String,
    observedPath: String,
    recursive: Boolean
  ): NotificationOptions = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], observedPath = observedPath.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationOptions]
  }
  @scala.inline
  implicit class NotificationOptionsOps[Self <: NotificationOptions] (val x: Self) extends AnyVal {
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
    def withFileSystemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSystemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObservedPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observedPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecursive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChanges(value: js.Array[NotificationChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

