package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.RenameMaterializedViewColumnFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameMaterializedViewColumnFn extends js.Object {
  
  def reverse(
    viewName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    columnName: String,
    newColumnName: String
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameMaterializedViewColumnFn = js.native
}
