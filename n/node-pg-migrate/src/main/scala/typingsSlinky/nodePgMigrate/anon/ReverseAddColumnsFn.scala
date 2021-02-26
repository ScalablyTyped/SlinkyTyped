package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
import typingsSlinky.nodePgMigrate.generalTypesMod.IfNotExistsOption
import typingsSlinky.nodePgMigrate.tablesTypesMod.AddColumnsFn
import typingsSlinky.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseAddColumnsFn extends StObject {
  
  def reverse(tableName: typingsSlinky.nodePgMigrate.generalTypesMod.Name, newColumns: ColumnDefinitions): String | js.Array[String] = js.native
  def reverse(
    tableName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    newColumns: ColumnDefinitions,
    addOptions: IfNotExistsOption with DropOptions
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: AddColumnsFn = js.native
}
