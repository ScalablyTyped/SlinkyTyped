package typingsSlinky.keya

import typingsSlinky.sqlite.sqlite3Mod.Database
import typingsSlinky.sqlite.sqlite3Mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("keya/out/node/sqlite", JSImport.Namespace)
@js.native
object sqliteMod extends js.Object {
  
  @js.native
  trait SQLiteStore[T]
    extends typingsSlinky.keya.storeMod.default[T] {
    
    var db: typingsSlinky.sqlite.mod.Database[Database, Statement] = js.native
    
    var file: String = js.native
    
    var statements: js.Any = js.native
  }
  
  @js.native
  class default[T] () extends SQLiteStore[T]
  /* static members */
  @js.native
  object default extends js.Object {
    
    def stores(): js.Promise[js.Array[String]] = js.native
  }
}
