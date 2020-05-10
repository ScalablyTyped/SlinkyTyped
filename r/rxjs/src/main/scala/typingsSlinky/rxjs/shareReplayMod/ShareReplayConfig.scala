package typingsSlinky.rxjs.shareReplayMod

import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareReplayConfig extends js.Object {
  var bufferSize: js.UndefOr[Double] = js.native
  var refCount: Boolean = js.native
  var scheduler: js.UndefOr[SchedulerLike] = js.native
  var windowTime: js.UndefOr[Double] = js.native
}

object ShareReplayConfig {
  @scala.inline
  def apply(refCount: Boolean): ShareReplayConfig = {
    val __obj = js.Dynamic.literal(refCount = refCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareReplayConfig]
  }
  @scala.inline
  implicit class ShareReplayConfigOps[Self <: ShareReplayConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRefCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduler(value: SchedulerLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowTime")(js.undefined)
        ret
    }
  }
  
}

