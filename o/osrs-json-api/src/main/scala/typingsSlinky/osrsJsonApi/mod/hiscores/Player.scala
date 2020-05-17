package typingsSlinky.osrsJsonApi.mod.hiscores

import typingsSlinky.osrsJsonApi.anon.AbyssalSire
import typingsSlinky.osrsJsonApi.anon.Agility
import typingsSlinky.osrsJsonApi.anon.All
import typingsSlinky.osrsJsonApi.anon.Hunter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Player extends js.Object {
  var bh: Hunter = js.native
  var bosses: AbyssalSire = js.native
  var clues: All = js.native
  var lms: RankScoreObject = js.native
  var skills: Agility = js.native
}

object Player {
  @scala.inline
  def apply(bh: Hunter, bosses: AbyssalSire, clues: All, lms: RankScoreObject, skills: Agility): Player = {
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
    def withBh(value: Hunter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBosses(value: AbyssalSire): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bosses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClues(value: All): Self = {
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
    def withSkills(value: Agility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skills")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

