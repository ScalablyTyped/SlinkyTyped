package typingsSlinky.osrsJsonApi

import typingsSlinky.osrsJsonApi.mod.hiscores.RankScoreObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHunter extends js.Object {
  var hunter: RankScoreObject = js.native
  var rogue: RankScoreObject = js.native
}

object AnonHunter {
  @scala.inline
  def apply(hunter: RankScoreObject, rogue: RankScoreObject): AnonHunter = {
    val __obj = js.Dynamic.literal(hunter = hunter.asInstanceOf[js.Any], rogue = rogue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHunter]
  }
  @scala.inline
  implicit class AnonHunterOps[Self <: AnonHunter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHunter(value: RankScoreObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hunter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRogue(value: RankScoreObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rogue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

