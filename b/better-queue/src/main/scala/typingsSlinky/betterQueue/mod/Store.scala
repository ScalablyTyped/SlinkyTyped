package typingsSlinky.betterQueue.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store[T] extends js.Object {
  def connect(cb: js.Function2[/* error */ js.Any, /* length */ Double, Unit]): Unit = js.native
  def deleteTask(taskId: js.Any, cb: js.Function0[Unit]): Unit = js.native
  def getLock(lockId: String, cb: js.Function2[/* error */ js.Any, /* tasks */ StringDictionary[T], Unit]): Unit = js.native
  def getTask(taskId: js.Any, cb: js.Function2[/* error */ js.Any, /* task */ T, Unit]): Unit = js.native
  def putTask(taskId: js.Any, task: T, priority: Double, cb: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def releaseLock(lockId: String, cb: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def takeFirstN(n: Double, cb: js.Function2[/* error */ js.Any, /* lockId */ String, Unit]): Unit = js.native
  def takeLastN(n: Double, cb: js.Function2[/* error */ js.Any, /* lockId */ String, Unit]): Unit = js.native
}

object Store {
  @scala.inline
  def apply[T](
    connect: js.Function2[/* error */ js.Any, /* length */ Double, Unit] => Unit,
    deleteTask: (js.Any, js.Function0[Unit]) => Unit,
    getLock: (String, js.Function2[/* error */ js.Any, /* tasks */ StringDictionary[T], Unit]) => Unit,
    getTask: (js.Any, js.Function2[/* error */ js.Any, /* task */ T, Unit]) => Unit,
    putTask: (js.Any, T, Double, js.Function1[/* error */ js.Any, Unit]) => Unit,
    releaseLock: (String, js.Function1[/* error */ js.Any, Unit]) => Unit,
    takeFirstN: (Double, js.Function2[/* error */ js.Any, /* lockId */ String, Unit]) => Unit,
    takeLastN: (Double, js.Function2[/* error */ js.Any, /* lockId */ String, Unit]) => Unit
  ): Store[T] = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), deleteTask = js.Any.fromFunction2(deleteTask), getLock = js.Any.fromFunction2(getLock), getTask = js.Any.fromFunction2(getTask), putTask = js.Any.fromFunction4(putTask), releaseLock = js.Any.fromFunction2(releaseLock), takeFirstN = js.Any.fromFunction2(takeFirstN), takeLastN = js.Any.fromFunction2(takeLastN))
    __obj.asInstanceOf[Store[T]]
  }
  @scala.inline
  implicit class StoreOps[Self[t] <: Store[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withConnect(value: js.Function2[/* error */ js.Any, /* length */ Double, Unit] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteTask(value: (js.Any, js.Function0[Unit]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTask")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetLock(value: (String, js.Function2[/* error */ js.Any, /* tasks */ StringDictionary[T], Unit]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLock")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetTask(value: (js.Any, js.Function2[/* error */ js.Any, /* task */ T, Unit]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTask")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPutTask(value: (js.Any, T, Double, js.Function1[/* error */ js.Any, Unit]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putTask")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withReleaseLock(value: (String, js.Function1[/* error */ js.Any, Unit]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseLock")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTakeFirstN(value: (Double, js.Function2[/* error */ js.Any, /* lockId */ String, Unit]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("takeFirstN")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTakeLastN(value: (Double, js.Function2[/* error */ js.Any, /* lockId */ String, Unit]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("takeLastN")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

