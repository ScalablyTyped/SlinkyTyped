package typingsSlinky.overwatchApi.mod

import typingsSlinky.overwatchApi.anon.Competitive
import typingsSlinky.overwatchApi.anon.Damage
import typingsSlinky.overwatchApi.anon.Frame
import typingsSlinky.overwatchApi.anon.Quickplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profile extends js.Object {
  var competitive: Damage = js.native
  var endorsement: Frame = js.native
  var games: Competitive = js.native
  var level: Double = js.native
  var levelFrame: String = js.native
  var playtime: Quickplay = js.native
  var portrait: String = js.native
  var `private`: Boolean = js.native
  var star: String = js.native
  var username: String = js.native
}

object Profile {
  @scala.inline
  def apply(
    competitive: Damage,
    endorsement: Frame,
    games: Competitive,
    level: Double,
    levelFrame: String,
    playtime: Quickplay,
    portrait: String,
    `private`: Boolean,
    star: String,
    username: String
  ): Profile = {
    val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], endorsement = endorsement.asInstanceOf[js.Any], games = games.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], levelFrame = levelFrame.asInstanceOf[js.Any], playtime = playtime.asInstanceOf[js.Any], portrait = portrait.asInstanceOf[js.Any], star = star.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompetitive(value: Damage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("competitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndorsement(value: Frame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endorsement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGames(value: Competitive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("games")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevelFrame(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaytime(value: Quickplay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortrait(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portrait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("star")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

