package typingsSlinky.overwatchApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompetitiveQuickplay extends js.Object {
  var competitive: AnonGameswon = js.native
  var quickplay: AnonEliminationsperlife = js.native
}

object AnonCompetitiveQuickplay {
  @scala.inline
  def apply(competitive: AnonGameswon, quickplay: AnonEliminationsperlife): AnonCompetitiveQuickplay = {
    val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompetitiveQuickplay]
  }
  @scala.inline
  implicit class AnonCompetitiveQuickplayOps[Self <: AnonCompetitiveQuickplay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompetitive(value: AnonGameswon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("competitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuickplay(value: AnonEliminationsperlife): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickplay")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

