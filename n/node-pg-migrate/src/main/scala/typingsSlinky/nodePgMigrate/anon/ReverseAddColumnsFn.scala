package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
import typingsSlinky.nodePgMigrate.generalTypesMod.IfNotExistsOption
import typingsSlinky.nodePgMigrate.tablesTypesMod.AddColumnsFn
import typingsSlinky.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseAddColumnsFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: AddColumnsFn = js.native
  def reverse(tableName: typingsSlinky.nodePgMigrate.generalTypesMod.Name, newColumns: ColumnDefinitions): String | js.Array[String] = js.native
  def reverse(
    tableName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    newColumns: ColumnDefinitions,
    addOptions: IfNotExistsOption with DropOptions
  ): String | js.Array[String] = js.native
}

