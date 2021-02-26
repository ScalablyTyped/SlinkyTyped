package typingsSlinky.anydbSql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class DropQueryMutableBuilder[Self <: DropQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIfExists(value: () => Executable[Unit]): Self = StObject.set(x, "ifExists", js.Any.fromFunction0(value))
  }
}
