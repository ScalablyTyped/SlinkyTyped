package typingsSlinky.riotGamesApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rune extends js.Object {
  var rank: Double = js.native
  var runeId: Double = js.native
}

object Rune {
  @scala.inline
  def apply(rank: Double, runeId: Double): Rune = {
    val __obj = js.Dynamic.literal(rank = rank.asInstanceOf[js.Any], runeId = runeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rune]
  }
  @scala.inline
  implicit class RuneOps[Self <: Rune] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuneId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runeId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

