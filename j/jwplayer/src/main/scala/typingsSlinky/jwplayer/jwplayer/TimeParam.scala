package typingsSlinky.jwplayer.jwplayer

import typingsSlinky.jwplayer.jwplayerNumbers.`0`
import typingsSlinky.jwplayer.jwplayerNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeParam extends js.Object {
  var duration: Double = js.native
  var position: Double = js.native
  var viewable: `0` | `1` = js.native
}

object TimeParam {
  @scala.inline
  def apply(duration: Double, position: Double, viewable: `0` | `1`): TimeParam = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeParam]
  }
  @scala.inline
  implicit class TimeParamOps[Self <: TimeParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewable(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

