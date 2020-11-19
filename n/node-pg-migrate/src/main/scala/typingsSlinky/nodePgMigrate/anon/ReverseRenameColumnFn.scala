package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.tablesTypesMod.RenameColumnFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameColumnFn extends js.Object {
  
  def reverse(
    tableName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    oldColumnName: String,
    newColumnName: String
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameColumnFn = js.native
}
