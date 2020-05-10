package typingsSlinky.jestJasmine2.callTrackerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallTracker extends js.Object {
  def all(): js.Array[Context] = js.native
  def allArgs(): js.Array[_] = js.native
  def any(): Boolean = js.native
  def argsFor(index: Double): js.Array[_] = js.native
  def count(): Double = js.native
  def first(): Context = js.native
  def mostRecent(): Context = js.native
  def reset(): Unit = js.native
  def track(context: Context): Unit = js.native
}

object CallTracker {
  @scala.inline
  def apply(
    all: () => js.Array[Context],
    allArgs: () => js.Array[_],
    any: () => Boolean,
    argsFor: Double => js.Array[_],
    count: () => Double,
    first: () => Context,
    mostRecent: () => Context,
    reset: () => Unit,
    track: Context => Unit
  ): CallTracker = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allArgs = js.Any.fromFunction0(allArgs), any = js.Any.fromFunction0(any), argsFor = js.Any.fromFunction1(argsFor), count = js.Any.fromFunction0(count), first = js.Any.fromFunction0(first), mostRecent = js.Any.fromFunction0(mostRecent), reset = js.Any.fromFunction0(reset), track = js.Any.fromFunction1(track))
    __obj.asInstanceOf[CallTracker]
  }
  @scala.inline
  implicit class CallTrackerOps[Self <: CallTracker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: () => js.Array[Context]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAllArgs(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allArgs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAny(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("any")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withArgsFor(value: Double => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argsFor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFirst(value: () => Context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMostRecent(value: () => Context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mostRecent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTrack(value: Context => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

