package typingsSlinky.keya

import typingsSlinky.sqlite.sqlite3Mod.Database
import typingsSlinky.sqlite.sqlite3Mod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqliteMod {
  
  @JSImport("keya/out/node/sqlite", JSImport.Default)
  @js.native
  class default[T] () extends SQLiteStore[T]
  /* static members */
  object default {
    
    @JSImport("keya/out/node/sqlite", "default.stores")
    @js.native
    def stores(): js.Promise[js.Array[String]] = js.native
  }
  
  @js.native
  trait SQLiteStore[T]
    extends typingsSlinky.keya.storeMod.default[T] {
    
    var db: typingsSlinky.sqlite.mod.Database[Database, Statement] = js.native
    
    var file: String = js.native
    
    var statements: js.Any = js.native
  }
}
