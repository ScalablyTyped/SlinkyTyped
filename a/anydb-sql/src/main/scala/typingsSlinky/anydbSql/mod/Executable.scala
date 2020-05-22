package typingsSlinky.anydbSql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Executable[T] extends js.Object {
  def all(): typingsSlinky.bluebird.mod.^[js.Array[T]]
  def allWithin(tx: DatabaseConnection): typingsSlinky.bluebird.mod.^[js.Array[T]]
  def exec(): typingsSlinky.bluebird.mod.^[Unit]
  def execWithin(tx: DatabaseConnection): typingsSlinky.bluebird.mod.^[Unit]
  def get(): typingsSlinky.bluebird.mod.^[T]
  def getWithin(tx: DatabaseConnection): typingsSlinky.bluebird.mod.^[T]
  def toQuery(): QueryLike
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
}

