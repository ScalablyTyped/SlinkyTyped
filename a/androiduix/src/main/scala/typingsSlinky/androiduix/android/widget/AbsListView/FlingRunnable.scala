package typingsSlinky.androiduix.android.widget.AbsListView

import typingsSlinky.androiduix.android.widget.OverScroller
import typingsSlinky.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlingRunnable extends Runnable {
  var _AbsListView_this: typingsSlinky.androiduix.android.widget.AbsListView = js.native
  var mCheckFlywheel: js.Any = js.native
  var mLastFlingY: js.Any = js.native
  var mScroller: OverScroller = js.native
  /* private */ def edgeReached(delta: js.Any): js.Any = js.native
  def endFling(): Unit = js.native
  def flywheelTouch(): Unit = js.native
  def start(initialVelocity: Double): Unit = js.native
  def startOverfling(initialVelocity: Double): Unit = js.native
  def startScroll(distance: Double, duration: Double, linear: Boolean): Unit = js.native
  def startSpringback(): Unit = js.native
}

object FlingRunnable {
  @scala.inline
  def apply(
    _AbsListView_this: typingsSlinky.androiduix.android.widget.AbsListView,
    edgeReached: js.Any => js.Any,
    endFling: () => Unit,
    flywheelTouch: () => Unit,
    mCheckFlywheel: js.Any,
    mLastFlingY: js.Any,
    mScroller: OverScroller,
    run: () => js.Any,
    start: Double => Unit,
    startOverfling: Double => Unit,
    startScroll: (Double, Double, Boolean) => Unit,
    startSpringback: () => Unit
  ): FlingRunnable = {
    val __obj = js.Dynamic.literal(_AbsListView_this = _AbsListView_this.asInstanceOf[js.Any], edgeReached = js.Any.fromFunction1(edgeReached), endFling = js.Any.fromFunction0(endFling), flywheelTouch = js.Any.fromFunction0(flywheelTouch), mCheckFlywheel = mCheckFlywheel.asInstanceOf[js.Any], mLastFlingY = mLastFlingY.asInstanceOf[js.Any], mScroller = mScroller.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), start = js.Any.fromFunction1(start), startOverfling = js.Any.fromFunction1(startOverfling), startScroll = js.Any.fromFunction3(startScroll), startSpringback = js.Any.fromFunction0(startSpringback))
    __obj.asInstanceOf[FlingRunnable]
  }
  @scala.inline
  implicit class FlingRunnableOps[Self <: FlingRunnable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_AbsListView_this(value: typingsSlinky.androiduix.android.widget.AbsListView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_AbsListView_this")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdgeReached(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeReached")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEndFling(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endFling")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlywheelTouch(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flywheelTouch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMCheckFlywheel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCheckFlywheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMLastFlingY(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mLastFlingY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMScroller(value: OverScroller): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mScroller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartOverfling(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOverfling")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartScroll(value: (Double, Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startScroll")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withStartSpringback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startSpringback")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

