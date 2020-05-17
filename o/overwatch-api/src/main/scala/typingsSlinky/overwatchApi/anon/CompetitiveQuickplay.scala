package typingsSlinky.overwatchApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompetitiveQuickplay extends js.Object {
  var competitive: Gameswon = js.native
  var quickplay: Eliminationsperlife = js.native
}

object CompetitiveQuickplay {
  @scala.inline
  def apply(competitive: Gameswon, quickplay: Eliminationsperlife): CompetitiveQuickplay = {
    val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompetitiveQuickplay]
  }
  @scala.inline
  implicit class CompetitiveQuickplayOps[Self <: CompetitiveQuickplay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompetitive(value: Gameswon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("competitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuickplay(value: Eliminationsperlife): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickplay")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

