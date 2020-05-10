package typingsSlinky.meteor.mongoMod.Mongo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObserveCallbacks[T] extends js.Object {
  var added: js.UndefOr[js.Function1[/* document */ T, Unit]] = js.native
  var addedAt: js.UndefOr[
    js.Function3[/* document */ T, /* atIndex */ Double, /* before */ T | Null, Unit]
  ] = js.native
  var changed: js.UndefOr[js.Function2[/* newDocument */ T, /* oldDocument */ T, Unit]] = js.native
  var changedAt: js.UndefOr[
    js.Function3[/* newDocument */ T, /* oldDocument */ T, /* indexAt */ Double, Unit]
  ] = js.native
  var movedTo: js.UndefOr[
    js.Function4[
      /* document */ T, 
      /* fromIndex */ Double, 
      /* toIndex */ Double, 
      /* before */ T | Null, 
      Unit
    ]
  ] = js.native
  var removed: js.UndefOr[js.Function1[/* oldDocument */ T, Unit]] = js.native
  var removedAt: js.UndefOr[js.Function2[/* oldDocument */ T, /* atIndex */ Double, Unit]] = js.native
}

object ObserveCallbacks {
  @scala.inline
  def apply[T](): ObserveCallbacks[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObserveCallbacks[T]]
  }
  @scala.inline
  implicit class ObserveCallbacksOps[Self[t] <: ObserveCallbacks[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAdded(value: /* document */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAdded: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(js.undefined)
        ret
    }
    @scala.inline
    def withAddedAt(value: (/* document */ T, /* atIndex */ Double, /* before */ T | Null) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedAt")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAddedAt: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withChanged(value: (/* newDocument */ T, /* oldDocument */ T) => Unit): Self[T] = {
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
    def withChangedAt(value: (/* newDocument */ T, /* oldDocument */ T, /* indexAt */ Double) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedAt")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutChangedAt: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withMovedTo(
      value: (/* document */ T, /* fromIndex */ Double, /* toIndex */ Double, /* before */ T | Null) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movedTo")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutMovedTo: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movedTo")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoved(value: /* oldDocument */ T => Unit): Self[T] = {
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
    @scala.inline
    def withRemovedAt(value: (/* oldDocument */ T, /* atIndex */ Double) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedAt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemovedAt: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedAt")(js.undefined)
        ret
    }
  }
  
}

