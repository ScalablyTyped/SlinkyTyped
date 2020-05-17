package typingsSlinky.overwatchApi.mod

import typingsSlinky.overwatchApi.anon.Assists
import typingsSlinky.overwatchApi.anon.Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  var endorsement: Frame = js.native
  var level: Double = js.native
  var portrait: String = js.native
  var `private`: Boolean = js.native
  var stats: Assists = js.native
  var username: String = js.native
}

object Stats {
  @scala.inline
  def apply(
    endorsement: Frame,
    level: Double,
    portrait: String,
    `private`: Boolean,
    stats: Assists,
    username: String
  ): Stats = {
    val __obj = js.Dynamic.literal(endorsement = endorsement.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], portrait = portrait.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndorsement(value: Frame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endorsement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
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
    def withStats(value: Assists): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
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

