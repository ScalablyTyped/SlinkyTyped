package typingsSlinky.anydbSql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Executable[T] extends StObject {
  
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
  implicit class ExecutableMutableBuilder[Self <: Executable[_], T] (val x: Self with Executable[T]) extends AnyVal {
    
    @scala.inline
    def setAll(value: () => typingsSlinky.bluebird.mod.^[js.Array[T]]): Self = StObject.set(x, "all", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAllWithin(value: DatabaseConnection => typingsSlinky.bluebird.mod.^[js.Array[T]]): Self = StObject.set(x, "allWithin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExec(value: () => typingsSlinky.bluebird.mod.^[Unit]): Self = StObject.set(x, "exec", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExecWithin(value: DatabaseConnection => typingsSlinky.bluebird.mod.^[Unit]): Self = StObject.set(x, "execWithin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: () => typingsSlinky.bluebird.mod.^[T]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWithin(value: DatabaseConnection => typingsSlinky.bluebird.mod.^[T]): Self = StObject.set(x, "getWithin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToQuery(value: () => QueryLike): Self = StObject.set(x, "toQuery", js.Any.fromFunction0(value))
  }
}
