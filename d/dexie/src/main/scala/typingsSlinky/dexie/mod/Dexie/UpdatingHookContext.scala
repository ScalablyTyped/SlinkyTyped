package typingsSlinky.dexie.mod.Dexie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatingHookContext[T, Key] extends js.Object {
  var onerror: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.native
  var onsuccess: js.UndefOr[js.Function1[/* updatedObj */ T, Unit]] = js.native
}

object UpdatingHookContext {
  @scala.inline
  def apply[T, Key](): UpdatingHookContext[T, Key] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatingHookContext[T, Key]]
  }
  @scala.inline
  implicit class UpdatingHookContextOps[Self[t, key] <: UpdatingHookContext[t, key], T, Key] (val x: Self[T, Key]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, Key] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, Key]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, Key]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, Key]) with Other]
    @scala.inline
    def withOnerror(value: /* err */ js.Any => Unit): Self[T, Key] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnerror: Self[T, Key] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOnsuccess(value: /* updatedObj */ T => Unit): Self[T, Key] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnsuccess: Self[T, Key] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsuccess")(js.undefined)
        ret
    }
  }
  
}

