package typingsSlinky.datastoreLevel.mod

import typingsSlinky.abstractLeveldown.mod.AbstractIterator
import typingsSlinky.abstractLeveldown.mod.AbstractLevelDOWN
import typingsSlinky.interfaceDatastore.mod.Batch
import typingsSlinky.interfaceDatastore.mod.Datastore
import typingsSlinky.interfaceDatastore.mod.Key
import typingsSlinky.interfaceDatastore.mod.Query
import typingsSlinky.interfaceDatastore.mod.Result
import typingsSlinky.levelup.mod.LevelUp
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LevelDatastore[Value] extends Datastore[Value] {
  
  var db: LevelUp[AbstractLevelDOWN[String, Value], AbstractIterator[String, Value]] = js.native
}
object LevelDatastore {
  
  @scala.inline
  def apply[Value](
    batch: () => Batch[Value],
    close: () => js.Promise[Unit],
    db: LevelUp[AbstractLevelDOWN[String, Value], AbstractIterator[String, Value]],
    delete: Key => js.Promise[Unit],
    get: Key => js.Promise[Value],
    has: Key => js.Promise[Boolean],
    open: () => js.Promise[Unit],
    put: (Key, Value) => js.Promise[Unit],
    query: Query[Value] => AsyncIterable[Result[Value]]
  ): LevelDatastore[Value] = {
    val __obj = js.Dynamic.literal(batch = js.Any.fromFunction0(batch), close = js.Any.fromFunction0(close), db = db.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), open = js.Any.fromFunction0(open), put = js.Any.fromFunction2(put), query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[LevelDatastore[Value]]
  }
  
  @scala.inline
  implicit class LevelDatastoreOps[Self <: LevelDatastore[_], Value] (val x: Self with LevelDatastore[Value]) extends AnyVal {
    
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
    def setDb(value: LevelUp[AbstractLevelDOWN[String, Value], AbstractIterator[String, Value]]): Self = this.set("db", value.asInstanceOf[js.Any])
  }
}
