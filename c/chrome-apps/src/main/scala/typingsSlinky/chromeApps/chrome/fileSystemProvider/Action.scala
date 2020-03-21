package typingsSlinky.chromeApps.chrome.fileSystemProvider

import typingsSlinky.chromeApps.AnonOFFLINENOTNECESSARY
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.OFFLINE_NOT_NECESSARY
import typingsSlinky.chromeApps.chromeAppsStrings.SAVE_FOR_OFFLINE
import typingsSlinky.chromeApps.chromeAppsStrings.SHARE
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
    AnonOFFLINENOTNECESSARY, 
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
      AnonOFFLINENOTNECESSARY, 
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

