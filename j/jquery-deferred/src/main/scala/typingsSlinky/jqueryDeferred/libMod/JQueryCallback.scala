package typingsSlinky.jqueryDeferred.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryCallback extends js.Object {
  def add(callbacks: js.Any*): js.Any = js.native
  def disable(): js.Any = js.native
  def disabled(): Boolean = js.native
  def empty(): js.Any = js.native
  def fire(arguments: js.Any*): js.Any = js.native
  def fireWith(context: js.Any, args: js.Any*): js.Any = js.native
  def fired(): Boolean = js.native
  def has(callback: js.Any): Boolean = js.native
  def lock(): js.Any = js.native
  def locked(): Boolean = js.native
  def remove(callbacks: js.Any*): js.Any = js.native
}

object JQueryCallback {
  @scala.inline
  def apply(
    add: /* repeated */ js.Any => js.Any,
    disable: () => js.Any,
    disabled: () => Boolean,
    empty: () => js.Any,
    fire: /* repeated */ js.Any => js.Any,
    fireWith: (js.Any, /* repeated */ js.Any) => js.Any,
    fired: () => Boolean,
    has: js.Any => Boolean,
    lock: () => js.Any,
    locked: () => Boolean,
    remove: /* repeated */ js.Any => js.Any
  ): JQueryCallback = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), disable = js.Any.fromFunction0(disable), disabled = js.Any.fromFunction0(disabled), empty = js.Any.fromFunction0(empty), fire = js.Any.fromFunction1(fire), fireWith = js.Any.fromFunction2(fireWith), fired = js.Any.fromFunction0(fired), has = js.Any.fromFunction1(has), lock = js.Any.fromFunction0(lock), locked = js.Any.fromFunction0(locked), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[JQueryCallback]
  }
  @scala.inline
  implicit class JQueryCallbackOps[Self <: JQueryCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisable(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmpty(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFire(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fire")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFireWith(value: (js.Any, /* repeated */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireWith")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFired(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fired")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHas(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLock(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLocked(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

