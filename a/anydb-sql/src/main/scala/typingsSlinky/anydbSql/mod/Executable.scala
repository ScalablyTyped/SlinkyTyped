package typingsSlinky.anydbSql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Executable[T] extends js.Object {
  def all(): typingsSlinky.bluebird.mod.^[js.Array[T]] = js.native
  def allWithin(tx: DatabaseConnection): typingsSlinky.bluebird.mod.^[js.Array[T]] = js.native
  def exec(): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def execWithin(tx: DatabaseConnection): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def get(): typingsSlinky.bluebird.mod.^[T] = js.native
  def getWithin(tx: DatabaseConnection): typingsSlinky.bluebird.mod.^[T] = js.native
  def toQuery(): QueryLike = js.native
}

object Executable {
  @scala.inline
  def apply[T](
    all: () => typingsSlinky.bluebird.mod.^[js.Array[T]],
    allWithin: DatabaseConnection => typingsSlinky.bluebird.mod.^[js.Array[T]],
    exec: () => typingsSlinky.bluebird.mod.^[Unit],
    execWithin: DatabaseConnection => typingsSlinky.bluebird.mod.^[Unit],
    get: () => typingsSlinky.bluebird.mod.^[T],
    getWithin: DatabaseConnection => typingsSlinky.bluebird.mod.^[T],
    toQuery: () => QueryLike
  ): Executable[T] = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allWithin = js.Any.fromFunction1(allWithin), exec = js.Any.fromFunction0(exec), execWithin = js.Any.fromFunction1(execWithin), get = js.Any.fromFunction0(get), getWithin = js.Any.fromFunction1(getWithin), toQuery = js.Any.fromFunction0(toQuery))
    __obj.asInstanceOf[Executable[T]]
  }
  @scala.inline
  implicit class ExecutableOps[Self[t] <: Executable[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAll(value: () => typingsSlinky.bluebird.mod.^[js.Array[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAllWithin(value: DatabaseConnection => typingsSlinky.bluebird.mod.^[js.Array[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allWithin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExec(value: () => typingsSlinky.bluebird.mod.^[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExecWithin(value: DatabaseConnection => typingsSlinky.bluebird.mod.^[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execWithin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: () => typingsSlinky.bluebird.mod.^[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWithin(value: DatabaseConnection => typingsSlinky.bluebird.mod.^[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWithin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToQuery(value: () => QueryLike): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toQuery")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

