package typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileSettings extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#profileSettings. */
  var kind: js.UndefOr[String] = js.native
  /** The player's current profile visibility. This field is visible to both 1P and 3P APIs. */
  var profileVisible: js.UndefOr[Boolean] = js.native
}

object ProfileSettings {
  @scala.inline
  def apply(): ProfileSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileSettings]
  }
  @scala.inline
  implicit class ProfileSettingsOps[Self <: ProfileSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileVisible")(js.undefined)
        ret
    }
  }
  
}

