package typingsSlinky.gapiClientGamesconfiguration.gapi.client.gamesconfiguration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeaderboardConfigurationDetail extends js.Object {
  /** The icon url of this leaderboard. Writes to this field are ignored. */
  var iconUrl: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesConfiguration#leaderboardConfigurationDetail. */
  var kind: js.UndefOr[String] = js.native
  /** Localized strings for the leaderboard name. */
  var name: js.UndefOr[LocalizedStringBundle] = js.native
  /** The score formatting for the leaderboard. */
  var scoreFormat: js.UndefOr[GamesNumberFormatConfiguration] = js.native
  /** The sort rank of this leaderboard. Writes to this field are ignored. */
  var sortRank: js.UndefOr[Double] = js.native
}

object LeaderboardConfigurationDetail {
  @scala.inline
  def apply(): LeaderboardConfigurationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaderboardConfigurationDetail]
  }
  @scala.inline
  implicit class LeaderboardConfigurationDetailOps[Self <: LeaderboardConfigurationDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(js.undefined)
        ret
    }
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
    def withName(value: LocalizedStringBundle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withScoreFormat(value: GamesNumberFormatConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScoreFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSortRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortRank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortRank")(js.undefined)
        ret
    }
  }
  
}

