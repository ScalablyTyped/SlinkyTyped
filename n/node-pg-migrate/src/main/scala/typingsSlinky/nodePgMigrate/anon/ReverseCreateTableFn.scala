package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
import typingsSlinky.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import typingsSlinky.nodePgMigrate.tablesTypesMod.CreateTableFn
import typingsSlinky.nodePgMigrate.tablesTypesMod.TableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreateTableFn extends js.Object {
  
  def reverse(tableName: typingsSlinky.nodePgMigrate.generalTypesMod.Name, columns: ColumnDefinitions): String | js.Array[String] = js.native
  def reverse(
    tableName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    columns: ColumnDefinitions,
    options: TableOptions with DropOptions
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreateTableFn = js.native
}
