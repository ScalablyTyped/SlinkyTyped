package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeKeeper extends js.Object {
  var delta: Double = js.native
  var frameCount: js.Any = js.native
  var frameTime: js.Any = js.native
  var framesPerSecond: Double = js.native
  var lastTime: js.Any = js.native
  var maxDelta: Double = js.native
  var totalTime: Double = js.native
  def update(): Unit = js.native
}

object TimeKeeper {
  @scala.inline
  def apply(
    delta: Double,
    frameCount: js.Any,
    frameTime: js.Any,
    framesPerSecond: Double,
    lastTime: js.Any,
    maxDelta: Double,
    totalTime: Double,
    update: () => Unit
  ): TimeKeeper = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], frameCount = frameCount.asInstanceOf[js.Any], frameTime = frameTime.asInstanceOf[js.Any], framesPerSecond = framesPerSecond.asInstanceOf[js.Any], lastTime = lastTime.asInstanceOf[js.Any], maxDelta = maxDelta.asInstanceOf[js.Any], totalTime = totalTime.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[TimeKeeper]
  }
  @scala.inline
  implicit class TimeKeeperOps[Self <: TimeKeeper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameCount(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameTime(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFramesPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framesPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastTime(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

