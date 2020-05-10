package typingsSlinky.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveLearnset extends js.Object {
  var games: js.Array[String] = js.native
  var learnset: js.Array[Learnset] = js.native
}

object MoveLearnset {
  @scala.inline
  def apply(games: js.Array[String], learnset: js.Array[Learnset]): MoveLearnset = {
    val __obj = js.Dynamic.literal(games = games.asInstanceOf[js.Any], learnset = learnset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveLearnset]
  }
  @scala.inline
  implicit class MoveLearnsetOps[Self <: MoveLearnset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("games")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLearnset(value: js.Array[Learnset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("learnset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

