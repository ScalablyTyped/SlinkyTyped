package typingsSlinky.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioPlayer extends js.Object {
  var offsetInMilliseconds: Double = js.native
  /**
    * Player activity
    */
  var playerActivity: AudioPlayerActivity = js.native
  var token: String = js.native
}

object AudioPlayer {
  @scala.inline
  def apply(offsetInMilliseconds: Double, playerActivity: AudioPlayerActivity, token: String): AudioPlayer = {
    val __obj = js.Dynamic.literal(offsetInMilliseconds = offsetInMilliseconds.asInstanceOf[js.Any], playerActivity = playerActivity.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayer]
  }
  @scala.inline
  implicit class AudioPlayerOps[Self <: AudioPlayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffsetInMilliseconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetInMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayerActivity(value: AudioPlayerActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

