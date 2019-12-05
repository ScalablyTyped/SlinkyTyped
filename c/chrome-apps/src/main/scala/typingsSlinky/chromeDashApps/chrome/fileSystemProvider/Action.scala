package typingsSlinky.chromeDashApps.chrome.fileSystemProvider

import typingsSlinky.chromeDashApps.Anon_OFFLINENOTNECESSARY
import typingsSlinky.chromeDashApps.chrome.ToStringLiteral
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.OFFLINE_NOT_NECESSARY
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.SAVE_FOR_OFFLINE
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.SHARE
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  /**
    * The identifier of the action.
    * Any string or CommonActionId for common actions.
    * @see CommonActionId
    **/
  var id: (ToStringLiteral[
    Anon_OFFLINENOTNECESSARY, 
    String, 
    Exclude[String, SAVE_FOR_OFFLINE | OFFLINE_NOT_NECESSARY | SHARE]
  ]) | String
  /** The title of the action. It may be ignored for common actions.  */
  var title: js.UndefOr[String] = js.undefined
}

object Action {
  @scala.inline
  def apply(
    id: (ToStringLiteral[
      Anon_OFFLINENOTNECESSARY, 
      String, 
      Exclude[String, SAVE_FOR_OFFLINE | OFFLINE_NOT_NECESSARY | SHARE]
    ]) | String,
    title: String = null
  ): Action = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

