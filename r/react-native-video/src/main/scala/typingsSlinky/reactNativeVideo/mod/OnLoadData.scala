package typingsSlinky.reactNativeVideo.mod

import typingsSlinky.reactNativeVideo.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnLoadData extends js.Object {
  var canPlayFastForward: Boolean = js.native
  var canPlayReverse: Boolean = js.native
  var canPlaySlowForward: Boolean = js.native
  var canPlaySlowReverse: Boolean = js.native
  var canStepBackward: Boolean = js.native
  var canStepForward: Boolean = js.native
  var currentTime: Double = js.native
  var duration: Double = js.native
  var naturalSize: AnonHeight = js.native
}

object OnLoadData {
  @scala.inline
  def apply(
    canPlayFastForward: Boolean,
    canPlayReverse: Boolean,
    canPlaySlowForward: Boolean,
    canPlaySlowReverse: Boolean,
    canStepBackward: Boolean,
    canStepForward: Boolean,
    currentTime: Double,
    duration: Double,
    naturalSize: AnonHeight
  ): OnLoadData = {
    val __obj = js.Dynamic.literal(canPlayFastForward = canPlayFastForward.asInstanceOf[js.Any], canPlayReverse = canPlayReverse.asInstanceOf[js.Any], canPlaySlowForward = canPlaySlowForward.asInstanceOf[js.Any], canPlaySlowReverse = canPlaySlowReverse.asInstanceOf[js.Any], canStepBackward = canStepBackward.asInstanceOf[js.Any], canStepForward = canStepForward.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], naturalSize = naturalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnLoadData]
  }
  @scala.inline
  implicit class OnLoadDataOps[Self <: OnLoadData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanPlayFastForward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPlayFastForward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanPlayReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPlayReverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanPlaySlowForward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPlaySlowForward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanPlaySlowReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPlaySlowReverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanStepBackward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canStepBackward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanStepForward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canStepForward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNaturalSize(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("naturalSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

