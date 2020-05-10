package typingsSlinky.expressRateLimit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store extends js.Object {
  def decrement(key: String): Unit = js.native
  def incr(key: String, cb: StoreIncrementCallback): Unit = js.native
  def resetAll(): Unit = js.native
  def resetKey(key: String): Unit = js.native
}

object Store {
  @scala.inline
  def apply(
    decrement: String => Unit,
    incr: (String, StoreIncrementCallback) => Unit,
    resetAll: () => Unit,
    resetKey: String => Unit
  ): Store = {
    val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction1(decrement), incr = js.Any.fromFunction2(incr), resetAll = js.Any.fromFunction0(resetAll), resetKey = js.Any.fromFunction1(resetKey))
    __obj.asInstanceOf[Store]
  }
  @scala.inline
  implicit class StoreOps[Self <: Store] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecrement(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncr(value: (String, StoreIncrementCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withResetAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResetKey(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetKey")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

