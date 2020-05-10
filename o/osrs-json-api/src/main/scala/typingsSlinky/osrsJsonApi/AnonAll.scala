package typingsSlinky.osrsJsonApi

import typingsSlinky.osrsJsonApi.mod.hiscores.RankScoreObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAll extends js.Object {
  var all: RankScoreObject = js.native
  var beginner: RankScoreObject = js.native
  var easy: RankScoreObject = js.native
  var elite: RankScoreObject = js.native
  var hard: RankScoreObject = js.native
  var master: RankScoreObject = js.native
  var medium: RankScoreObject = js.native
}

object AnonAll {
  @scala.inline
  def apply(
    all: RankScoreObject,
    beginner: RankScoreObject,
    easy: RankScoreObject,
    elite: RankScoreObject,
    hard: RankScoreObject,
    master: RankScoreObject,
    medium: RankScoreObject
  ): AnonAll = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], beginner = beginner.asInstanceOf[js.Any], easy = easy.asInstanceOf[js.Any], elite = elite.asInstanceOf[js.Any], hard = hard.asInstanceOf[js.Any], master = master.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAll]
  }
  @scala.inline
  implicit class AnonAllOps[Self <: AnonAll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: RankScoreObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeginner(value: RankScoreObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEasy(value: RankScoreObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElite(value: RankScoreObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHard(value: RankScoreObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaster(value: RankScoreObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedium(value: RankScoreObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medium")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

