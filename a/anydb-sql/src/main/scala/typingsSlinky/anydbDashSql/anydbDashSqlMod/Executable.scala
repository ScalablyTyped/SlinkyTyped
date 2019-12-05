package typingsSlinky.anydbDashSql.anydbDashSqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Executable[T] extends js.Object {
  def all(): typingsSlinky.bluebird.bluebirdMod.^[js.Array[T]]
  def allWithin(tx: DatabaseConnection): typingsSlinky.bluebird.bluebirdMod.^[js.Array[T]]
  def exec(): typingsSlinky.bluebird.bluebirdMod.^[Unit]
  def execWithin(tx: DatabaseConnection): typingsSlinky.bluebird.bluebirdMod.^[Unit]
  def get(): typingsSlinky.bluebird.bluebirdMod.^[T]
  def getWithin(tx: DatabaseConnection): typingsSlinky.bluebird.bluebirdMod.^[T]
  def toQuery(): QueryLike
}

object Executable {
  @scala.inline
  def apply[T](
    all: () => typingsSlinky.bluebird.bluebirdMod.^[js.Array[T]],
    allWithin: DatabaseConnection => typingsSlinky.bluebird.bluebirdMod.^[js.Array[T]],
    exec: () => typingsSlinky.bluebird.bluebirdMod.^[Unit],
    execWithin: DatabaseConnection => typingsSlinky.bluebird.bluebirdMod.^[Unit],
    get: () => typingsSlinky.bluebird.bluebirdMod.^[T],
    getWithin: DatabaseConnection => typingsSlinky.bluebird.bluebirdMod.^[T],
    toQuery: () => QueryLike
  ): Executable[T] = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allWithin = js.Any.fromFunction1(allWithin), exec = js.Any.fromFunction0(exec), execWithin = js.Any.fromFunction1(execWithin), get = js.Any.fromFunction0(get), getWithin = js.Any.fromFunction1(getWithin), toQuery = js.Any.fromFunction0(toQuery))
  
    __obj.asInstanceOf[Executable[T]]
  }
}

