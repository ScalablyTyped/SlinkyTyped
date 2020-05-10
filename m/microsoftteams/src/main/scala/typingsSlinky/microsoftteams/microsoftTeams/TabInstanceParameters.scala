package typingsSlinky.microsoftteams.microsoftTeams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabInstanceParameters extends js.Object {
  /**
    * Flag allowing to select favorite channels only
    */
  var favoriteChannelsOnly: js.UndefOr[Boolean] = js.native
  /**
    * Flag allowing to select favorite teams only
    */
  var favoriteTeamsOnly: js.UndefOr[Boolean] = js.native
}

object TabInstanceParameters {
  @scala.inline
  def apply(): TabInstanceParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabInstanceParameters]
  }
  @scala.inline
  implicit class TabInstanceParametersOps[Self <: TabInstanceParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFavoriteChannelsOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favoriteChannelsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFavoriteChannelsOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favoriteChannelsOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withFavoriteTeamsOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favoriteTeamsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFavoriteTeamsOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favoriteTeamsOnly")(js.undefined)
        ret
    }
  }
  
}

