package typingsSlinky.androiduix.uk.co.senab.photoview.PhotoViewAttacher

import typingsSlinky.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimatedZoomRunnable extends Runnable {
  var _PhotoViewAttacher_this: typingsSlinky.androiduix.uk.co.senab.photoview.PhotoViewAttacher = js.native
  var mFocalX: js.Any = js.native
  var mFocalY: js.Any = js.native
  var mStartTime: js.Any = js.native
  var mZoomEnd: js.Any = js.native
  var mZoomStart: js.Any = js.native
  /* private */ def interpolate(): js.Any = js.native
}

object AnimatedZoomRunnable {
  @scala.inline
  def apply(
    _PhotoViewAttacher_this: typingsSlinky.androiduix.uk.co.senab.photoview.PhotoViewAttacher,
    interpolate: () => js.Any,
    mFocalX: js.Any,
    mFocalY: js.Any,
    mStartTime: js.Any,
    mZoomEnd: js.Any,
    mZoomStart: js.Any,
    run: () => js.Any
  ): AnimatedZoomRunnable = {
    val __obj = js.Dynamic.literal(_PhotoViewAttacher_this = _PhotoViewAttacher_this.asInstanceOf[js.Any], interpolate = js.Any.fromFunction0(interpolate), mFocalX = mFocalX.asInstanceOf[js.Any], mFocalY = mFocalY.asInstanceOf[js.Any], mStartTime = mStartTime.asInstanceOf[js.Any], mZoomEnd = mZoomEnd.asInstanceOf[js.Any], mZoomStart = mZoomStart.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[AnimatedZoomRunnable]
  }
  @scala.inline
  implicit class AnimatedZoomRunnableOps[Self <: AnimatedZoomRunnable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_PhotoViewAttacher_this(value: typingsSlinky.androiduix.uk.co.senab.photoview.PhotoViewAttacher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_PhotoViewAttacher_this")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterpolate(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMFocalX(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mFocalX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMFocalY(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mFocalY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMStartTime(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMZoomEnd(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mZoomEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMZoomStart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mZoomStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

