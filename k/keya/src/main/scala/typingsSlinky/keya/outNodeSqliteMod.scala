package typingsSlinky.keya

import typingsSlinky.keya.outNodeSqliteMod.SQLiteStore
import typingsSlinky.sqlite.sqliteMod.Database
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keya/out/node/sqlite", JSImport.Namespace)
@js.native
object outNodeSqliteMod extends js.Object {
  @js.native
  trait SQLiteStore
    extends typingsSlinky.keya.outCoreStoreMod.default {
    var db: Database = js.native
    var file: String = js.native
    var statements: js.Any = js.native
  }
  
  @js.native
  class default () extends SQLiteStore
  
  /* static members */
  @js.native
  object default extends js.Object {
    def stores(): js.Promise[js.Array[String]] = js.native
  }
  
}

