package typingsSlinky.overwatchApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPlayed extends js.Object {
  var played: js.UndefOr[scala.Nothing] = js.native
  var won: Double = js.native
}

object AnonPlayed {
  @scala.inline
  def apply(won: Double): AnonPlayed = {
    val __obj = js.Dynamic.literal(won = won.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPlayed]
  }
  @scala.inline
  implicit class AnonPlayedOps[Self <: AnonPlayed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWon(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("won")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayed(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("played")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("played")(js.undefined)
        ret
    }
  }
  
}

