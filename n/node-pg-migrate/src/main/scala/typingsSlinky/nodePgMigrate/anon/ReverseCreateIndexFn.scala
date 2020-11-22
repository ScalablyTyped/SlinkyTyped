package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.indexesTypesMod.CreateIndexFn
import typingsSlinky.nodePgMigrate.indexesTypesMod.CreateIndexOptions
import typingsSlinky.nodePgMigrate.indexesTypesMod.DropIndexOptions
import typingsSlinky.nodePgMigrate.indexesTypesMod.IndexColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreateIndexFn extends js.Object {
  
  def reverse(tableName: typingsSlinky.nodePgMigrate.generalTypesMod.Name, columns: String): String | js.Array[String] = js.native
  def reverse(
    tableName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    columns: String,
    options: CreateIndexOptions with DropIndexOptions
  ): String | js.Array[String] = js.native
  def reverse(
    tableName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    columns: js.Array[String | IndexColumn]
  ): String | js.Array[String] = js.native
  def reverse(
    tableName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    columns: js.Array[String | IndexColumn],
    options: CreateIndexOptions with DropIndexOptions
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreateIndexFn = js.native
}
