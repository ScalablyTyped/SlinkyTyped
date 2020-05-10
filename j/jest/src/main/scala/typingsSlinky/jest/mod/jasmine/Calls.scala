package typingsSlinky.jest.mod.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calls extends js.Object {
  /**
    * By chaining the spy with calls.all(), will return the
    * context (the this) and arguments passed all calls
    */
  def all(): js.Array[CallInfo] = js.native
  /**
    * By chaining the spy with calls.allArgs(),
    * will return the arguments to all calls
    */
  def allArgs(): js.Array[_] = js.native
  /**
    * By chaining the spy with calls.any(),
    * will return false if the spy has not been called at all,
    * and then true once at least one call happens.
    */
  def any(): Boolean = js.native
  /**
    * By chaining the spy with calls.argsFor(),
    * will return the arguments passed to call number index
    */
  def argsFor(index: Double): js.Array[_] = js.native
  /**
    * By chaining the spy with calls.count(),
    * will return the number of times the spy was called
    */
  def count(): Double = js.native
  /**
    * By chaining the spy with calls.first(), will return the
    * context (the this) and arguments for the first call
    */
  def first(): CallInfo = js.native
  /**
    * By chaining the spy with calls.mostRecent(), will return the
    * context (the this) and arguments for the most recent call
    */
  def mostRecent(): CallInfo = js.native
  /**
    * By chaining the spy with calls.reset(), will clears all tracking for a spy
    */
  def reset(): Unit = js.native
}

object Calls {
  @scala.inline
  def apply(
    all: () => js.Array[CallInfo],
    allArgs: () => js.Array[_],
    any: () => Boolean,
    argsFor: Double => js.Array[_],
    count: () => Double,
    first: () => CallInfo,
    mostRecent: () => CallInfo,
    reset: () => Unit
  ): Calls = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allArgs = js.Any.fromFunction0(allArgs), any = js.Any.fromFunction0(any), argsFor = js.Any.fromFunction1(argsFor), count = js.Any.fromFunction0(count), first = js.Any.fromFunction0(first), mostRecent = js.Any.fromFunction0(mostRecent), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[Calls]
  }
  @scala.inline
  implicit class CallsOps[Self <: Calls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: () => js.Array[CallInfo]): Self = {
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
    def withFirst(value: () => CallInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMostRecent(value: () => CallInfo): Self = {
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
  }
  
}

