package typingsSlinky.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelsChangedParam extends js.Object {
  var currentQuality: Double = js.native
}

object LevelsChangedParam {
  @scala.inline
  def apply(currentQuality: Double): LevelsChangedParam = {
    val __obj = js.Dynamic.literal(currentQuality = currentQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelsChangedParam]
  }
  @scala.inline
  implicit class LevelsChangedParamOps[Self <: LevelsChangedParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentQuality")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

