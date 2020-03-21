package typingsSlinky.keya

import typingsSlinky.sqlite.mod.Database
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keya/out/node/sqlite", JSImport.Namespace)
@js.native
object sqliteMod extends js.Object {
  @js.native
  trait SQLiteStore
    extends typingsSlinky.keya.storeMod.default {
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

