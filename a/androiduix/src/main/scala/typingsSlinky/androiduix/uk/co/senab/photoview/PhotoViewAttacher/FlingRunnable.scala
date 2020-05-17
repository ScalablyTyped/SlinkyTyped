package typingsSlinky.androiduix.uk.co.senab.photoview.PhotoViewAttacher

import typingsSlinky.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlingRunnable extends Runnable {
  var _PhotoViewAttacher_this: typingsSlinky.androiduix.uk.co.senab.photoview.PhotoViewAttacher = js.native
  var mCurrentX: js.Any = js.native
  var mCurrentY: js.Any = js.native
  var mScroller: js.Any = js.native
  def cancelFling(): Unit = js.native
  def fling(viewWidth: Double, viewHeight: Double, velocityX: Double, velocityY: Double): Unit = js.native
}

object FlingRunnable {
  @scala.inline
  def apply(
    _PhotoViewAttacher_this: typingsSlinky.androiduix.uk.co.senab.photoview.PhotoViewAttacher,
    cancelFling: () => Unit,
    fling: (Double, Double, Double, Double) => Unit,
    mCurrentX: js.Any,
    mCurrentY: js.Any,
    mScroller: js.Any,
    run: () => js.Any
  ): FlingRunnable = {
    val __obj = js.Dynamic.literal(_PhotoViewAttacher_this = _PhotoViewAttacher_this.asInstanceOf[js.Any], cancelFling = js.Any.fromFunction0(cancelFling), fling = js.Any.fromFunction4(fling), mCurrentX = mCurrentX.asInstanceOf[js.Any], mCurrentY = mCurrentY.asInstanceOf[js.Any], mScroller = mScroller.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[FlingRunnable]
  }
  @scala.inline
  implicit class FlingRunnableOps[Self <: FlingRunnable] (val x: Self) extends AnyVal {
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
    def withCancelFling(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelFling")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFling(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fling")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMCurrentX(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCurrentX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMCurrentY(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCurrentY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMScroller(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mScroller")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

