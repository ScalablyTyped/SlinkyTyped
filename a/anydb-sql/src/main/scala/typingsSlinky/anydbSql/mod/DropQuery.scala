package typingsSlinky.anydbSql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropQuery extends Executable[Unit] {
  def ifExists(): Executable[Unit] = js.native
}

object DropQuery {
  @scala.inline
  def apply(
    all: () => typingsSlinky.bluebird.mod.^[js.Array[Unit]],
    allWithin: DatabaseConnection => typingsSlinky.bluebird.mod.^[js.Array[Unit]],
    exec: () => typingsSlinky.bluebird.mod.^[Unit],
    execWithin: DatabaseConnection => typingsSlinky.bluebird.mod.^[Unit],
    get: () => typingsSlinky.bluebird.mod.^[Unit],
    getWithin: DatabaseConnection => typingsSlinky.bluebird.mod.^[Unit],
    ifExists: () => Executable[Unit],
    toQuery: () => QueryLike
  ): DropQuery = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allWithin = js.Any.fromFunction1(allWithin), exec = js.Any.fromFunction0(exec), execWithin = js.Any.fromFunction1(execWithin), get = js.Any.fromFunction0(get), getWithin = js.Any.fromFunction1(getWithin), ifExists = js.Any.fromFunction0(ifExists), toQuery = js.Any.fromFunction0(toQuery))
    __obj.asInstanceOf[DropQuery]
  }
  @scala.inline
  implicit class DropQueryOps[Self <: DropQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIfExists(value: () => Executable[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifExists")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

