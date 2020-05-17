package typingsSlinky.pouchReduxMiddleware.mod

import typingsSlinky.pouchReduxMiddleware.anon.BatchInsert
import typingsSlinky.pouchdbCore.PouchDB.Database
import typingsSlinky.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path[T] extends js.Object {
  var actions: BatchInsert[T] = js.native
  var db: Database[T] = js.native
  var docs: js.UndefOr[js.Any] = js.native
  var handleResponse: js.UndefOr[
    js.Function3[
      /* err */ js.Error, 
      /* data */ js.Any, 
      /* errorCallback */ js.Function1[/* err */ js.Error, Unit], 
      Unit
    ]
  ] = js.native
  var initialBatchDispatched: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Error], Unit]] = js.native
  var path: String = js.native
  var propagateBatchInsert: js.UndefOr[js.Function2[/* doc */ js.Array[Document[T]], /* dispatch */ Dispatch[_], Unit]] = js.native
  var propagateDelete: js.UndefOr[js.Function2[/* doc */ Document[T], /* dispatch */ Dispatch[_], Unit]] = js.native
  var propagateInsert: js.UndefOr[js.Function2[/* doc */ Document[T], /* dispatch */ Dispatch[_], Unit]] = js.native
  var propagateUpdate: js.UndefOr[js.Function2[/* doc */ Document[T], /* dispatch */ Dispatch[_], Unit]] = js.native
  var queue: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var scheduleInset: js.UndefOr[js.Function1[/* doc */ Document[T], Unit]] = js.native
  var scheduleRemove: js.UndefOr[js.Function1[/* doc */ Document[T], Unit]] = js.native
}

object Path {
  @scala.inline
  def apply[T](actions: BatchInsert[T], db: Database[T], path: String): Path[T] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path[T]]
  }
  @scala.inline
  implicit class PathOps[Self[t] <: Path[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withActions(value: BatchInsert[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDb(value: Database[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocs(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocs: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleResponse(
      value: (/* err */ js.Error, /* data */ js.Any, /* errorCallback */ js.Function1[/* err */ js.Error, Unit]) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHandleResponse: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialBatchDispatched(value: /* err */ js.UndefOr[js.Error] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialBatchDispatched")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInitialBatchDispatched: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialBatchDispatched")(js.undefined)
        ret
    }
    @scala.inline
    def withPropagateBatchInsert(value: (/* doc */ js.Array[Document[T]], /* dispatch */ Dispatch[_]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateBatchInsert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPropagateBatchInsert: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateBatchInsert")(js.undefined)
        ret
    }
    @scala.inline
    def withPropagateDelete(value: (/* doc */ Document[T], /* dispatch */ Dispatch[_]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateDelete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPropagateDelete: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withPropagateInsert(value: (/* doc */ Document[T], /* dispatch */ Dispatch[_]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateInsert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPropagateInsert: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateInsert")(js.undefined)
        ret
    }
    @scala.inline
    def withPropagateUpdate(value: (/* doc */ Document[T], /* dispatch */ Dispatch[_]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPropagateUpdate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withQueue(value: /* repeated */ js.Any => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutQueue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleInset(value: /* doc */ Document[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleInset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScheduleInset: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleInset")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleRemove(value: /* doc */ Document[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScheduleRemove: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleRemove")(js.undefined)
        ret
    }
  }
  
}

