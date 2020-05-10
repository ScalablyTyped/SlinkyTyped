package typingsSlinky.overwatchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuickplayCompetitiveStats extends js.Object {
  var competitive: js.Array[Stat] = js.native
  var quickplay: js.Array[Stat] = js.native
}

object QuickplayCompetitiveStats {
  @scala.inline
  def apply(competitive: js.Array[Stat], quickplay: js.Array[Stat]): QuickplayCompetitiveStats = {
    val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickplayCompetitiveStats]
  }
  @scala.inline
  implicit class QuickplayCompetitiveStatsOps[Self <: QuickplayCompetitiveStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompetitive(value: js.Array[Stat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("competitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuickplay(value: js.Array[Stat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickplay")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

