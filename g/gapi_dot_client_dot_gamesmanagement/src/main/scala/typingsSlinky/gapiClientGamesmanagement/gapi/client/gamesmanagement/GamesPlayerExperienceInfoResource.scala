package typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GamesPlayerExperienceInfoResource extends js.Object {
  /** The current number of experience points for the player. */
  var currentExperiencePoints: js.UndefOr[String] = js.native
  /** The current level of the player. */
  var currentLevel: js.UndefOr[GamesPlayerLevelResource] = js.native
  /** The timestamp when the player was leveled up, in millis since Unix epoch UTC. */
  var lastLevelUpTimestampMillis: js.UndefOr[String] = js.native
  /** The next level of the player. If the current level is the maximum level, this should be same as the current level. */
  var nextLevel: js.UndefOr[GamesPlayerLevelResource] = js.native
}

object GamesPlayerExperienceInfoResource {
  @scala.inline
  def apply(): GamesPlayerExperienceInfoResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GamesPlayerExperienceInfoResource]
  }
  @scala.inline
  implicit class GamesPlayerExperienceInfoResourceOps[Self <: GamesPlayerExperienceInfoResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentExperiencePoints(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentExperiencePoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentExperiencePoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentExperiencePoints")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentLevel(value: GamesPlayerLevelResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLastLevelUpTimestampMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastLevelUpTimestampMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastLevelUpTimestampMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastLevelUpTimestampMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withNextLevel(value: GamesPlayerLevelResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextLevel")(js.undefined)
        ret
    }
  }
  
}

