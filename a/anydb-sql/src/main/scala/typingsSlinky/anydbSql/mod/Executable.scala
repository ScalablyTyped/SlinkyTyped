package typingsSlinky.anydbSql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ExecutableOps[Self <: Executable[_], T] (val x: Self with Executable[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAll(value: () => typingsSlinky.bluebird.mod.^[js.Array[T]]): Self = this.set("all", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAllWithin(value: DatabaseConnection => typingsSlinky.bluebird.mod.^[js.Array[T]]): Self = this.set("allWithin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExec(value: () => typingsSlinky.bluebird.mod.^[Unit]): Self = this.set("exec", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExecWithin(value: DatabaseConnection => typingsSlinky.bluebird.mod.^[Unit]): Self = this.set("execWithin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: () => typingsSlinky.bluebird.mod.^[T]): Self = this.set("get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWithin(value: DatabaseConnection => typingsSlinky.bluebird.mod.^[T]): Self = this.set("getWithin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToQuery(value: () => QueryLike): Self = this.set("toQuery", js.Any.fromFunction0(value))
  }
}
