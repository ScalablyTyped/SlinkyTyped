package typingsSlinky.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoftimeout extends js.Object {
  var editTracksInfo: Double = js.native
  var getStatus: Double = js.native
  var load: Double = js.native
  var pause: Double = js.native
  var play: Double = js.native
  var queueInsert: Double = js.native
  var queueLoad: Double = js.native
  var queueRemove: Double = js.native
  var queueReorder: Double = js.native
  var queueUpdate: Double = js.native
  var seek: Double = js.native
  var setVolume: Double = js.native
  var stop: Double = js.native
}

object Typeoftimeout {
  @scala.inline
  def apply(
    editTracksInfo: Double,
    getStatus: Double,
    load: Double,
    pause: Double,
    play: Double,
    queueInsert: Double,
    queueLoad: Double,
    queueRemove: Double,
    queueReorder: Double,
    queueUpdate: Double,
    seek: Double,
    setVolume: Double,
    stop: Double
  ): Typeoftimeout = {
    val __obj = js.Dynamic.literal(editTracksInfo = editTracksInfo.asInstanceOf[js.Any], getStatus = getStatus.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], queueInsert = queueInsert.asInstanceOf[js.Any], queueLoad = queueLoad.asInstanceOf[js.Any], queueRemove = queueRemove.asInstanceOf[js.Any], queueReorder = queueReorder.asInstanceOf[js.Any], queueUpdate = queueUpdate.asInstanceOf[js.Any], seek = seek.asInstanceOf[js.Any], setVolume = setVolume.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoftimeout]
  }
  @scala.inline
  implicit class TypeoftimeoutOps[Self <: Typeoftimeout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditTracksInfo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editTracksInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPause(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueInsert(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueInsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueLoad(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueRemove(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueReorder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueReorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueUpdate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeek(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

