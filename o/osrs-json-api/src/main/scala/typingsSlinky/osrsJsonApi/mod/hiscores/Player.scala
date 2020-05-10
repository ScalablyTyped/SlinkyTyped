package typingsSlinky.osrsJsonApi.mod.hiscores

import typingsSlinky.osrsJsonApi.AnonAbyssalSire
import typingsSlinky.osrsJsonApi.AnonAgility
import typingsSlinky.osrsJsonApi.AnonAll
import typingsSlinky.osrsJsonApi.AnonHunter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Player extends js.Object {
  var bh: AnonHunter = js.native
  var bosses: AnonAbyssalSire = js.native
  var clues: AnonAll = js.native
  var lms: RankScoreObject = js.native
  var skills: AnonAgility = js.native
}

object Player {
  @scala.inline
  def apply(bh: AnonHunter, bosses: AnonAbyssalSire, clues: AnonAll, lms: RankScoreObject, skills: AnonAgility): Player = {
    val __obj = js.Dynamic.literal(bh = bh.asInstanceOf[js.Any], bosses = bosses.asInstanceOf[js.Any], clues = clues.asInstanceOf[js.Any], lms = lms.asInstanceOf[js.Any], skills = skills.asInstanceOf[js.Any])
    __obj.asInstanceOf[Player]
  }
  @scala.inline
  implicit class PlayerOps[Self <: Player] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBh(value: AnonHunter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBosses(value: AnonAbyssalSire): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bosses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClues(value: AnonAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLms(value: RankScoreObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkills(value: AnonAgility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skills")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

