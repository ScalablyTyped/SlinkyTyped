package typingsSlinky.reactNativeVideo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferForPlaybackAfterRebufferMs extends js.Object {
  var bufferForPlaybackAfterRebufferMs: js.UndefOr[Double] = js.native
  var bufferForPlaybackMs: js.UndefOr[Double] = js.native
  var maxBufferMs: js.UndefOr[Double] = js.native
  var minBufferMs: js.UndefOr[Double] = js.native
}

object BufferForPlaybackAfterRebufferMs {
  @scala.inline
  def apply(): BufferForPlaybackAfterRebufferMs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferForPlaybackAfterRebufferMs]
  }
  @scala.inline
  implicit class BufferForPlaybackAfterRebufferMsOps[Self <: BufferForPlaybackAfterRebufferMs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferForPlaybackAfterRebufferMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferForPlaybackAfterRebufferMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferForPlaybackAfterRebufferMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferForPlaybackAfterRebufferMs")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferForPlaybackMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferForPlaybackMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferForPlaybackMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferForPlaybackMs")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBufferMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBufferMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBufferMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBufferMs")(js.undefined)
        ret
    }
    @scala.inline
    def withMinBufferMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBufferMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinBufferMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBufferMs")(js.undefined)
        ret
    }
  }
  
}

