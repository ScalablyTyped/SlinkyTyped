package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkAnimation extends SkObject[SkAnimation] {
  def duration(): Double = js.native
  def fps(): Double = js.native
  def render(canvas: SkCanvas, bounds: SkRect): Unit = js.native
  def seek(time: Double): Unit = js.native
  def seekFrame(frame: Double): Unit = js.native
  def size(): SkSize = js.native
  def version(): String = js.native
}

object SkAnimation {
  @scala.inline
  def apply(
    delete: () => Unit,
    deleteAfter: () => Unit,
    duration: () => Double,
    fps: () => Double,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean,
    render: (SkCanvas, SkRect) => Unit,
    seek: Double => Unit,
    seekFrame: Double => Unit,
    size: () => SkSize,
    version: () => String
  ): SkAnimation = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), duration = js.Any.fromFunction0(duration), fps = js.Any.fromFunction0(fps), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), render = js.Any.fromFunction2(render), seek = js.Any.fromFunction1(seek), seekFrame = js.Any.fromFunction1(seekFrame), size = js.Any.fromFunction0(size), version = js.Any.fromFunction0(version))
    __obj.asInstanceOf[SkAnimation]
  }
  @scala.inline
  implicit class SkAnimationOps[Self <: SkAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFps(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fps")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRender(value: (SkCanvas, SkRect) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSeek(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSeekFrame(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekFrame")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: () => SkSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVersion(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

