package typingsSlinky.anydbSql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateQuery extends Executable[Unit] {
  
  def ifNotExists(): Executable[Unit] = js.native
}
object CreateQuery {
  
  @scala.inline
  def apply(
    all: () => typingsSlinky.bluebird.mod.^[js.Array[Unit]],
    allWithin: DatabaseConnection => typingsSlinky.bluebird.mod.^[js.Array[Unit]],
    exec: () => typingsSlinky.bluebird.mod.^[Unit],
    execWithin: DatabaseConnection => typingsSlinky.bluebird.mod.^[Unit],
    get: () => typingsSlinky.bluebird.mod.^[Unit],
    getWithin: DatabaseConnection => typingsSlinky.bluebird.mod.^[Unit],
    ifNotExists: () => Executable[Unit],
    toQuery: () => QueryLike
  ): CreateQuery = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allWithin = js.Any.fromFunction1(allWithin), exec = js.Any.fromFunction0(exec), execWithin = js.Any.fromFunction1(execWithin), get = js.Any.fromFunction0(get), getWithin = js.Any.fromFunction1(getWithin), ifNotExists = js.Any.fromFunction0(ifNotExists), toQuery = js.Any.fromFunction0(toQuery))
    __obj.asInstanceOf[CreateQuery]
  }
  
  @scala.inline
  implicit class CreateQueryMutableBuilder[Self <: CreateQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIfNotExists(value: () => Executable[Unit]): Self = StObject.set(x, "ifNotExists", js.Any.fromFunction0(value))
  }
}
