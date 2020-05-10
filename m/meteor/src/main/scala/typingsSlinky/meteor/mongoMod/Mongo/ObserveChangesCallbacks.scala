package typingsSlinky.meteor.mongoMod.Mongo

import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObserveChangesCallbacks[T] extends js.Object {
  var added: js.UndefOr[js.Function2[/* id */ String, /* fields */ Partial[T], Unit]] = js.native
  var addedBefore: js.UndefOr[
    js.Function3[/* id */ String, /* fields */ Partial[T], /* before */ T | Null, Unit]
  ] = js.native
  var changed: js.UndefOr[js.Function2[/* id */ String, /* fields */ Partial[T], Unit]] = js.native
  var movedBefore: js.UndefOr[js.Function2[/* id */ String, /* before */ T | Null, Unit]] = js.native
  var removed: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.native
}

object ObserveChangesCallbacks {
  @scala.inline
  def apply[T](): ObserveChangesCallbacks[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObserveChangesCallbacks[T]]
  }
  @scala.inline
  implicit class ObserveChangesCallbacksOps[Self[t] <: ObserveChangesCallbacks[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAdded(value: (/* id */ String, /* fields */ Partial[T]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAdded: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(js.undefined)
        ret
    }
    @scala.inline
    def withAddedBefore(value: (/* id */ String, /* fields */ Partial[T], /* before */ T | Null) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedBefore")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAddedBefore: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withChanged(value: (/* id */ String, /* fields */ Partial[T]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutChanged: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(js.undefined)
        ret
    }
    @scala.inline
    def withMovedBefore(value: (/* id */ String, /* before */ T | Null) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movedBefore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMovedBefore: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movedBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoved(value: /* id */ String => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoved: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(js.undefined)
        ret
    }
  }
  
}

