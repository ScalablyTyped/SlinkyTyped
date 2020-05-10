package typingsSlinky.overwatchApi

import typingsSlinky.overwatchApi.mod.Endorsement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFrame extends js.Object {
  var frame: String = js.native
  var icon: String = js.native
  var level: Double = js.native
  var shotcaller: Endorsement = js.native
  var sportsmanship: Endorsement = js.native
  var teammate: Endorsement = js.native
}

object AnonFrame {
  @scala.inline
  def apply(
    frame: String,
    icon: String,
    level: Double,
    shotcaller: Endorsement,
    sportsmanship: Endorsement,
    teammate: Endorsement
  ): AnonFrame = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], shotcaller = shotcaller.asInstanceOf[js.Any], sportsmanship = sportsmanship.asInstanceOf[js.Any], teammate = teammate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFrame]
  }
  @scala.inline
  implicit class AnonFrameOps[Self <: AnonFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrame(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShotcaller(value: Endorsement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shotcaller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSportsmanship(value: Endorsement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sportsmanship")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeammate(value: Endorsement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teammate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

